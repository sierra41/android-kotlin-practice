package com.example.test21

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class test5MainActivity : AppCompatActivity() {

   // var viewList = ArrayList<View>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //switch

        /*switch1.setOnCheckedChangeListener {compoundButton, b ->
            println(b)

        }*/



        /*viewList.add(layoutInflater.inflate(R.layout.fragment_home, null))
        viewList.add(layoutInflater.inflate(R.layout.fragment_favorite, null))
        viewList.add(layoutInflater.inflate(R.layout.fragment_profile, null))

        viewPager.adapter = pagerAdapter()

        tabLayout.setupWithViewPager(viewPager)
        tabLayout.getTabAt(0)?.setText("home")
        tabLayout.getTabAt(1)?.setText("Favorit")
        tabLayout.getTabAt(2)?.setText("Profile")
        tabLayout.getTabAt(0)?.setIcon(R.drawable.ic_launcher_background)
        tabLayout.getTabAt(1)?.setIcon(R.drawable.ic_launcher_foreground)
        tabLayout.getTabAt(2)?.setIcon(R.drawable.ic_launcher_background)*/

    }

 /*   inner class pagerAdapter : PagerAdapter() {

        override fun isViewFromObject(view: View, `object`: Any) = view == 'object'

        override fun getCount() = viewList.size

        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            var curView = viewList[position]
            viewPager.addView(curView)
            return curView

        }

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            viewPager.removeView('object' as View)
        }
    }*/
}