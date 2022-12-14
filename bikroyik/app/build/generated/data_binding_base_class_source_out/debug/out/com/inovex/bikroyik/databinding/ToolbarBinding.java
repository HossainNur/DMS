// Generated by view binder compiler. Do not edit!
package com.inovex.bikroyik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import com.inovex.bikroyik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ToolbarBinding implements ViewBinding {
  @NonNull
  private final Toolbar rootView;

  @NonNull
  public final ImageView ivSyncIcon;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView tvHomeToolbarTitle;

  private ToolbarBinding(@NonNull Toolbar rootView, @NonNull ImageView ivSyncIcon,
      @NonNull Toolbar toolbar, @NonNull TextView tvHomeToolbarTitle) {
    this.rootView = rootView;
    this.ivSyncIcon = ivSyncIcon;
    this.toolbar = toolbar;
    this.tvHomeToolbarTitle = tvHomeToolbarTitle;
  }

  @Override
  @NonNull
  public Toolbar getRoot() {
    return rootView;
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.toolbar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ToolbarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivSyncIcon;
      ImageView ivSyncIcon = rootView.findViewById(id);
      if (ivSyncIcon == null) {
        break missingId;
      }

      Toolbar toolbar = (Toolbar) rootView;

      id = R.id.tvHomeToolbarTitle;
      TextView tvHomeToolbarTitle = rootView.findViewById(id);
      if (tvHomeToolbarTitle == null) {
        break missingId;
      }

      return new ToolbarBinding((Toolbar) rootView, ivSyncIcon, toolbar, tvHomeToolbarTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
