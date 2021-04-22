package com.example.test21

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_java.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)      //java 에서 find viewid 가져오던 것과 다르게 여기서 알아서 찾아줌

        /*imeOptions : 텍스트 입력 옵션
        * EditorInfo.~ : 키보드 우측 아래 버튼클릭시 액션을 설정가능*/
       //et_email.imeOptions = EditorInfo.IME_ACTION_SEND  => 문자 보내기형태
       // et_age.imeOptions = EditorInfo.IME_ACTION_PREVIOUS  => 이전필드로
        //et_password.imeOptions = EditorInfo.IME_ACTION_NONE  => 특별한 의미없음. 다음칸으로 이동되기는 함
        //   et_name.imeOptions = EditorInfo.IME_ACTION_DONE => 완료버튼



        /*마지막 확인 (edittext 완료 버튼 클릭시) 자동으로 로그인 되도록 하기
        * */
        et_age.setOnEditorActionListener { v, actionId, event ->


            if(actionId == EditorInfo.IME_ACTION_DONE){
                /* 왜 IME_ACTION_DONE 인지?
                =>
                activity_main에서 필드의 순서를 변경해본 결과
                맨 마지막 필드는 특별한 imeOptions 설정을 하지않아도
                자동으로 IME_ACTION_DONE(완료버튼)으로 설정되는 듯*//*
                 */
                Login(v)
                true
            }
            else false

            /*if else 로 완료버튼인지 확인하지 않고 바로 한다면? => 가능*/
            /*Login(v)
            true*/


        }

        //자동로그인 불러오기
        var pref = this.getPreferences(0)
        et_email.setText(pref.getString("이메일", ""))   /*text를 쓰면 오류*/
        et_password.setText(pref.getString("비밀번호", ""))
        et_name.setText(pref.getString("이름", ""))
        et_age.setText(pref.getString("나이", ""))


    }

    fun Login(v : View) {
        /*키보드 숨기기*/
        /*INPUT_METHOD_SERVICE ( 입력함수를 관리하는 서비스 ) 를 가져와서 InputMethodManager 로 변환
        * hideSoftInputFromWindow : 키보드 내리기
        * showSoftInputFromWindow : 키보드 올리기 */
        var imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(v.windowToken, 0)


        /*println("성공")*/
        /*로그인 입력정보 비교 :해당부분을 파이어베이스와 같은 디비와 같으면 연결됨*/
        if(et_email.text.toString() == "test21@gmail.com"
                && et_password.text.toString() == "1234"
                && et_name.text.toString() == "코틀린"
                && et_age.text.toString() == "25") {
            Toast.makeText(this, "로그인성공!", Toast.LENGTH_SHORT).show()

            /*로그인 성공 후 다음 페이지 이동
            - activity_java로 이동해봄. 기본적으로 layout으로만 이동하지는 못하므로 JavaActivity로 이동
            ::이 두개 = class.java (단 class.kotlin은 없음 kotlin도 java로 불러옴)

            */
            setContentView(R.layout.activity_java)
            tv_result.text = "코틀린님 환영합니다"
            //startActivity(Intent(this, JavaActivity::class.java))
            //intent.putExtra("이름", "코틀린")
            //startActivity(intent)

            //if(intent.hasExtra("이름")) tv_result.text = intent.getStringExtra("이름") + "환영합니다다"

            /*자동로그인 저장*/
            var editor =  this.getPreferences(0).edit()
            editor.putString("이메일","test21@gmail.com").apply()
            editor.putString("비밀번호","1234").apply()
            editor.putString("이름","코틀린").apply()
            editor.putString("나이","25m").apply()


       }
            else Toast.makeText(this,"로그인실패ㅜ",Toast.LENGTH_SHORT).show()

    }

}