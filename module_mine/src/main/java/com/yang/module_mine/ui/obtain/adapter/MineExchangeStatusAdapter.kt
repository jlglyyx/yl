package com.yang.module_mine.ui.obtain.adapter

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.yang.lib_common.room.entity.MineGoodsDetailData
import com.yang.module_mine.R

/**
 * @Author Administrator
 * @ClassName MineExchangeStatusAdapter
 * @Description
 * @Date 2021/9/10 11:13
 */
class MineExchangeStatusAdapter(layoutResId:Int , data: MutableList<MineGoodsDetailData>?) : BaseQuickAdapter<MineGoodsDetailData, BaseViewHolder>(layoutResId,data) {

    override fun convert(helper: BaseViewHolder, item: MineGoodsDetailData) {
        val imageView = helper.getView<ImageView>(R.id.iv_image)
        Glide.with(mContext)
            .load("https://img.alicdn.com/bao/uploaded/i2/2209667639897/O1CN015Oh5X32MysY6ea4fc_!!0-item_pic.jpg_200x200q90.jpg_.webp")
            .centerCrop()
            .error(R.drawable.iv_image_error)
            .placeholder(R.drawable.iv_image_placeholder)
            .into(imageView)
        helper.setText(R.id.tv_title, "官方正品彩虹皮")
            .setText(R.id.tv_price, "100积分")
            .setText(R.id.tv_name, "官方旗舰店-${item.content}")
    }
}