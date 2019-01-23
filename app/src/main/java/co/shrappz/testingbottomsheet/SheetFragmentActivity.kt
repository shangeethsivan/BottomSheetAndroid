package co.shrappz.testingbottomsheet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomSheetDialogFragment
import android.widget.Button

class SheetFragmentActivity : AppCompatActivity() {

    var sheetFragment: BottomSheetDialogFragment ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sheet_fragment)


        var btn = findViewById<Button>(R.id.testing_bottom_sheet_btn);
        btn.setOnClickListener {
            showOrHideDialogFragment()
        }
    }

    private fun showOrHideDialogFragment() {
        if(sheetFragment == null){
            sheetFragment = SheetDialogFragment()
        }
        sheetFragment!!.show(supportFragmentManager,sheetFragment!!.tag)
    }
}
