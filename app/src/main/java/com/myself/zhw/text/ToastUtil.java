package com.myself.zhw.text;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by zhenghongwu on 2017/7/18.
 */
public class ToastUtil {
    private Toast toast;
    private LinearLayout toastView;

    /**
     * 没有参数的构造方法
     */
    public ToastUtil() {

    }

    /**
     * 完全自定义布局Toast的构造方法
     * @param context
     * @param view
     */
    public ToastUtil(Context context, View view, int duration){
        toast=new Toast(context);
        toast.setView(view);
        toast.setDuration(duration);
    }

    /**
     * 向Toast中添加自定义view
     * @param view
     * @param postion
     * @return
     */
    public  ToastUtil addView(View view, int postion) {
        toastView = (LinearLayout) toast.getView();
        toastView.addView(view, postion);

        return this;
    }

    /**
     * 设置Toast全部的背景颜色
     * @param backgroundColor
     * @return
     */
    public ToastUtil setToastAllBackgroundColor(int backgroundColor) {
        View view = toast.getView();
        if(view!=null){
            view.setBackgroundColor(backgroundColor);//整个Toast的背景颜色
        }
        return this;
    }

    /**
     * 设置Toast全部的背景图片
     * @param background
     * @return
     */
    public ToastUtil setToastAllBackground(int background) {
        View view = toast.getView();
        if(view!=null){
            view.setBackgroundResource(background);//整个Toast的背景图片
        }
        return this;
    }



    /**
     * 设置Toast字体颜色及text文本框的局部背景颜色
     * @param messageColor
     * @param backgroundColor
     * @return
     */
    public ToastUtil setToastColor(int messageColor, int backgroundColor) {
        View view = toast.getView();
        if(view!=null){
            TextView message=((TextView) view.findViewById(android.R.id.message));
            message.setBackgroundColor(backgroundColor);//背景颜色setToastColor(Color.BLUE,getResources().getColor(R.color.colorAccent)).show();
            message.setTextColor(messageColor);//字体颜色
        }
        return this;
    }

    /**
     * 设置Toast字体及text局部背景图片
     * @param messageColor
     * @param background
     * @return
     */
    public ToastUtil setToastBackground(int messageColor, int background) {
        View view = toast.getView();
        if(view!=null){
            TextView message=((TextView) view.findViewById(android.R.id.message));
            message.setBackgroundResource(background);//背景图片
            message.setTextColor(messageColor);//字体颜色
        }
        return this;
    }

    /**
     * 短时间显示Toast,message是直接传过来的字符串文字
     */
    public  ToastUtil Short(Context context, CharSequence message){
        if(toast==null||(toastView!=null&&toastView.getChildCount()>1)){
            toast= Toast.makeText(context, message, Toast.LENGTH_SHORT);
            toastView=null;
        }else{
            toast.setText(message);
            toast.setDuration(Toast.LENGTH_SHORT);
        }
        return this;
    }

    /**
     * 短时间显示Toast,message是在R.string...中的文字描述
     */
    public ToastUtil Short(Context context, int message) {
        if(toast==null||(toastView!=null&&toastView.getChildCount()>1)){
            toast= Toast.makeText(context, message, Toast.LENGTH_SHORT);
            toastView=null;
        }else{
            toast.setText(message);
            toast.setDuration(Toast.LENGTH_SHORT);
        }
        return this;
    }

    /**
     * 长时间显示Toast
     */
    public ToastUtil Long(Context context, CharSequence message){
        if(toast==null||(toastView!=null&&toastView.getChildCount()>1)){
            toast= Toast.makeText(context, message, Toast.LENGTH_LONG);
            toastView=null;
        }else{
            toast.setText(message);
            toast.setDuration(Toast.LENGTH_LONG);
        }
        return this;
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public ToastUtil Long(Context context, int message) {
        if(toast==null||(toastView!=null&&toastView.getChildCount()>1)){
            toast= Toast.makeText(context, message, Toast.LENGTH_LONG);
            toastView=null;
        }else{
            toast.setText(message);
            toast.setDuration(Toast.LENGTH_LONG);
        }
        return this;
    }

    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public ToastUtil Indefinite(Context context, CharSequence message, int duration) {
        if(toast==null||(toastView!=null&&toastView.getChildCount()>1)){
            toast= Toast.makeText(context, message,duration);
            toastView=null;
        }else{
            toast.setText(message);
            toast.setDuration(duration);
        }
        return this;
    }

    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public ToastUtil Indefinite(Context context, int message, int duration) {
        if(toast==null||(toastView!=null&&toastView.getChildCount()>1)){
            toast= Toast.makeText(context, message,duration);
            toastView=null;
        }else{
            toast.setText(message);
            toast.setDuration(duration);
        }
        return this;
    }

    /**
     * 显示Toast
     * @return
     */
    public ToastUtil show (){
        //显示之前应该判断下当前是否有Toast在显示，要是有的话就不显示，没有才显示
            toast.show();
        return this;
    }

    /**
     * 获取Toast
     * @return
     */
    public Toast getToast(){
        return toast;
    }

}
