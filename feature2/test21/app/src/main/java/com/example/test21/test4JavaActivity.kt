package com.example.test21

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class test4JavaActivity : AppCompatActivity() {

    /* var DataList = arrayListOf(
             Data(R.drawable.example_resize, "0번"),
             Data(R.drawable.example_resize, "1번"),
             Data(R.drawable.example_resize, "2번"),
             Data(R.drawable.example_resize, "3번")

     )*/
    /*단 Listview는 수가 많아지면 한꺼번에 다 출력을 해야하기 때문에 속도가 느려지는 단점이 있음.

    * 이를 대신해서 사용되는게 recyclerViewdla.
    한꺼번에 다 출력되는게 아니라 위에서 사용된 리스트를 밑에서 재활용하는 방식.*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)      //java 에서 find viewid 가져오던 것과 다르게 여기서 알아서 찾아줌

        /*edittext에 글자를 입력할 때 하나하나 로그에 표시*/


        /*  et.addTextChangedListener(object  : TextWatcher{
              override fun afterTextChanged(p0: Editable?) {
                  println("입력끝 " + p0)
              }
              override fun beforeTextChanged(p0: CharSequence?, start: Int, count: Int, after: Int) {
                  println("입력전 " + p0)
              }
              override fun onTextChanged(p0: CharSequence?, start: Int, before: Int, count: Int) {
                  println("입력중 " + p0)
              }

          })*/
        //Click(btn_1)

        /*val item = arrayOf("0번", "1번", "2번", "3번", "4번", "5번", "6번", "7번", "8번", "9번", "10번")
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,item)

        listView.onItemClickListener = AdapterView.OnItemClickListener{parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position)
            Toast.makeText(this, selectItem.toString(), Toast.LENGTH_SHORT).show()*/



        /*listView.adapter = CustomAdapter(this, DataList)

         listView.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->
         val selectItem = parent.getItemAtPosition(position) as Data
         Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()*/

        recyclerView.layoutManager = LinearLayoutManager(this)



    }
}

/*fun Click(v: View){
    iv_1.visibility_ = View.INVISIBLE
    iv_2.visibility_ = View.INVISIBLE

    iv_3.visibility_ = View.INVISIBLE

    when(v) {
        btn_1 -> iv_1.visibility = View.VISIBLE
        btn_2 -> iv_2.visibility = View.VISIBLE
        btn_3 -> iv_3.visibility = View.VISIBLE
    }
}

fun LoadImage(v : View){
    startActivityForResult(Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI), 0)
}

override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data : Intent?)

    if(data != null)
}*/
/*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java)*/

        /*비효율적*/
        //TextView tv_result = findViewById(R.id.tv_result)
        //tv_result.setText(getIntent().getExtras().getString("이름") + "님 환영합니다.");

    }
}