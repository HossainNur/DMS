// Generated by view binder compiler. Do not edit!
package com.inovex.bikroyik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.inovex.bikroyik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityContactListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout btnAddLl;

  @NonNull
  public final Button btnAllContact;

  @NonNull
  public final Button btnCustomer;

  @NonNull
  public final Button btnSupplier;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final ContactListToolbarBinding toolbar;

  private ActivityContactListBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout btnAddLl, @NonNull Button btnAllContact, @NonNull Button btnCustomer,
      @NonNull Button btnSupplier, @NonNull RecyclerView recyclerView,
      @NonNull ContactListToolbarBinding toolbar) {
    this.rootView = rootView;
    this.btnAddLl = btnAddLl;
    this.btnAllContact = btnAllContact;
    this.btnCustomer = btnCustomer;
    this.btnSupplier = btnSupplier;
    this.recyclerView = recyclerView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityContactListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityContactListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_contact_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityContactListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_add_ll;
      LinearLayout btnAddLl = rootView.findViewById(id);
      if (btnAddLl == null) {
        break missingId;
      }

      id = R.id.btn_allContact;
      Button btnAllContact = rootView.findViewById(id);
      if (btnAllContact == null) {
        break missingId;
      }

      id = R.id.btn_customer;
      Button btnCustomer = rootView.findViewById(id);
      if (btnCustomer == null) {
        break missingId;
      }

      id = R.id.btn_supplier;
      Button btnSupplier = rootView.findViewById(id);
      if (btnSupplier == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = rootView.findViewById(id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      View toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }
      ContactListToolbarBinding binding_toolbar = ContactListToolbarBinding.bind(toolbar);

      return new ActivityContactListBinding((ConstraintLayout) rootView, btnAddLl, btnAllContact,
          btnCustomer, btnSupplier, recyclerView, binding_toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}