package viewbase.app.demo.com.viewbaseapp.base.listview.model

import android.view.View
import viewbase.app.demo.com.viewbaseapp.base.listview.view.ViewAction
import viewbase.app.demo.com.viewbaseapp.base.listview.view.ViewSize
import viewbase.app.demo.com.viewbaseapp.base.listview.view.ViewSizer

class WidthViewSizer(val numCol: Int, val padding: Int = 0) : ViewSizer {
    override fun size(viewParentSize: ViewSize): ViewAction {
        return object : ViewAction {
            override fun action(view: View) {
                view.layoutParams.width = (viewParentSize.width / numCol) - (padding * 2)
            }
        }
    }
}