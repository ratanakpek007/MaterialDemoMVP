package delivery.food.materialtablayout.mvp.main.view

/**
 * Created by r.pek on 12,June,2018
 * GLF
 */
interface MainViewResult{
    fun onMessageSuccessPresenterToView(msg:String)
    fun onMessageFailPresenterToView(msg:String)
}