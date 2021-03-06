package com.example.movies.list


import com.example.movies.model.Movie

interface ListContract {

    interface Model {

        interface OnFinishedListener {
            fun onFinished(movieArrayList: List<Movie>)

            fun onFailure(t: Throwable)
        }

        fun getMovieList(onFinishedListener: OnFinishedListener, pageNo: Int)

    }

    interface View {

        fun showProgress()

        fun hideProgress()

        fun setDataToRecyclerView(movieArrayList: List<Movie>)

        fun onResponseFailure(throwable: Throwable)

    }

    interface Presenter {

        fun getMoreData(pageNo: Int)

        fun requestDataFromServer()


    }
}