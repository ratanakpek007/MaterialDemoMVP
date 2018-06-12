package delivery.food.materialtablayout.mvp.main

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import delivery.food.materialtablayout.R
import delivery.food.materialtablayout.mvp.base.BaseActivity
import delivery.food.materialtablayout.mvp.main.presenter.MainPresenterImpl
import delivery.food.materialtablayout.mvp.main.presenter.MainPresenterWraper
import delivery.food.materialtablayout.mvp.main.view.MainViewResult
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : BaseActivity(), NavigationView.OnNavigationItemSelectedListener, MainViewResult {

    private lateinit var toggle: ActionBarDrawerToggle

    var mainPresenterWraper:MainPresenterWraper?=null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setSupportActionBar(toolbar)
        toggle = ActionBarDrawerToggle(this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp)
        nav_view.setNavigationItemSelectedListener(this)




        initPresenter()


        mainPresenterWraper!!.fetchByViewToPresenter("Hello, Ratanak")

    }

    /**
     * *******************************View Initialize Section*******************************/

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            R.id.home -> Toast.makeText(this, "Home", Toast.LENGTH_LONG).show()
            R.id.general -> Toast.makeText(this, "General", Toast.LENGTH_LONG).show()
            R.id.pending -> Toast.makeText(this, "Pending", Toast.LENGTH_LONG).show()
            R.id.logout -> Toast.makeText(this, "Logout", Toast.LENGTH_LONG).show()
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> Toast.makeText(this, "Home", Toast.LENGTH_LONG).show()
            R.id.general -> Toast.makeText(this, "General", Toast.LENGTH_LONG).show()
            R.id.pending -> Toast.makeText(this, "Pending", Toast.LENGTH_LONG).show()
            R.id.logout -> Toast.makeText(this, "Logout", Toast.LENGTH_LONG).show()
        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }



    /**
     * *******************************Login Section*******************************/

    private fun initPresenter(){
        mainPresenterWraper= MainPresenterImpl(this)
    }






    override fun onMessageSuccessPresenterToView(msg: String) {
        Toast.makeText(this, "$msg", Toast.LENGTH_SHORT).show()
    }

    override fun onMessageFailPresenterToView(msg: String) {
        Toast.makeText(this, "$msg", Toast.LENGTH_SHORT).show()
    }
}
