// Generated by view binder compiler. Do not edit!
package com.inovex.bikroyik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.inovex.bikroyik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEditHomepageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView homePageItems;

  @NonNull
  public final ProgressBar progressBarEtt;

  @NonNull
  public final EditPageToolbarBinding toolbar;

  @NonNull
  public final View view;

  private ActivityEditHomepageBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView homePageItems, @NonNull ProgressBar progressBarEtt,
      @NonNull EditPageToolbarBinding toolbar, @NonNull View view) {
    this.rootView = rootView;
    this.homePageItems = homePageItems;
    this.progressBarEtt = progressBarEtt;
    this.toolbar = toolbar;
    this.view = view;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEditHomepageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEditHomepageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_edit_homepage, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEditHomepageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.home_page_items;
      RecyclerView homePageItems = rootView.findViewById(id);
      if (homePageItems == null) {
        break missingId;
      }

      id = R.id.progress_bar_ett;
      ProgressBar progressBarEtt = rootView.findViewById(id);
      if (progressBarEtt == null) {
        break missingId;
      }

      id = R.id.toolbar;
      View toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }
      EditPageToolbarBinding binding_toolbar = EditPageToolbarBinding.bind(toolbar);

      id = R.id.view;
      View view = rootView.findViewById(id);
      if (view == null) {
        break missingId;
      }

      return new ActivityEditHomepageBinding((ConstraintLayout) rootView, homePageItems,
          progressBarEtt, binding_toolbar, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
