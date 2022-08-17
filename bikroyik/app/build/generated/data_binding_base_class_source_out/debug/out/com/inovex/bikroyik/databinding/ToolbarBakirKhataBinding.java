// Generated by view binder compiler. Do not edit!
package com.inovex.bikroyik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.inovex.bikroyik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ToolbarBakirKhataBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView btnImageBack;

  @NonNull
  public final TextView toolbarTitle;

  private ToolbarBakirKhataBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView btnImageBack, @NonNull TextView toolbarTitle) {
    this.rootView = rootView;
    this.btnImageBack = btnImageBack;
    this.toolbarTitle = toolbarTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ToolbarBakirKhataBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ToolbarBakirKhataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.toolbar_bakir_khata, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ToolbarBakirKhataBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_imageBack;
      ImageView btnImageBack = rootView.findViewById(id);
      if (btnImageBack == null) {
        break missingId;
      }

      id = R.id.toolbar_title;
      TextView toolbarTitle = rootView.findViewById(id);
      if (toolbarTitle == null) {
        break missingId;
      }

      return new ToolbarBakirKhataBinding((ConstraintLayout) rootView, btnImageBack, toolbarTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
