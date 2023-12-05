package kh.edu.rupp.ite.ea.huychoung.e_coding.models

data class CourseModel(
    var id: Int?,
    var title: String?,
    var desc: String? = null,
    var image: Int?,
    var price: Float? = 0f,
    var duration: Int? = 0,
    var status:String?
)
