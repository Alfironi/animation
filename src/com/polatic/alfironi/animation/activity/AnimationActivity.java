package com.polatic.alfironi.animation.activity;


import com.polatic.alfironi.animation.animation.UtilAnimation;
import com.polatic.alfironi.animationdemo.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

public class AnimationActivity extends Activity implements AnimationListener {
	private ImageView mImage;
	private Animation mZoomIn, mZoomOut, mMoveRight, mMoveLeft,
			mOutRight, mOutLeft;

	UtilAnimation anim = new UtilAnimation();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_layout);
		mImage = (ImageView) findViewById(R.id.img);
		initAnimation();
		setRepeatAnimation();
		mImage.startAnimation(mZoomIn);
	}

	/*
	 * make object from animation that declare on class UtilAnimation
	 */
	private void initAnimation() {
		mZoomIn = anim.scaleZoomIn();
		mZoomOut = anim.scaleZoomOut();
		mMoveRight = anim.moveRight();
		mMoveLeft = anim.moveLeft();
		mOutRight = anim.outRight();
		mOutLeft = anim.outLeft();
	}

	/*
	 * set animation and change animation use animation listener and how to
	 * repeat, to change and repeat set another animation on method
	 * onAnimationEnd
	 */
	private void setRepeatAnimation() {
				mZoomIn.setAnimationListener(this);
		mZoomOut.setAnimationListener(this);
		mMoveLeft.setAnimationListener(this);
		mOutLeft.setAnimationListener(this);
		mMoveRight.setAnimationListener(this);
		mOutRight.setAnimationListener(this);
	}

	/*
	 * this method execute after the animation is end, so what you want to do
	 * after animation end write on this method.
	 */
	@Override
	public void onAnimationEnd(Animation animation) {
		if (animation == mZoomIn) {
			mImage.startAnimation(mZoomOut);
		} else if (animation == mZoomOut) {
			mImage.startAnimation(mMoveLeft);
		} else if (animation == mMoveLeft) {
			mImage.startAnimation(mOutLeft);
		} else if (animation == mOutLeft) {
			mImage.startAnimation(mMoveRight);
		} else if (animation == mMoveRight) {
			mImage.startAnimation(mOutRight);
		} else if (animation == mOutRight) {
			mImage.startAnimation(mZoomIn);
		} 
	}

	@Override
	public void onAnimationRepeat(Animation animation) {
	}

	@Override
	public void onAnimationStart(Animation animation) {
	}

}
