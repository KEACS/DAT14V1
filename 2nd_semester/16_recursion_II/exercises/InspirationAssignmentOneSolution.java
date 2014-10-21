package drawingpanel;

import java.awt.Graphics;

public class InspirationAssignmentOneSolution
{
	private static final int CIRCLESIZE = 200;
	private static final int PANELSIZE = 600;
	
	public static void main(String[] args)
	{
		// create the drawing panel
		DrawingPanel panel = new DrawingPanel(PANELSIZE, PANELSIZE);
		Graphics g = panel.getGraphics();
		
		drawCircleRecursive(g, CIRCLESIZE, (PANELSIZE / 2 - CIRCLESIZE / 2));
											// x = height/2 - raidus
	}

	private static void drawCircleRecursive(Graphics g, int size, int pos)
	{
		
		if (size <= 0)
		{
			
		}
		else
		{			
			g.drawLine(pos, pos, size, size);
			size = size/2;
			drawCircleRecursive(g, size, PANELSIZE / 2 - size / 2);
		}
		
	}
}
