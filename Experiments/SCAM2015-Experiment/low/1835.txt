public class LayerItem extends JLabel{

    protected int lblYPt = 0;

    public LayerItem(JPanel layers){
        this.addMouseListener(new MouseAdapter(){
            @Override
             public void mousePressed(MouseEvent evt){
                 lblMousePressed(evt);
             }
        });

        this.addMouseMotionListener(new MouseAdapter(){
            @Override
            public void mouseDragged(MouseEvent evt){
                lblMouseDragged(evt);
            }
        });
    }

    public void lblMousePressed(MouseEvent evt){
        lblYPt = evt.getY();
    }

    public void lblMouseDragged(MouseEvent evt){
        Component parent = evt.getComponent().getParent();
        Point mouse = parent.getMousePosition();
        try{
            if(mouse.y - lblYPt >= 30){
                this.setBounds(0, mouse.y - lblYPt, 198, 50);
            }
        }catch(Exception e){
        }
    }
}