package com.observer.schoolent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class HomePageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 使用现有的 home_page.xml 作为 Fragment 的布局
        return inflater.inflate(R.layout.home_page, container, false)
    }
}
