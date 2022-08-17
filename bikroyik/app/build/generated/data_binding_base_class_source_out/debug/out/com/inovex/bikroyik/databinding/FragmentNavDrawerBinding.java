// Generated by view binder compiler. Do not edit!
package com.inovex.bikroyik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class FragmentNavDrawerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView btnChangeLanguage;

  @NonNull
  public final TextView btnChangePassword;

  @NonNull
  public final View horizontalLine;

  @NonNull
  public final ImageView ivLogOut;

  @NonNull
  public final ImageView ivTitleIcon;

  @NonNull
  public final LinearLayout lLAttendance;

  @NonNull
  public final LinearLayout lLCallSchedule;

  @NonNull
  public final LinearLayout lLConnect;

  @NonNull
  public final LinearLayout lLContacts;

  @NonNull
  public final LinearLayout lLExpenses;

  @NonNull
  public final LinearLayout lLHome;

  @NonNull
  public final LinearLayout lLLeave;

  @NonNull
  public final LinearLayout lLMessaging;

  @NonNull
  public final LinearLayout lLProfile;

  @NonNull
  public final LinearLayout lLRetailComplain;

  @NonNull
  public final LinearLayout lLSyncData;

  @NonNull
  public final LinearLayout lLToDo;

  @NonNull
  public final TextView listTitle;

  @NonNull
  public final LinearLayout llOrders;

  @NonNull
  public final RelativeLayout navHeaderContainer;

  @NonNull
  public final LinearLayout notifications;

  private FragmentNavDrawerBinding(@NonNull LinearLayout rootView,
      @NonNull TextView btnChangeLanguage, @NonNull TextView btnChangePassword,
      @NonNull View horizontalLine, @NonNull ImageView ivLogOut, @NonNull ImageView ivTitleIcon,
      @NonNull LinearLayout lLAttendance, @NonNull LinearLayout lLCallSchedule,
      @NonNull LinearLayout lLConnect, @NonNull LinearLayout lLContacts,
      @NonNull LinearLayout lLExpenses, @NonNull LinearLayout lLHome, @NonNull LinearLayout lLLeave,
      @NonNull LinearLayout lLMessaging, @NonNull LinearLayout lLProfile,
      @NonNull LinearLayout lLRetailComplain, @NonNull LinearLayout lLSyncData,
      @NonNull LinearLayout lLToDo, @NonNull TextView listTitle, @NonNull LinearLayout llOrders,
      @NonNull RelativeLayout navHeaderContainer, @NonNull LinearLayout notifications) {
    this.rootView = rootView;
    this.btnChangeLanguage = btnChangeLanguage;
    this.btnChangePassword = btnChangePassword;
    this.horizontalLine = horizontalLine;
    this.ivLogOut = ivLogOut;
    this.ivTitleIcon = ivTitleIcon;
    this.lLAttendance = lLAttendance;
    this.lLCallSchedule = lLCallSchedule;
    this.lLConnect = lLConnect;
    this.lLContacts = lLContacts;
    this.lLExpenses = lLExpenses;
    this.lLHome = lLHome;
    this.lLLeave = lLLeave;
    this.lLMessaging = lLMessaging;
    this.lLProfile = lLProfile;
    this.lLRetailComplain = lLRetailComplain;
    this.lLSyncData = lLSyncData;
    this.lLToDo = lLToDo;
    this.listTitle = listTitle;
    this.llOrders = llOrders;
    this.navHeaderContainer = navHeaderContainer;
    this.notifications = notifications;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNavDrawerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNavDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_nav_drawer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNavDrawerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_change_language;
      TextView btnChangeLanguage = rootView.findViewById(id);
      if (btnChangeLanguage == null) {
        break missingId;
      }

      id = R.id.btn_change_password;
      TextView btnChangePassword = rootView.findViewById(id);
      if (btnChangePassword == null) {
        break missingId;
      }

      id = R.id.horizontalLine;
      View horizontalLine = rootView.findViewById(id);
      if (horizontalLine == null) {
        break missingId;
      }

      id = R.id.ivLogOut;
      ImageView ivLogOut = rootView.findViewById(id);
      if (ivLogOut == null) {
        break missingId;
      }

      id = R.id.ivTitleIcon;
      ImageView ivTitleIcon = rootView.findViewById(id);
      if (ivTitleIcon == null) {
        break missingId;
      }

      id = R.id.lLAttendance;
      LinearLayout lLAttendance = rootView.findViewById(id);
      if (lLAttendance == null) {
        break missingId;
      }

      id = R.id.lLCallSchedule;
      LinearLayout lLCallSchedule = rootView.findViewById(id);
      if (lLCallSchedule == null) {
        break missingId;
      }

      id = R.id.lLConnect;
      LinearLayout lLConnect = rootView.findViewById(id);
      if (lLConnect == null) {
        break missingId;
      }

      id = R.id.lLContacts;
      LinearLayout lLContacts = rootView.findViewById(id);
      if (lLContacts == null) {
        break missingId;
      }

      id = R.id.lLExpenses;
      LinearLayout lLExpenses = rootView.findViewById(id);
      if (lLExpenses == null) {
        break missingId;
      }

      id = R.id.lLHome;
      LinearLayout lLHome = rootView.findViewById(id);
      if (lLHome == null) {
        break missingId;
      }

      id = R.id.lLLeave;
      LinearLayout lLLeave = rootView.findViewById(id);
      if (lLLeave == null) {
        break missingId;
      }

      id = R.id.lLMessaging;
      LinearLayout lLMessaging = rootView.findViewById(id);
      if (lLMessaging == null) {
        break missingId;
      }

      id = R.id.lLProfile;
      LinearLayout lLProfile = rootView.findViewById(id);
      if (lLProfile == null) {
        break missingId;
      }

      id = R.id.lLRetailComplain;
      LinearLayout lLRetailComplain = rootView.findViewById(id);
      if (lLRetailComplain == null) {
        break missingId;
      }

      id = R.id.lLSyncData;
      LinearLayout lLSyncData = rootView.findViewById(id);
      if (lLSyncData == null) {
        break missingId;
      }

      id = R.id.lLToDo;
      LinearLayout lLToDo = rootView.findViewById(id);
      if (lLToDo == null) {
        break missingId;
      }

      id = R.id.listTitle;
      TextView listTitle = rootView.findViewById(id);
      if (listTitle == null) {
        break missingId;
      }

      id = R.id.llOrders;
      LinearLayout llOrders = rootView.findViewById(id);
      if (llOrders == null) {
        break missingId;
      }

      id = R.id.nav_header_container;
      RelativeLayout navHeaderContainer = rootView.findViewById(id);
      if (navHeaderContainer == null) {
        break missingId;
      }

      id = R.id.notifications;
      LinearLayout notifications = rootView.findViewById(id);
      if (notifications == null) {
        break missingId;
      }

      return new FragmentNavDrawerBinding((LinearLayout) rootView, btnChangeLanguage,
          btnChangePassword, horizontalLine, ivLogOut, ivTitleIcon, lLAttendance, lLCallSchedule,
          lLConnect, lLContacts, lLExpenses, lLHome, lLLeave, lLMessaging, lLProfile,
          lLRetailComplain, lLSyncData, lLToDo, listTitle, llOrders, navHeaderContainer,
          notifications);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
