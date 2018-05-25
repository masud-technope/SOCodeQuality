public class CDlg {
    void ShowConfirm(String caption, String msg) {
        AlertDialog.Builder delAllDialog = new AlertDialog.Builder(this);
        delAllDialog.setTitle(caption);

        TextView dialogTxt_id = new TextView(this);
        LayoutParams dialogTxt_idLayoutParams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        dialogTxt_id.setLayoutParams(dialogTxt_idLayoutParams);
        dialogTxt_id.setText(msg);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(dialogTxt_id);
        delAllDialog.setView(layout);

        delAllDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                handleButtonClick(1);
            }
        });

        delAllDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                handleButtonClick(2);
            }
        });

        delAllDialog.show();
    }

    void handleButtonClick(int rez) {
        switch(rez) {
            case 1: ..... break;
            case 2: ..... break;
            .....
        }
    }
}