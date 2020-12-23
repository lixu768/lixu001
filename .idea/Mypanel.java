class Mypanel extends JPanel {
    //画画的方法


    @Override
    public void paint(Graphics g) {
        //调用父类自己的paint方法
        super.paint(g);
        //修改字体大小
        Font font = new Font("黑体",Font.ITALIC,32);

        //set color
        Color color = new Color(00,5,209);

        //use
        g.setColor(color);
        g.setFont(font);
        g.drawString("李旭",160,200);

        // read picture
        Image bee = ImageIO.read(new File("bee.png"));
    }
}
