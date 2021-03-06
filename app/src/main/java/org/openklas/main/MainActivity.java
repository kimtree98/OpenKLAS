package org.openklas.main;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.github.windsekirun.daggerautoinject.InjectActivity;


import org.openklas.R;
import org.openklas.base.BaseActivity;
import org.openklas.databinding.MainActivityBinding;

/**
 * OpenKlas
 * Class: MainActivity
 * Created by limmoong on 2020/11/10.
 * <p>
 * Description:
 */

@InjectActivity
public class MainActivity extends BaseActivity<MainActivityBinding> {
	private MainViewModel mViewModel;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		mViewModel = getViewModel(MainViewModel.class);
		mBinding.setViewModel(mViewModel);
	}
}