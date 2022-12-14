// Generated by view binder compiler. Do not edit!
package com.inovex.bikroyik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.inovex.bikroyik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FeatureItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ConstraintLayout consLayoutFeatureItem;

  @NonNull
  public final ImageView iconHomeBtn;

  @NonNull
  public final ImageView imgFeature;

  @NonNull
  public final TextView tvFeatureTitle;

  private FeatureItemBinding(@NonNull CardView rootView,
      @NonNull ConstraintLayout consLayoutFeatureItem, @NonNull ImageView iconHomeBtn,
      @NonNull ImageView imgFeature, @NonNull TextView tvFeatureTitle) {
    this.rootView = rootView;
    this.consLayoutFeatureItem = consLayoutFeatureItem;
    this.iconHomeBtn = iconHomeBtn;
    this.imgFeature = imgFeature;
    this.tvFeatureTitle = tvFeatureTitle;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static FeatureItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FeatureItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.feature_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FeatureItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.consLayout_featureItem;
      ConstraintLayout consLayoutFeatureItem = rootView.findViewById(id);
      if (consLayoutFeatureItem == null) {
        break missingId;
      }

      id = R.id.icon_home_btn;
      ImageView iconHomeBtn = rootView.findViewById(id);
      if (iconHomeBtn == null) {
        break missingId;
      }

      id = R.id.img_feature;
      ImageView imgFeature = rootView.findViewById(id);
      if (imgFeature == null) {
        break missingId;
      }

      id = R.id.tv_feature_title;
      TextView tvFeatureTitle = rootView.findViewById(id);
      if (tvFeatureTitle == null) {
        break missingId;
      }

      return new FeatureItemBinding((CardView) rootView, consLayoutFeatureItem, iconHomeBtn,
          imgFeature, tvFeatureTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
