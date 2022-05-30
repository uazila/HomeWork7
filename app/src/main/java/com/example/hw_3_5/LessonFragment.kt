package com.example.hw_3_5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class LessonFragment : Fragment() {

    private val lessonAdapter = LessonAdapter()
    private lateinit var recyclerView : RecyclerView
    private val list = arrayListOf<LessonModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lesson, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.adapter = lessonAdapter
        lessonAdapter.setList(list)
    }

    private fun loadData() {
        list.apply {
            add(LessonModel("Алгебра", "https://e7.pngegg.com/pngimages/918/265/png-clipart-assorted-mathematics-signs-illustration-the-laws-of-thought-1854-mathematics-number-teacher-new-math-math-text-line.png", R.color.purple_200, R.color.purple_700))
            add(LessonModel("Геометрия", "https://www.clipartmax.com/png/full/99-996529_geometry-three-dimensional-space-pyramid-geometry.png", R.color.black, R.color.white))
            add(LessonModel("Физика", "https://scl6-lipetsk.ru/wp-content/uploads/2020/01/atome-scaled.jpg", R.color.teal_200, R.color.teal_700))
            add(LessonModel("Химия", "https://ds05.infourok.ru/uploads/ex/0f1d/001642b4-cfcad92c/hello_html_m1c912315.jpg", R.color.purple_200, R.color.purple_700))
            add(LessonModel("Информатика", "https://w7.pngwing.com/pngs/137/52/png-transparent-bfsi-industry-course-engineering-education-donald-bren-school-of-information-and-computer-sci-computer-network-globe-computer.png", R.color.purple_200, R.color.purple_700))
            add(LessonModel("Кыргыз тил", "", R.color.purple_200, R.color.red))
        }
    }

}