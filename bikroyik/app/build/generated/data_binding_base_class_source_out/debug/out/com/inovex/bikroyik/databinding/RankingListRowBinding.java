// Generated by view binder compiler. Do not edit!
package com.inovex.bikroyik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.inovex.bikroyik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RankingListRowBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout llRankNumber;

  @NonNull
  public final TextView tvRankName;

  @NonNull
  public final TextView tvRankNumber;

  @NonNull
  public final TextView tvRankPoint;

  private RankingListRowBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout llRankNumber,
      @NonNull TextView tvRankName, @NonNull TextView tvRankNumber, @NonNull TextView tvRankPoint) {
    this.rootView = rootView;
    this.llRankNumber = llRankNumber;
    this.tvRankName = tvRankName;
    this.tvRankNumber = tvRankNumber;
    this.tvRankPoint = tvRankPoint;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RankingListRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RankingListRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.ranking_list_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RankingListRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.llRankNumber;
      LinearLayout llRankNumber = rootView.findViewById(id);
      if (llRankNumber == null) {
        break missingId;
      }

      id = R.id.tvRankName;
      TextView tvRankName = rootView.findViewById(id);
      if (tvRankName == null) {
        break missingId;
      }

      id = R.id.tvRankNumber;
      TextView tvRankNumber = rootView.findViewById(id);
      if (tvRankNumber == null) {
        break missingId;
      }

      id = R.id.tvRankPoint;
      TextView tvRankPoint = rootView.findViewById(id);
      if (tvRankPoint == null) {
        break missingId;
      }

      return new RankingListRowBinding((LinearLayout) rootView, llRankNumber, tvRankName,
          tvRankNumber, tvRankPoint);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
