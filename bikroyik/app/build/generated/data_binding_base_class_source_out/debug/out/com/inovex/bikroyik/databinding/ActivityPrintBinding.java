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
import com.inovex.bikroyik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPrintBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout btnPrint;

  @NonNull
  public final RelativeLayout layoutToolbar;

  @NonNull
  public final TextView txtToolbarTitle;

  private ActivityPrintBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout btnPrint,
      @NonNull RelativeLayout layoutToolbar, @NonNull TextView txtToolbarTitle) {
    this.rootView = rootView;
    this.btnPrint = btnPrint;
    this.layoutToolbar = layoutToolbar;
    this.txtToolbarTitle = txtToolbarTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPrintBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPrintBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_print, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPrintBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnPrint;
      LinearLayout btnPrint = rootView.findViewById(id);
      if (btnPrint == null) {
        break missingId;
      }

      id = R.id.layout_toolbar;
      RelativeLayout layoutToolbar = rootView.findViewById(id);
      if (layoutToolbar == null) {
        break missingId;
      }

      id = R.id.txt_toolbar_title;
      TextView txtToolbarTitle = rootView.findViewById(id);
      if (txtToolbarTitle == null) {
        break missingId;
      }

      return new ActivityPrintBinding((LinearLayout) rootView, btnPrint, layoutToolbar,
          txtToolbarTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
