MyTask task = new MyTask();
task.setActionListener(new MyTaskActionListener(){
    public void didFinish(String result){
        yoirTextView.setText(result);
    }
});