package delivery.food.materialtablayout.mvp.main.model

import delivery.food.materialtablayout.mvp.main.presenter.MainPresenterCallback

/**
 * Created by r.pek on 12,June,2018
 * GLF
 */
class MainModelImpl(private val prsenter: MainPresenterCallback) : MainModelWrapper {


    override fun fetchDataByPresenterToModel(msg: String) {
        prsenter.getDatafromModelToPresenter(msg)
    }

}