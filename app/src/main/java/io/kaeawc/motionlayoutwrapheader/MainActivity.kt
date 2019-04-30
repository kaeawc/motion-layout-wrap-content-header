package io.kaeawc.motionlayoutwrapheader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler_view?.adapter = WidgetAdapter()

        motion_root?.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {}
            override fun onTransitionStarted(motionLayout: MotionLayout?, startId: Int, endId: Int) {
                Timber.d("started")
            }
            override fun onTransitionChange(motionLayout: MotionLayout?, startId: Int, endId: Int, progress: Float) {
                Timber.d("progress $progress")
            }
            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                Timber.d("completed")
            }
        })
    }
}
