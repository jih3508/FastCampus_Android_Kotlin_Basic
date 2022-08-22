# Async

### 동기(Sync)/비동기(Asunc)
- 실행방법에 대한 종류
- 순서대로 실행이 된다.
- 동기 방식: A 작업 하는 중 B작업을 시킬때 A작업은 멈추고 나서 B작업이 끝나야 A작업이 시작된다.
- 비동기 방식: A 작업 하는 중 B작업을 시킬때 A작업은 계속 진행하면서 B작업도 진행이 된다.
	
### 주요 기능
- execute: 실행 시작
- cancel: 실행 중지
- AsyncTask<Params, Progress, Result>에 상속 받는다.
  - Params, Progress, Result
  - Params: doInbackground에서 사용할 타입
  - Progress: onProgressUpdate에서 사용할 타입
result : onPostExcuite에서 사용할 타입
- doInBackground(Params... params): 스레드에 의해 처리될 내용을 담기 위한 함수
- onPreExecute(): AsyncTask의 작업을 시작하기 전에 호출. AsyncTask에서 가장 먼저 한 번 호출
- onPostExecute(Result result): AsyncTask의 모든 작업이 완료된 후 가장 마지막에 한 번 호출. doInBackground() 함 수의 최종 값을 받기 위해 사용
- onProgressUpdate(Progress... values): doInBackground() 함수에 의해 처리되는 중간중간 값을 받아 처리하기 위해 호출. doInBackground( ) 함수에서 publishProgress( ) 함수로 넘긴 값이 전달


### 코드
```kotlin
class BackgroundAsyncTask(
    val prograssbar: ProgressBar,
    var progressText: TextView
) : AsyncTask<Int, Int, Int>(){

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
```


### 실행 결과
![실행 결과](./%EA%B2%B0%EA%B3%BC.PNG)