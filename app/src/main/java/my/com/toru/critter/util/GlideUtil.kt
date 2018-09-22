package my.com.toru.critter.util

import android.graphics.drawable.ColorDrawable
import android.support.v4.content.ContextCompat
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import my.com.toru.critter.R

object GlideUtil {
    fun loadImage(url:String, imageView: ImageView){
        val ctx = imageView.context
        val cd = ColorDrawable(ContextCompat.getColor(ctx, R.color.background))
        Glide.with(ctx)
                .load(url)
                .apply(RequestOptions().useAnimationPool(true)
                        .centerCrop())
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(imageView)
    }
}