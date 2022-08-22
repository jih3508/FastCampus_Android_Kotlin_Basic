package com.example.myapplication

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import android.widget.TextView

class AsyncActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async)

        var backgroundAsyncTask = BackgroundAsyncTask(
            findViewById(R.id.progressBar),
            findViewById(R.id.progressBarText)
        )

        findViewById<TextView>(R.id.start).setOnClickListener{
            backgroundAsyncTask.execute()
        }

        findViewById<TextView>(R.id.stop).setOnClickListener{
            backgroundAsyncTask.cancel(true)
        }

        findViewById<TextView>(R.id.shot).setOnClickListener{
            Log.d("testt", "SHOT!!")
        }
    }

}

class BackgroundAsyncTask(
    val prograssbar: ProgressBar,
    var progressText: TextView
) : AsyncTask<Int, Int, Int>(){
    //Params, Progress, Result
    //Params: doInbackground에서 사용할 타입
    //Progress: onProgressUpdate에서 사용할 타입
    //result : onPostExcuite에서 사용할 타입
    // depreacted -> 더 이상 사용을 권장하지 않는다.
    // 코루틴 대신 사용 한다. →  멀티 태스킹, 동기 / 비동기 처리

    var percent: Int = 0

    override fun doInBackground(vararg p0: Int?): Int {
        while (isCancelled() ==  false){
            percent++
            if(percent > 100) break
            else{
                Log.d("testt", ""+ percent)
                publishProgress(percent)
            }
            Thread.sleep(200)
        }
        return percent
    }

    override fun onPreExecute() {
        percent = 0
        prograssbar.setProgress(percent)
    }

    override fun onProgressUpdate(vararg values: Int?) {
        super.onProgressUpdate(*values)
        prograssbar.setProgress(values[0] ?: 0)
        progressText.text = "퍼센트: " + values[0]
    }

    override fun onPostExecute(result: Int?) {
        progressText.text = "작업이 완료되었습니다."
    }

    override fun onCancelled(result: Int?) {
        prograssbar.setProgress(0)
        progressText.text = "작업이 취소되었습니다."

    }

}