package com.polatic.alfironi.animation.animation;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

public class UtilAnimation {

	/*
	 * zoom in animation from ScaleAnimation
	 */
	public Animation scaleZoomIn() {
		Animation zoomIn = new ScaleAnimation((float) 1, (float) 2, (float) 1,
				(float) 2, Animation.RELATIVE_TO_SELF, (float) 0.5,
				Animation.RELATIVE_TO_SELF, (float) 0.5);
		zoomIn.setFillAfter(true);
		zoomIn.setDuration(5000);
		return zoomIn;
	}

	/*
	 * zoom out animation from ScaleAnimation
	 */
	public Animation scaleZoomOut() {
		Animation zoomOut = new ScaleAnimation((float) 2, (float) 1, (float) 2,
				(float) 1, Animation.RELATIVE_TO_SELF, (float) 0.5,
				Animation.RELATIVE_TO_SELF, (float) 0.5);
		zoomOut.setFillAfter(true);
		zoomOut.setDuration(5000);
		return zoomOut;
	}

	/*
	 * animation how to make image move in from right to left
	 */
	public Animation moveLeft() {
		Animation animation = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, +1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		animation.setDuration(2500);
		animation.setFillAfter(true);
		return animation;
	}

	/*
	 * animation how to make image move out to left
	 */
	public Animation outLeft() {
		Animation animation = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, -1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		animation.setDuration(2500);
		animation.setFillAfter(true);
		return animation;
	}

	/*
	 * animation how to make image move out to right
	 */
	public Animation outRight() {
		Animation animation = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, +1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		animation.setDuration(2500);
		animation.setFillAfter(true);
		return animation;
	}

	/*
	 * animation how to make image move in from left
	 */
	public Animation moveRight() {
		Animation animation = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, -1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		animation.setDuration(2500);
		animation.setFillAfter(true);
		return animation;
	}

}
