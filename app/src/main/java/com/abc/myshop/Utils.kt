package com.abc.myshop

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.widget.Toast
import com.abc.myshop.databinding.ProgressDialogBinding
import com.google.firebase.auth.FirebaseAuth
//
//object Utils {
//
//    private var dialog : AlertDialog? = null
//
//    fun showDialog(context: Context, message: String){
//        val progress = ProgressDialogBinding.inflate(LayoutInflater.from(context))
//        progress.tvMessage.text = message
//        dialog = AlertDialog.Builder(context).setView(progress.root).setCancelable(false).create()
//        dialog!!.show()
//    }
//
//    fun hideDialog(){
//        dialog?.dismiss()
//    }
//
//    fun showToast(context: Context, message : String){
//        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
//    }
//
//    private var firebaseAuthInstance : FirebaseAuth? = null
//    fun getAuthInstnce() : FirebaseAuth{
//        if (firebaseAuthInstance == null){
//            firebaseAuthInstance = FirebaseAuth.getInstance()
//        }
//        return firebaseAuthInstance!!
//    }
//
//    fun getCurrentUserId() : String{
//        return FirebaseAuth.getInstance().currentUser!!.uid
//    }
//}

object Utils {

    private var dialog: AlertDialog? = null

    fun showDialog(context: Context, message: String) {
        val progress = ProgressDialogBinding.inflate(LayoutInflater.from(context))
        progress.tvMessage.text = message
        dialog = AlertDialog.Builder(context).setView(progress.root).setCancelable(false).create()
        dialog!!.show()
    }

    fun hideDialog() {
        dialog?.dismiss()
    }

    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    private var firebaseAuthInstance: FirebaseAuth? = null
    fun getAuthInstnce(): FirebaseAuth {
        if (firebaseAuthInstance == null) {
            firebaseAuthInstance = FirebaseAuth.getInstance()
        }
        return firebaseAuthInstance!!
    }

    fun getCurrentUserId(): String? {
        val currentUser = FirebaseAuth.getInstance().currentUser
        return currentUser?.uid
    }
}
