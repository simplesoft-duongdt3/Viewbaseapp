package viewbase.app.demo.com.viewbaseapp.base.viewbase

import android.arch.lifecycle.LifecycleRegistry
import android.arch.lifecycle.LifecycleRegistryOwner
import android.os.Bundle
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.archlifecycle.ControllerLifecycleRegistryOwner
import com.bluelinelabs.conductor.archlifecycle.LifecycleController

abstract class ViewController(bundle: Bundle?) : Controller(bundle), LifecycleRegistryOwner {

    private val lifecycleRegistryOwner = ControllerLifecycleRegistryOwner(this)

    override fun getLifecycle(): LifecycleRegistry {
        return lifecycleRegistryOwner.lifecycle
    }

}