package co.shrappz.testingbottomsheet

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View


class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun bottomSheetBehaviourClicked(view : View){

        startActivity(Intent(this,BSBehaviourActivity::class.java))
    }
    fun bottomSheetDialogClicked(view : View){

        startActivity(Intent(this,SheetDialogActivity::class.java))
    }
    fun bottomSheetDialogFragmentClicked(view : View){

        startActivity(Intent(this,SheetFragmentActivity::class.java))
    }
}
