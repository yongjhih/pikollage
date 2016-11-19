package pikollage

import android.content.Context
import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.facebook.drawee.backends.pipeline.Fresco
import com.infstory.v7.widget.ListRecyclerAdapter
import com.trello.rxlifecycle.components.support.RxFragment

import javax.inject.Inject

import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * A fragment representing a list of Items.
 *
 *
 * Activities containing this fragment MUST implement the
 * interface.
 */
class MainFragment : RxFragment() {

    val TAG = MainActivity::class.java.name

    //@Inject lateinit var gitHub: GitHub

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_main, container, false) as RecyclerView

        // Inject gitHub with Dagger2Injection?
        App.mainComponent.inject(this)

        // TODO pull2refresh feature
        return view
    }
}

