package com.ankit.demofarproject.view.ui.home

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ankit.demofarproject.R
import com.ankit.demofarproject.databinding.ActivityHomeBinding
import com.ankit.demofarproject.model.MenuModel
import com.ankit.demofarproject.view.ui.base.BaseAppActivity

class HomeActivity : BaseAppActivity(){
    val mainMenuList = ArrayList<MenuModel.MainMenuModel>()
    val leaveList = ArrayList<MenuModel.InnerMenuModel>()
    val payrollList = ArrayList<MenuModel.InnerMenuModel>()
    val infoList = ArrayList<MenuModel.InnerMenuModel>()
    val attendanceList = ArrayList<MenuModel.InnerMenuModel>()
    lateinit var mainAdapter : HomeMainMenuAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = binding(R.layout.activity_home) as ActivityHomeBinding
        title = "Home"

        createLeaveList()
        createPayrollList()
        createMainMenu()

        binding.mainRecycler.layoutManager = LinearLayoutManager(this)
        mainAdapter = HomeMainMenuAdapter(this, mainMenuList)
        binding.mainRecycler.adapter = mainAdapter

    }

    fun createMainMenu(){
        var data = MenuModel.MainMenuModel("Leave", leaveList)
        mainMenuList.add(data)

        data = MenuModel.MainMenuModel("Payroll", payrollList)
        mainMenuList.add(data)

        data = MenuModel.MainMenuModel("Attendance", attendanceList)
        mainMenuList.add(data)

        data = MenuModel.MainMenuModel("My Info", infoList)
        mainMenuList.add(data)


    }
    fun createLeaveList(){
        var data3 = MenuModel.InnerMenuModel("Application", R.drawable.leave)
        leaveList.add(data3)

        data3 = MenuModel.InnerMenuModel("Approval", R.drawable.ic_camera_image)
        leaveList.add(data3)
    }
    fun createPayrollList(){
        var data = MenuModel.InnerMenuModel("Payslips", R.drawable.leave)
        payrollList.add(data)

        data = MenuModel.InnerMenuModel("HRA", R.drawable.ic_camera_image)
        payrollList.add(data)

        var data1 = MenuModel.InnerMenuModel("Contact Details", R.drawable.leave)
        infoList.add(data1)

        data1 = MenuModel.InnerMenuModel("Other Details", R.drawable.ic_camera_image)
        infoList.add(data1)

        data1 = MenuModel.InnerMenuModel("Family Details", R.drawable.ic_camera_image)
        infoList.add(data1)

        data1 = MenuModel.InnerMenuModel("Asset Details", R.drawable.ic_camera_image)
        infoList.add(data1)

        var data2 = MenuModel.InnerMenuModel("Punch", R.drawable.leave)
        attendanceList.add(data2)

        data2 = MenuModel.InnerMenuModel("Attendance", R.drawable.ic_camera_image)
        attendanceList.add(data2)

        data2 = MenuModel.InnerMenuModel("Holidays", R.drawable.ic_camera_image)
        attendanceList.add(data2)
    }

}