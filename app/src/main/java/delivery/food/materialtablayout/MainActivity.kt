package delivery.food.materialtablayout

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * 1
         * */
        /*  setSupportActionBar(toolbar)
          toolbar.title="I am second"
          //supportActionBar!!.title="Toolbar Demo"

          if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
              toolbar.elevation=10f
          } else {

          }*/


        setSupportActionBar(toolbar)
        toggle = ActionBarDrawerToggle(this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp)
        nav_view.setNavigationItemSelectedListener(this)


    }


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

}
