// Generated by view binder compiler. Do not edit!
package com.inovex.bikroyik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.inovex.bikroyik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddRetailerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout addRetailerViewPagerCountDots;

  @NonNull
  public final RelativeLayout addRetailerViewPagerIndicator;

  @NonNull
  public final ViewPager addRetailerVpTopViewPager;

  @NonNull
  public final TextView tvAddRetailer;

  private ActivityAddRetailerBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout addRetailerViewPagerCountDots,
      @NonNull RelativeLayout addRetailerViewPagerIndicator,
      @NonNull ViewPager addRetailerVpTopViewPager, @NonNull TextView tvAddRetailer) {
    this.rootView = rootView;
    this.addRetailerViewPagerCountDots = addRetailerViewPagerCountDots;
    this.addRetailerViewPagerIndicator = addRetailerViewPagerIndicator;
    this.addRetailerVpTopViewPager = addRetailerVpTopViewPager;
    this.tvAddRetailer = tvAddRetailer;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddRetailerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddRetailerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_retailer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddRetailerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addRetailerViewPagerCountDots;
      LinearLayout addRetailerViewPagerCountDots = rootView.findViewById(id);
      if (addRetailerViewPagerCountDots == null) {
        break missingId;
      }

      id = R.id.addRetailerViewPagerIndicator;
      RelativeLayout addRetailerViewPagerIndicator = rootView.findViewById(id);
      if (addRetailerViewPagerIndicator == null) {
        break missingId;
      }

      id = R.id.addRetailerVpTopViewPager;
      ViewPager addRetailerVpTopViewPager = rootView.findViewById(id);
      if (addRetailerVpTopViewPager == null) {
        break missingId;
      }

      id = R.id.tvAddRetailer;
      TextView tvAddRetailer = rootView.findViewById(id);
      if (tvAddRetailer == null) {
        break missingId;
      }

      return new ActivityAddRetailerBinding((LinearLayout) rootView, addRetailerViewPagerCountDots,
          addRetailerViewPagerIndicator, addRetailerVpTopViewPager, tvAddRetailer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
