package pikollage

import android.net.Uri
import android.view.View
import android.widget.TextView

import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.view.DraweeView
import com.facebook.imagepipeline.request.ImageRequest
import com.infstory.v7.widget.Presenter

import kotterknife.bindView

class MainPresenter(itemView: View) : Presenter<MainFragment>(itemView) {
    val title: TextView by bindView(R.id.title)
    val imageView: DraweeView<*> by bindView(R.id.image)

    override fun onBind(position: Int, fragment: MainFragment) {
    }
}
