package delivery.food.materialtablayout.mvp.main.presenter

import delivery.food.materialtablayout.mvp.main.model.MainModelImpl
import delivery.food.materialtablayout.mvp.main.view.MainViewResult

/**
 * Created by r.pek on 12,June,2018
 * GLF
 */
class MainPresenterImpl(private var view: MainViewResult) : MainPresenterWraper, MainPresenterCallback {



    private var model = MainModelImpl(this)

    override fun fetchByViewToPresenter(msg:String) {
        model!!.fetchDataByPresenterToModel(msg)
    }

    override fun getDatafromModelToPresenter(msg:String) {
       if(msg.isNotEmpty()){
           view!!.onMessageSuccessPresenterToView(msg)
       }else{
           view!!.onMessageFailPresenterToView("Failed hg")
       }
    }
}