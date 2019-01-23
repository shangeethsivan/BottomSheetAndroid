package co.shrappz.testingbottomsheet

import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.support.design.widget.CoordinatorLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.LinearLayout



class MainActivity : AppCompatActivity() {


    lateinit var sheetBehavior: BottomSheetBehavior<*>

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = this.findViewById(R.id.testing_bottom_sheet_btn)

        btn.setOnClickListener {
            if (sheetBehavior.state != BottomSheetBehavior.STATE_EXPANDED) {
                sheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
                btn.text = "Close sheet"
            } else {
                sheetBehavior.state = BottomSheetBehavior.STATE_HIDDEN
                btn.text = "Expand sheet"
            }
        }

        val sheetContainer:LinearLayout= findViewById(R.id.bottom_sheet_container)
        sheetBehavior = BottomSheetBehavior.from<LinearLayout>(sheetContainer)
        sheetBehavior.isHideable = true
        sheetBehavior.state = BottomSheetBehavior.STATE_HIDDEN

    }
}
