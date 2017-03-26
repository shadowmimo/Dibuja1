package com.dibuja;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;

public class DrawView extends View {
	Paint paint = new Paint();

	public DrawView(Context context) {
		super(context);
	}

	@Override
	public void onDraw(Canvas canvas) {
	   //.drawRect(left, top, right, bottom, paint)
        paint.setColor(Color.RED);
		canvas.drawRect(30, 30, 80, 80, paint);
	    paint.setColor(Color.CYAN);
		canvas.drawRect(33, 60, 77, 77, paint);
		paint.setColor(Color.YELLOW);
		canvas.drawRect(33, 33, 77, 60, paint);
		
		//.drawCircle(cx, cy, radius, paint);
		paint.setColor(Color.RED);
		canvas.drawCircle(100, 100, 20, paint);
		
		//.drawText(text, x, y, paint)
		canvas.drawText("Texto con CANVAS", 200, 30, paint);
		
		//.drawLine(startX, startY, stopX, stopY, paint)
        paint.setColor(Color.BLUE);
		canvas.drawLine(0, 0, 350, 100, paint);

		Path hexagono = new Path();
		hexagono.moveTo(200,200);
		hexagono.lineTo(220,200);
		hexagono.lineTo(234,186);
		hexagono.lineTo(234,166);
		hexagono.lineTo(220,152);
		hexagono.lineTo(200,152);
		hexagono.lineTo(186,166);
		hexagono.lineTo(186,186);
		hexagono.lineTo(200,200);
		paint.setColor(Color.BLACK);
		paint.setStrokeWidth(2);
		paint.setStyle(Paint.Style.STROKE);
		canvas.drawPath(hexagono, paint);

		Path estrella = new Path();
		int centroX=400;

		// Radio de la circunferencia de circunscribe a la estrella:
		int radio=50;
		int PP = 80/radio; //Proporcion


		int dif = (centroX-(100/PP));

		// Dibujo de la estrella
		estrella.moveTo((100/PP)+dif,(20/PP)+dif);//1
		estrella.lineTo((118/PP)+dif,(73/PP)+dif);//2
		estrella.lineTo((175/PP)+dif,73/PP+dif);//3
		estrella.lineTo((132/PP)+dif,110/PP+dif);//4
		estrella.lineTo((149/PP)+dif,164/PP+dif);//5
		estrella.lineTo((100/PP)+dif,132/PP+dif);//6
		estrella.lineTo((52/PP)+dif,164/PP+dif);//7
		estrella.lineTo((69/PP)+dif,110/PP+dif);//8
		estrella.lineTo((25/PP)+dif,73/PP+dif);//9
		estrella.lineTo((81/PP)+dif,73/PP+dif);//10
		estrella.lineTo((100/PP)+dif,(20/PP)+dif);//11
		paint.setColor(Color.CYAN);
		paint.setStrokeWidth(2);
		paint.setStyle(Paint.Style.STROKE);
		canvas.drawPath(estrella, paint);
        // reloj
		Path circ = new Path();
		circ.addCircle(600, 450, 40, Path.Direction.CCW);
		circ.addCircle(750, 450, 40, Path.Direction.CCW);
		paint.setColor(Color.MAGENTA);
		paint.setStrokeWidth(5);
		paint.setStyle(Paint.Style.STROKE);
		canvas.drawPath(circ, paint);
		Paint p = new Paint();
		RectF rectF = new RectF(600, 380, 750, 420);
		p.setColor(Color.MAGENTA);
		p.setStrokeWidth(2);
		p.setStyle(Paint.Style.STROKE);
		canvas.drawArc (rectF, 30, 110, false, p);
		paint.setStrokeWidth(1);
		paint.setStyle(Paint.Style.FILL);
		paint.setTextSize(10);
		paint.setTypeface(Typeface.SANS_SERIF);
		canvas.drawText("Ulises Reyes Ortega 6im7 ",610, 410, paint);

		Paint p2 = new Paint();
		RectF rectF2 = new RectF(600, 480, 750, 520);
		p2.setColor(Color.MAGENTA);
		p2.setStrokeWidth(2);
		p2.setStyle(Paint.Style.STROKE);
		canvas.drawArc (rectF2, 210, 120, false, p2);


        Path trazo = new Path();
        trazo.addCircle(150, 450, 100, Path.Direction.CCW);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(trazo, paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(20);
        paint.setTypeface(Typeface.SANS_SERIF);
        canvas.drawTextOnPath("Cecyt 9 \"Juan de Dios Bátiz\" graficos en Android ", trazo, 150, 40, paint);

	}

}
