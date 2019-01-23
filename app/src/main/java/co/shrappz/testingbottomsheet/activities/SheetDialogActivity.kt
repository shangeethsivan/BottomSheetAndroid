package co.shrappz.testingbottomsheet.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomSheetDialog
import android.widget.Button
import co.shrappz.testingbottomsheet.R

class SheetDialogActivity : AppCompatActivity() {

    var bottomSheetDialog: BottomSheetDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sheet_dialog)

        var btn = findViewById<Button>(R.id.testing_bottom_sheet_btn);
        btn.setOnClickListener {
            showOrHideDialog()
        }
    }

    private fun showOrHideDialog() {
        if(bottomSheetDialog == null){
            bottomSheetDialog = BottomSheetDialog(this)
            bottomSheetDialog!!.setContentView(R.layout.sheet_container)
        }
        if(bottomSheetDialog!!.isShowing()) {
            bottomSheetDialog!!.dismiss()
        }else{
            bottomSheetDialog!!.show()
        }
    }
}
