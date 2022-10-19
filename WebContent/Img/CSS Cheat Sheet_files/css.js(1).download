

/*
Border radius:
######################### */

var radiusPixels = '';
var radiusString = '';
var tabbedRadiusString = '';



function applyRadius() {
	cssEditorFricc.setValue("#demo {\n  "+ tabbedRadiusString +"\n}");
	sourceEditorFricc.setValue('<div id="demo">Edit this text</div>');
	cssChanged();
	updateLeft();
}


$(document).ready(function(){
	$("#radiusWrap input").change(function() {
		
		var tl = document.getElementById("radiusTL").value;
		var tr = document.getElementById("radiusTR").value;
		var br = document.getElementById("radiusBR").value;
		var bl = document.getElementById("radiusBL").value;
		
		if (document.getElementById('checkboxRadius').checked) {
			tr = tl; br = tl; bl = tl;
		}
		
		radiusPixels = tl + "px " + tr + "px " + br + "px " + bl + "px";
		if (document.getElementById('checkboxRadius').checked) {
			radiusPixels = tl + "px";
		}
		
		$("#radiusPreview").css("border-radius", radiusPixels);
		
		tabbedRadiusString = "-webkit-border-radius: " + radiusPixels + ";\n  border-radius: " + radiusPixels + ";";
		radiusString = "-webkit-border-radius: " + radiusPixels + ";\nborder-radius: " + radiusPixels + ";";
		
		document.getElementById("radiusTA").value = radiusString;
	});
	
	$("#checkboxRadius").change(function() {
		if (document.getElementById('checkboxRadius').checked) {
			$("#radiusTR").css("background-color", "#DDD");
			$("#radiusBL").css("background-color", "#DDD");
			$("#radiusBR").css("background-color", "#DDD");
		} else {
			$("#radiusTR").css("background-color", "#FFF");
			$("#radiusBL").css("background-color", "#FFF");
			$("#radiusBR").css("background-color", "#FFF");			
		}
	});	
	$("#radiusTR, #radiusBR, #radiusBL").change(function() {
			$("#radiusTR").css("background-color", "#FFF");
			$("#radiusBL").css("background-color", "#FFF");
			$("#radiusBR").css("background-color", "#FFF");
			document.getElementById("checkboxRadius").checked = false;
	});
	
});

/*######################### 
Gradient:
######################### */


var gradientPercent = 50;

$( function() {
	var handle = $( "#gradientPercent-handle" );
	$( "#gradientPercent" ).slider({
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		gradientPercent = ui.value;
		handle.text( gradientPercent );
		refreshGradient();
	  }
	});
} );


var gradientDirection = "left";
var gradientDirection2 = "to right";

function refreshGradient() {
	
	var color1 = '#' + document.getElementById("gradient1").value;
	var color2 = '#' + document.getElementById("gradient2").value;
	var color3 = '#' + document.getElementById("gradient3").value;
	
	if (!(document.getElementById('gradientRgba').checked)) {
		color1 = 'rgb(' + hexToRgb(color1).r + ',' + hexToRgb(color1).g + ',' + hexToRgb(color1).b + ')';
		color2 = 'rgb(' + hexToRgb(color2).r + ',' + hexToRgb(color2).g + ',' + hexToRgb(color2).b + ')';
		color3 = 'rgb(' + hexToRgb(color3).r + ',' + hexToRgb(color3).g + ',' + hexToRgb(color3).b + ')';
	}
	
	
	var gradientType = 'linear';
	if (gradientDirection == 'left')	{	gradientDirection2 = "to right";	}
	if (gradientDirection == 'top')	{	gradientDirection2 = "to bottom";	}
	if (gradientDirection == '-45deg')	{	gradientDirection2 = "135deg";	}
	if (gradientDirection == '45deg')	{	gradientDirection2 = "45deg";	}
	if (gradientDirection == 'center')	{	gradientDirection2 = "ellipse at center";	gradientType = 'radial';	}

	
	var css = 'background: ' + color1 + ';\n'; 
	
	css += 'background: -moz-' + gradientType + '-gradient(' + gradientDirection +', ' + color1 + ' 0%, ';
	var middle = color2 + ' ' + gradientPercent + '%, ';
	if (document.getElementById('gradientMiddle').checked) {
		css += middle;
	}
	css += color3 + ' 100%);\n';

	css += 'background: -webkit-' + gradientType + '-gradient(' + gradientDirection +', ' + color1 + ' 0%, ';
	middle = color2 + ' ' + gradientPercent + '%, ';
	if (document.getElementById('gradientMiddle').checked) {
		css += middle;
	}
	css += color3 + ' 100%);\n';

	css += 'background: ' + gradientType + '-gradient(' + gradientDirection2 +', ' + color1 + ' 0%, ';
	middle = color2 + ' ' + gradientPercent + '%, ';
	if (document.getElementById('gradientMiddle').checked) {
		css += middle;
	}
	css += color3 + ' 100%);';
	
	document.getElementById("gradientResult").value = css;
	
	/* Quick preview */
	previewGradient = gradientType + '-gradient(' + gradientDirection2 +', ' + color1 + ' 0%, ';
	middle = color2 + ' ' + gradientPercent + '%, ';
	if (document.getElementById('gradientMiddle').checked) {
		previewGradient += middle;
	}
	previewGradient += color3 + ' 100%)';

	document.getElementById("gradientPreview").style.backgroundImage = previewGradient;
	

	previewGradient = 'linear-gradient(to right, ' + color1 + ' 0%, ';
	middle = color2 + ' 50%, ';
	if (document.getElementById('gradientMiddle').checked) {
		previewGradient += middle;
	}
	previewGradient += color3 + ' 100%)';
	document.getElementById("gradientProgressbar").style.backgroundImage = previewGradient;


	refreshButton();
}


function dock() {
	setTimeout(function(){ $('#layover').fadeOut(1000); }, 1000);
	$("#pagewrap").addClass("docked");
}

function applyBorderRadius() {
	cssEditorFricc.setValue("#demo {\n"+ document.getElementById("radiusTA").value +"\n}\n\n#demo{\ndisplay: inline-block;  padding: 20px 10px; border: 5px solid #1C6EA4; \n}");
	sourceEditorFricc.setValue('<div id="demo">Edit this text</div>');
	cssChanged();
	updateLeft();
	dock();
}

function applyGradient() {
	cssEditorFricc.setValue("#demo {\n"+ document.getElementById("gradientResult").value +"\n}\n#demo {\n  min-height: 150px;\n  text-align: center;\n}");
	sourceEditorFricc.setValue('<div id="demo">Edit this text</div>');
	cssChanged();
	updateLeft();
	dock();
}

$(document).ready(function(){

	$("#gradientPercent").slider('value',50);
	$( "#gradientPercent-handle" ).text( 50 );
	if ($('#gradient1').length != 0) {	refreshGradient();	}
	
	$(".gradientDirections > a").click(function() {
		$(".gradientDirections > a").removeClass("gradientDirection");
		gradientDirection = $(this).text();
		$(this).addClass("gradientDirection");	
		refreshGradient();		
	});	
	$("#gradientInputs input, #gradientRgba").change(function() {
		refreshGradient();		
	});	
	$("#gradientMiddle").change(function() {
		if (document.getElementById('gradientMiddle').checked) {
			$('#gradientPercent').removeClass('hidden');
			$('#gradient2').removeClass('hidden');
		} else {
			$('#gradientPercent').addClass('hidden');			
			$('#gradient2').addClass('hidden');			
		}
		refreshGradient();		
	});	
});

$(function() {
	$( "#gradientPreview, .resizable" ).resizable({		//resizable Codemirror with Jquery UI
	   ghost: true,
	   animate: true,
	   minHeight: 50,
	   minWidth: 50,
	});
 });


/*######################### 
Box Shadow:
######################### */

var boxShadowShiftRight = 5;
var boxShadowShiftDown = 5;
var boxShadowSpread = 5;
var boxShadowBlurRadius = 15;
var boxShadowOpacity = 1;

$( function() {
	var handle = $( "#boxShadowShiftRight-handle" );
	$( "#boxShadowShiftRight" ).slider({
	  range: "max",
	  min: -100, // min value
	  max: 100, // max value
	  step: 1,
	  value: 5,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		boxShadowShiftRight = ui.value;
		handle.text( boxShadowShiftRight );
		refreshBoxShadow();
	  }
	});
} );
$( function() {
	var handle = $( "#boxShadowShiftDown-handle" );
	$( "#boxShadowShiftDown" ).slider({
	  range: "max",
	  min: -100, // min value
	  max: 100, // max value
	  step: 1,
	  value: 5,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		boxShadowShiftDown = ui.value;
		handle.text( boxShadowShiftDown );
		refreshBoxShadow();
	  }
	});
} );
$( function() {
	var handle = $( "#boxShadowSpread-handle" );
	$( "#boxShadowSpread" ).slider({
	  range: "max",
	  min: 0, // min value
	  max: 100, // max value
	  step: 1,
	  value: 5,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		boxShadowSpread = ui.value;
		handle.text( boxShadowSpread );
		refreshBoxShadow();
	  }
	});
} );
$( function() {
	var handle = $( "#boxShadowBlurRadius-handle" );
	$( "#boxShadowBlurRadius" ).slider({
	  range: "max",
	  min: 0, // min value
	  max: 100, // max value
	  step: 1,
	  value: 5,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		boxShadowBlurRadius = ui.value;
		handle.text( boxShadowBlurRadius );
		refreshBoxShadow();
	  }
	});
} );
$( function() {
	var handle = $( "#boxShadowOpacity-handle" );
	$( "#boxShadowOpacity" ).slider({
	  range: "max",
	  min: 0, // min value
	  max: 1, // max value
	  step: 0.01,
	  value: 1,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		boxShadowOpacity = ui.value;
		handle.text( boxShadowOpacity );
		refreshBoxShadow();
	  }
	});
} );

var boxShadowCode;

function refreshBoxShadow() {
	
	var boxShadowColor = document.getElementById("boxShadowColor").value;
	
	var boxShadowColorString = '#' + boxShadowColor;
	if (boxShadowOpacity != 1) {
		boxShadowColorString = 'rgba(' + hexToRgb(boxShadowColor).r + ',' + hexToRgb(boxShadowColor).g + ',' + hexToRgb(boxShadowColor).b + ',' + boxShadowOpacity + ')';
	}
	
	var css = boxShadowShiftRight +'px ' + boxShadowShiftDown + 'px ' + boxShadowBlurRadius + 'px ' + boxShadowSpread + 'px ' + boxShadowColorString;
	
	if (document.getElementById('boxShadowInset').checked) {
		css = 'inset ' + css;
	}
	
	$( "#boxShadowPeview" ).css( "box-shadow", css);
	
	
	boxShadowCode = '-webkit-box-shadow: ' + css + '; \nbox-shadow: ' + css + ';';
	document.getElementById("boxShadowResult").value = boxShadowCode;
	
/*
-webkit-box-shadow: 26px 111px 67px 26px #7066FF;
        box-shadow: 26px 111px 67px 26px #7066FF;
*/
	refreshButton();
	
}

$(document).ready(function(){

	var lightBoxShadowBackground = 1;
	if ($('#boxShadowPeview').length != 0) {	document.getElementById("boxShadowInset").checked = false;	}
	
	$("#lightBoxBackground").change(function() {
		if (lightBoxShadowBackground == 1) {
			document.getElementById("boxShadowPreviewWrap").style.background = "#000000";
			lightBoxShadowBackground = 0;
		} else {
			document.getElementById("boxShadowPreviewWrap").style.background = "#FFFFFF";
			lightBoxShadowBackground = 1;			
		}
	});
	$("#lightBoxBackground").change(function() {
		if (lightBoxShadowBackground == 1) {
			document.getElementById("FontGeneratorPreviewWrap").style.background = "#000000";
			lightBoxShadowBackground = 0;
		} else {
			document.getElementById("FontGeneratorPreviewWrap").style.background = "#FFFFFF";
			lightBoxShadowBackground = 1;			
		}
	});
	
	$("#boxShadowInset, #boxShadowColor").change(function() {
		refreshBoxShadow();		
	});
	
	if ($('#boxShadowPeview').length != 0) {	refreshBoxShadow();	}
});

function applyBoxShadow() {
	cssEditorFricc.setValue("#demo {\n"+ document.getElementById("boxShadowResult").value +"\n}\n#demo {\n background-color: #1C6EA4;\n display: block;\n margin: 50px auto 0;\n width: 100px;\n height: 60px;\n color: #FFF;\n padding: 10px;\n}");
	sourceEditorFricc.setValue('<div id="demo">Edit this text</div>');
	cssChanged();
	updateLeft();
	dock();
}


/*######################### 
Text Shadow:
######################### */

var textShadowShiftRight = 2;
var textShadowShiftDown = 2;
var textShadowBlurRadius = 2;
var textShadowOpacity = 1;

$( function() {
	var handle = $( "#textShadowShiftRight-handle" );
	$( "#textShadowShiftRight" ).slider({
	  range: "max",
	  min: -40, // min value
	  max: 40, // max value
	  step: 1,
	  value: 2,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		textShadowShiftRight = ui.value;
		handle.text( textShadowShiftRight );
		refreshtextShadow();
	  }
	});
} );
$( function() {
	var handle = $( "#textShadowShiftDown-handle" );
	$( "#textShadowShiftDown" ).slider({
	  range: "max",
	  min: -40, // min value
	  max: 40, // max value
	  step: 1,
	  value: 2,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		textShadowShiftDown = ui.value;
		handle.text( textShadowShiftDown );
		refreshtextShadow();
	  }
	});
} );

$( function() {
	var handle = $( "#textShadowBlurRadius-handle" );
	$( "#textShadowBlurRadius" ).slider({
	  range: "max",
	  min: 0, // min value
	  max: 20, // max value
	  step: 1,
	  value: 2,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		textShadowBlurRadius = ui.value;
		handle.text( textShadowBlurRadius );
		refreshtextShadow();
	  }
	});
} );
$( function() {
	var handle = $( "#textShadowOpacity-handle" );
	$( "#textShadowOpacity" ).slider({
	  range: "max",
	  min: 0, // min value
	  max: 1, // max value
	  step: 0.01,
	  value: 1,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		textShadowOpacity = ui.value;
		handle.text( textShadowOpacity );
		refreshtextShadow();
	  }
	});
} );

var textShadowCode;

function refreshtextShadow() {
	$('#textShadowPeview').attr("style",'');
	
	var textShadowColor = $("#textShadowColor").val();
	
	var textShadowColorString = '#' + textShadowColor;
	if (textShadowOpacity != 1) {
		textShadowColorString = 'rgba(' + hexToRgb(textShadowColor).r + ',' + hexToRgb(textShadowColor).g + ',' + hexToRgb(textShadowColor).b + ',' + textShadowOpacity + ')';
	}
	
	var css = textShadowShiftRight +'px ' + textShadowShiftDown + 'px ' + textShadowBlurRadius + 'px ' + textShadowColorString;
	
	$( "#textShadowPeview" ).css( "text-shadow", css);
	
	
	textShadowCode = 'text-shadow: ' + css + ';';
	$("#textShadowResult").val(textShadowCode);

}

$(document).ready(function(){

	var lighttextShadowBackground = 1;
	
	$("#lighttextBackground").change(function() {
		if (lighttextShadowBackground == 1) {
			document.getElementById("textShadowPreviewWrap").style.background = "#000000";
			document.getElementById("textShadowPeview").style.color = "#EEEEEE";
			lighttextShadowBackground = 0;
		} else {
			document.getElementById("textShadowPreviewWrap").style.background = "#FFFFFF";
			document.getElementById("textShadowPeview").style.color = "#333333";
			lighttextShadowBackground = 1;			
		}
	});
	$("#textShadowColor").change(function() {
		refreshtextShadow();
	});
	$("#textShadowGallery > div").click(function() {
		var stilus = $(this).attr("style");
		$('#textShadowPeview').attr("style",stilus);
		var ujsorokban = stilus.replace('; ', ";\n"); 
		ujsorokban = ujsorokban.replace('; ', ";\n");
		ujsorokban = ujsorokban.replace('; ', ";\n");
		ujsorokban = ujsorokban.replace('; ', ";\n");
		ujsorokban = ujsorokban.replace('; ', ";\n");
		ujsorokban = ujsorokban.replace('; ', ";\n");
		document.getElementById("textShadowResult").value = ujsorokban;
		applytextShadow();
	});
	refreshtextShadow();
});

function applytextShadow() {
	cssEditorFricc.setValue("#demotext {\n"+ document.getElementById("textShadowResult").value +"\n}");
	sourceEditorFricc.setValue('<div id="demotext">Edit this text</div>');
	cssChanged();
	updateLeft();
	dock();
}





/*######################### 
Transform:
######################### */

var transformScale = 1;
var transformRotate = 0;
var transformTranslateX = 0;
var transformTranslateY = 0;
var transformSkewX = 0;
var transformSkewY = 0;

$( function() {
	var handle = $( "#transformScale-handle" );
	$( "#transformScale" ).slider({
	  range: "max",
	  min: 0.1, // min value
	  max: 2, // max value
	  step: 0.1,
	  value: 1,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		transformScale = ui.value;
		handle.text( transformScale );
		$("#transformScaleInput").val(transformScale);
		refreshtransform();
	  }
	});
} );
$( function() {
	var handle = $( "#transformRotate-handle" );
	$( "#transformRotate" ).slider({
	  range: "max",
	  min: 0, // min value
	  max: 360, // max value
	  step: 1,
	  value: 0,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		transformRotate = ui.value;
		handle.text( transformRotate );
		$("#transformRotateInput").val(transformRotate);
		refreshtransform();
	  }
	});
} );

$( function() {
	var handle = $( "#transformTranslateX-handle" );
	$( "#transformTranslateX" ).slider({
	  range: "max",
	  min: -50, // min value
	  max: 50, // max value
	  step: 1,
	  value: 0,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		transformTranslateX = ui.value;
		handle.text( transformTranslateX );
		$("#transformTranslateXInput").val(transformTranslateX);
		refreshtransform();
	  }
	});
} );
$( function() {
	var handle = $( "#transformTranslateY-handle" );
	$( "#transformTranslateY" ).slider({
	  range: "max",
	  min: -50, // min value
	  max: 50, // max value
	  step: 1,
	  value: 0,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		transformTranslateY = ui.value;
		handle.text( transformTranslateY );
		$("#transformTranslateYInput").val(transformTranslateY);
		refreshtransform();
	  }
	});
} );
$( function() {
	var handle = $( "#transformSkewX-handle" );
	$( "#transformSkewX" ).slider({
	  range: "max",
	  min: -90, // min value
	  max: 90, // max value
	  step: 1,
	  value: 0,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		transformSkewX = ui.value;
		handle.text( transformSkewX );
		$("#transformSkewXInput").val(transformSkewX);
		refreshtransform();
	  }
	});
} );
$( function() {
	var handle = $( "#transformSkewY-handle" );
	$( "#transformSkewY" ).slider({
	  range: "max",
	  min: -90, // min value
	  max: 90, // max value
	  step: 1,
	  value: 0,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		transformSkewY = ui.value;
		handle.text( transformSkewY );
		$("#transformSkewYInput").val(transformSkewY);
		refreshtransform();
	  }
	});
} );

var transformCode;

function refreshtransform() {
	/*
var transformScale = 1;
var transformRotate = 0;
var transformTranslateX = 0;
var transformTranslateY = 0;
var transformSkewX = 0;
var transformSkewY = 0;	
*/
	var css = 'X';
	if (transformScale != 1) {
		css += ' scale(' + transformScale + ')';
	}
	if (transformRotate != 0) {
		css += ' rotate(' + transformRotate + 'deg)';
	}	
	if ((transformTranslateX !=0) || (transformTranslateY != 0)) {
		css += ' translate(' + transformTranslateX + 'px, ' + transformTranslateY + 'px)';
	}		
	if ((transformSkewX !=0) || (transformSkewY != 0)) {
		css += ' skew(' + transformSkewX + 'deg, ' + transformSkewY + 'deg)';
	}		
	
	if (css == 'X') {
		css = 'none';
	} else {
		css = css.substring(1);
	}
	
	$( "#transformPeview" ).css( "transform", css);	
	
	transformCode = '-moz-transform:' + css + ';\n-webkit-transform:' + css + ';\n-o-transform:' + css + ';\n-ms-transform:' + css + ';\ntransform:' + css + ';';
	
	$("#transformResult").val(transformCode);
	
}

$(document).ready(function(){

	$("#transformScaleInput").change(function() {
		transformScale = $("#transformScaleInput").val();
		$("#transformScale").slider('value',transformScale);
		$("#transformScale").find(".ui-slider-handle").text(transformScale);
		refreshtransform();
	});
	$("#transformRotateInput").change(function() {
		transformRotate = $("#transformRotateInput").val();
		$("#transformRotate").slider('value',transformRotate);
		$("#transformRotate").find(".ui-slider-handle").text(transformRotate);
		refreshtransform();
	});
	$("#transformTranslateXInput").change(function() {
		transformTranslateX = $("#transformTranslateXInput").val();
		$("#transformTranslateX").slider('value',transformTranslateX);
		$("#transformTranslateX").find(".ui-slider-handle").text(transformTranslateX);
		refreshtransform();
	});
	$("#transformTranslateYInput").change(function() {
		transformTranslateY = $("#transformTranslateYInput").val();
		$("#transformTranslateY").slider('value',transformTranslateY);
		$("#transformTranslateY").find(".ui-slider-handle").text(transformTranslateY);
		refreshtransform();
	});
	$("#transformSkewXInput").change(function() {
		transformSkewX = $("#transformSkewXInput").val();
		$("#transformSkewX").slider('value',transformSkewX);
		$("#transformSkewX").find(".ui-slider-handle").text(transformSkewX);
		refreshtransform();
	});
	$("#transformSkewYInput").change(function() {
		transformSkewY = $("#transformSkewYInput").val();
		$("#transformSkewY").slider('value',transformSkewY);
		$("#transformSkewY").find(".ui-slider-handle").text(transformSkewY);
		refreshtransform();
	});

	refreshtransform();
});

function applytransform() {
	cssEditorFricc.setValue("#demo {\n"+ document.getElementById("transformResult").value +"\n}\n#demo {\n background-color: #1C6EA4;\n width: 100px;\n  color: #FFF;\n margin: 50px auto;\n text-align: center;\n}");
	sourceEditorFricc.setValue('<div id="demo">Transform Demo</div>');
	cssChanged();
	updateLeft();
	dock();
}



/*######################### 
Font family:
######################### */

var fontGeneratorFontSize = 16;
var fontGeneratorLetterSpacing = 2;
var fontGeneratorWordSpacing = 2;
var selectedTextDecoration = 'none';
var selectedTextStyle = 'normal';
var selectedTextVariant = 'normal';
var selectedTextTransform = "none";
var selectedTextWeight = 'normal';

$( function() {
	var handle = $( "#fontGeneratorWordSpacing-handle" );
	$( "#fontGeneratorWordSpacing" ).slider({
	  range: "max",
	  min: -5, // min value
	  max: 6, // max value
	  step: 0.2,
	  value: 0,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		fontGeneratorWordSpacing = ui.value;
		handle.text( fontGeneratorWordSpacing );
		refreshFontGenerator();
	  }
	});
} );
$( function() {
	var handle = $( "#fontGeneratorLetterSpacing-handle" );
	$( "#fontGeneratorLetterSpacing" ).slider({
	  range: "max",
	  min: -5, // min value
	  max: 6, // max value
	  step: 0.2,
	  value: 0,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		fontGeneratorLetterSpacing = ui.value;
		handle.text( fontGeneratorLetterSpacing );
		refreshFontGenerator();
	  }
	});
} );
$( function() {
	var handle = $( "#fontGeneratorFontSize-handle" );
	$( "#fontGeneratorFontSize" ).slider({
	  range: "max",
	  min: 5, // min value
	  max: 30, // max value
	  step: 1,
	  value: 16,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		fontGeneratorFontSize = ui.value;
		handle.text( fontGeneratorFontSize );
		refreshFontGenerator();
	  }
	});
} );




function refreshFontGenerator() {
	
	$( "#fontGeneratorPeview" ).css( "font-family", $('#selectedFontFamily').css("font-family"));
	
	$( "#fontGeneratorPeview" ).css( "font-size", fontGeneratorFontSize);
	$( "#fontGeneratorPeview" ).css( "letter-spacing", fontGeneratorLetterSpacing);
	$( "#fontGeneratorPeview" ).css( "word-spacing", fontGeneratorWordSpacing);
	$( "#fontGeneratorPeview" ).css( "color", "#" + $("#fontGeneratorColor").val());
	
	
	$( "#fontGeneratorPeview" ).css( "font-weight", selectedTextWeight);
	$( "#fontGeneratorPeview" ).css( "text-decoration", selectedTextDecoration);
	$( "#fontGeneratorPeview" ).css( "font-style", selectedTextStyle);
	$( "#fontGeneratorPeview" ).css( "font-variant", selectedTextVariant);
	$( "#fontGeneratorPeview" ).css( "text-transform", selectedTextTransform);
	
	var cssCode = "font-family: " + $('#selectedFontFamily').css("font-family") + ';';
	cssCode += '\nfont-size: ' + fontGeneratorFontSize + 'px;';
	cssCode += '\nletter-spacing: ' + fontGeneratorLetterSpacing + 'px;';
	cssCode += '\nword-spacing: ' + fontGeneratorWordSpacing + 'px;';
	cssCode += '\ncolor: #' + $("#fontGeneratorColor").val() + ';';
	
	cssCode += '\nfont-weight: ' + selectedTextWeight + ';';
	cssCode += '\ntext-decoration: ' + selectedTextDecoration + ';';
	cssCode += '\nfont-style: ' + selectedTextStyle + ';';
	cssCode += '\nfont-variant: ' + selectedTextVariant + ';';
	cssCode += '\ntext-transform: ' + selectedTextTransform + ';';

	$("#fontGeneratorResult").val(cssCode);
	
	refreshButton();
}


function applyFontGenerator() {
	cssEditorFricc.setValue("#demoFont {\n"+ $("#fontGeneratorResult").val() +"\n}");
	sourceEditorFricc.setValue('<div id="demoFont">Edit this text</div>');
	cssChanged();
	updateLeft();
	dock();
}



var lighttextFontShadowBackground = 1;

$(document).ready(function(){
	$("#selectedFontFamily").click(function() {
		$('#fontFamilySelector').toggle();
	});
	$("#fontLightBoxBackground").change(function() {
		if (lighttextFontShadowBackground == 1) {
			document.getElementById("fontGeneratorPreviewWrap").style.background = "#000000";
			lighttextFontShadowBackground = 0;
		} else {
			document.getElementById("fontGeneratorPreviewWrap").style.background = "#FFFFFF";
			lighttextFontShadowBackground = 1;			
		}
	});
	$("#fontGeneratorColor").change(function() {
		refreshFontGenerator();
	});
	$("#fontFamilySelector > div").click(function() {
		var stilus = $(this).css("font-family");
		var neve = $(this).text();
		$('#fontFamilySelector').toggle();
		$('#selectedFontFamily').text(neve);
		$('#selectedFontFamily').css("font-family",stilus);
		refreshFontGenerator();
	});
	$("#fontTextWeight > div").click(function() {
		$("#fontTextWeight > div").removeClass('selectedTextDecoration');
		$(this).addClass('selectedTextDecoration');
		selectedTextWeight = $(this).css("font-weight");
		refreshFontGenerator();
	});
	$("#fontTextDecoration > div").click(function() {
		$("#fontTextDecoration > div").removeClass('selectedTextDecoration');
		$(this).addClass('selectedTextDecoration');
		selectedTextDecoration = $(this).css("text-decoration");
		refreshFontGenerator();
	});
	$("#fontTextStyle > div").click(function() {
		$("#fontTextStyle > div").removeClass('selectedTextDecoration');
		$(this).addClass('selectedTextDecoration');
		selectedTextStyle = $(this).css("font-style");
		refreshFontGenerator();
	});	
	$("#fontTextVariant > div").click(function() {
		$("#fontTextVariant > div").removeClass('selectedTextDecoration');
		$(this).addClass('selectedTextDecoration');
		selectedTextVariant = $(this).css("font-variant");
		refreshFontGenerator();
	});
	$("#fontTextTransform > div").click(function() {
		$("#fontTextTransform > div").removeClass('selectedTextDecoration');
		$(this).addClass('selectedTextDecoration');
		selectedTextTransform = $(this).css("text-transform");
		refreshFontGenerator();
	});
	
	refreshFontGenerator();
});


/*######################### 
Background:
######################### */

var CheckerboardBackground = 1;
var backgroundPosition = '0 0';
var backgroundShiftRight = 0;
var backgroundShiftDown = 0;
var backgroundColorOpacity = 1;
var backgroundRepeat = 'no-repeat';
var backgroundAttachment = 'scroll';

$( function() {
	var handle = $( "#backgroundShiftRight-handle" );
	$( "#backgroundShiftRight" ).slider({
	  range: "max",
	  min: -50, // min value
	  max: 50, // max value
	  step: 1,
	  value: 0,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		backgroundShiftRight = ui.value;
		handle.text( backgroundShiftRight );
		backgroundPosition = backgroundShiftRight + 'px ' + backgroundShiftDown + 'px';
		refreshBackground();
		$('#backgroundPositionSelect > div > a').css("background-color",'#FFF');
	  }
	});
} );
$( function() {
	var handle = $( "#backgroundShiftDown-handle" );
	$( "#backgroundShiftDown" ).slider({
	  range: "max",
	  min: -50, // min value
	  max: 50, // max value
	  step: 1,
	  value: 0,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		backgroundShiftDown = ui.value;
		handle.text( backgroundShiftDown );
		backgroundPosition = backgroundShiftRight + 'px ' + backgroundShiftDown + 'px';
		refreshBackground();
		$('#backgroundPositionSelect > div > a').css("background-color",'#FFF');
	  }
	});
} );
$( function() {
	var handle = $( "#backgroundColorOpacity-handle" );
	$( "#backgroundColorOpacity" ).slider({
	  range: "max",
	  min: 0, // min value
	  max: 1, // max value
	  step: 0.01,
	  value: 1,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		backgroundColorOpacity = ui.value;
		handle.text( backgroundColorOpacity );
		refreshBackground();
	  }
	});
} );


function refreshBackground() {

	var backgroundColor = $("#backgroundColor").val();
		
	var backgroundColorString = '#' + backgroundColor;

	if (backgroundColorOpacity < 1) {
		backgroundColorString = 'rgba(' + hexToRgb(backgroundColor).r + ',' + hexToRgb(backgroundColor).g + ',' + hexToRgb(backgroundColor).b + ',' + backgroundColorOpacity + ')';
	}
	if (backgroundColorOpacity == 0) {
		backgroundColorString = 'transparent';
	}

	var imageString = 'url("' + $("#backgroundImageUrl").val() + '")';
	if (imageString == 'url("none")') {
		imageString = 'none';
	}
	
	var css = backgroundColorString + ' ' + imageString + ' ' + backgroundRepeat + ' ' + backgroundAttachment + ' ' + backgroundPosition;

	$( "#backgroundPeview" ).css( "background", css);	
	
	if (document.getElementById('backgroundOneLine').checked) {
		css = 'background: ' + css + ';';
	} else {
		css = 'background-color: ' + backgroundColorString + ';\n';
		css += 'background-image: ' + imageString + ';\n';
		css += 'background-repeat: ' + backgroundRepeat + ';\n';
		css += 'background-attachment: ' + backgroundAttachment + ';\n';
		css += 'background-position: ' + backgroundPosition + ';';
	}

	
	document.getElementById("backgroundResult").value = css;
	
}

function applybackground() {
	cssEditorFricc.setValue("#demo {\n"+ document.getElementById("backgroundResult").value +"\n}\n#demo {\n padding: 50px 20px; \n}");
	sourceEditorFricc.setValue('<div id="demo">Edit this text</div>');
	cssChanged();
	updateLeft();
	dock();
}

$(document).ready(function(){
	$("#backgroundImageNone").click(function() {
		document.getElementById("backgroundImageUrl").value = "none";
		refreshBackground();
	});
	$("#backgroundPositionSelect > div > a").click(function() {
		backgroundPosition = $(this).css("background-position");
		$('#backgroundPositionSelect > div > a').css("background-color",'#FFF');
		$(this).css("background-color",'#D0E4F5')
		refreshBackground();
	});

	$("#backgroundRepeatSelect > a").click(function() {
		backgroundRepeat = $(this).css("background-repeat");
		$("#backgroundRepeatSelect > a").removeClass('selected');
		$(this).addClass('selected');
		refreshBackground();
	});
	$("#backgroundAttachmentSelect > a").click(function() {
		backgroundAttachment = $(this).css("background-attachment");
		$("#backgroundAttachmentSelect > a").removeClass('selected');
		$(this).addClass('selected');
		refreshBackground();
	});	
	$("#backgroundOneLine").change(function() {
		refreshBackground();
	});	
	$("#backgroundColor").change(function() {
		refreshBackground();
	});
	$("#backgroundImageUrl").change(function() {
		refreshBackground();
	});	
	if ($('#backgroundResult').length != 0) {	refreshBackground();	}
});


/*######################### 
Background:
######################### */

var borderWidth = 2;
var borderStyle = 'solid';
var borderColorOpacity = 1;
var outlineOffset = 0;
var outline = 0;
var whichBorder = 'border';

$( function() {
	var handle = $( "#borderWidth-handle" );
	$( "#borderWidth" ).slider({
	  range: "max",
	  min: 0, // min value
	  max: 30, // max value
	  step: 1,
	  value: 2,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		borderWidth = ui.value;
		handle.text( borderWidth );
		refreshBorder();
	  }
	});
} );
$( function() {
	var handle = $( "#borderColorOpacity-handle" );
	$( "#borderColorOpacity" ).slider({
	  range: "max",
	  min: 0, // min value
	  max: 1, // max value
	  step: 0.01,
	  value: 1,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		borderColorOpacity = ui.value;
		handle.text( borderColorOpacity );
		refreshBorder();
	  }
	});
} );
$( function() {
	var handle = $( "#outlineOffset-handle" );
	$( "#outlineOffset" ).slider({
	  range: "max",
	  min: 0, // min value
	  max: 50, // max value
	  step: 1,
	  value: 0,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		outlineOffset = ui.value;
		handle.text( outlineOffset );
		refreshBorder();
	  }
	});
} );

function refreshBorder() {

	var borderColor = document.getElementById("borderColor").value;
		
	var borderColorString = '#' + borderColor;
	if (borderColorOpacity < 1) {
		borderColorString = 'rgba(' + hexToRgb(borderColor).r + ',' + hexToRgb(borderColor).g + ',' + hexToRgb(borderColor).b + ',' + borderColorOpacity + ')';
	}
	if (borderColorOpacity == 0) {
		borderColorString = 'transparent';
	}

	var css = borderWidth + 'px ' + borderStyle + ' ' + borderColorString;	
	if (outline == 0) {

		$( "#borderPeview" ).css( "border", "none");	
		$( "#borderPeview" ).css( whichBorder, css);	
		$( "#borderPeview" ).css( "outline", "none");	
		
		if (document.getElementById('borderOneLine').checked) {	/*borderOneLine*/
			css = whichBorder + ': ' + css + ';';
		} else {
			css = whichBorder + '-width: ' + borderWidth + 'px;\n';
			css += whichBorder + '-style: ' + borderStyle + ';\n';
			css += whichBorder + '-color: ' + borderColorString + ';';
		}
	} else {
		$( "#borderPeview" ).css( "outline", css);	
		$( "#borderPeview" ).css( "border", "none");
		$( "#borderPeview" ).css( "outline-offset", outlineOffset);
		
		if (document.getElementById('borderOneLine').checked) {	/*borderOneLine*/
			css = 'outline: ' + css + ';\n';
		} else {
			css = 'outline-width: ' + borderWidth + 'px;\n';
			css += 'outline-style: ' + borderStyle + ';\n';
			css += 'outline-color: ' + borderColorString + ';\n';
		}
		css += 'outline-offset: ' + outlineOffset + 'px;';	
	}

	document.getElementById("borderResult").value = css;
	refreshButton();
}

function applyborder() {
	cssEditorFricc.setValue("#demotext {\n"+ document.getElementById("borderResult").value +"\n}");
	sourceEditorFricc.setValue('<div id="demotext">Edit this text</div>');
	cssChanged();
	updateLeft();
	dock();
}

$(document).ready(function(){
	$("#borderOnly").click(function() {
		outline = 0;
		$("#borderOrOutline > a").removeClass('selected');
		$(this).addClass('selected');
		$('.visibleBorderOnly').show();
		$('.visibleOutlineOnly').hide();
		refreshBorder();
	});
	$("#outlineOnly").click(function() {
		outline = 1;
		$("#borderOrOutline > a").removeClass('selected');
		$(this).addClass('selected');
		$('.visibleBorderOnly').hide();
		$('.visibleOutlineOnly').show();
		refreshBorder();
	});
	$("#whichBorder > a").click(function() {
		$("#whichBorder > a").removeClass('selected');
		$(this).addClass('selected');
		whichBorder = $(this).attr("title");		
		refreshBorder();
	});
	$("#backgroundImageNone").click(function() {
		document.getElementById("backgroundImageUrl").value = "none";
		refreshBorder();
	});
	$("#borderStyles > a").click(function() {
		borderStyle = $(this).attr("title");
		$("#borderStyles > a").removeClass('selected');
		$(this).addClass('selected');
		refreshBorder();
	});
	$("#borderOneLine").change(function() {
		refreshBorder();
	});	
	$("#borderColor").change(function() {
		refreshBorder();
	});
	if ($('#borderResult').length != 0) {	refreshBorder();	}
});


/*######################### 
Column
######################### */

var ColumnColorOpacity = 0.5;
var columnGap = 10;
var columnCount = 3;

$( function() {
	var handle = $( "#columnCount-handle" );
	$( "#columnCount" ).slider({
	  range: "max",
	  min: 0, // min value
	  max: 8, // max value
	  step: 1,
	  value: 3,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		columnCount = ui.value;
		handle.text( columnCount );
		refreshColumn();
	  }
	});
} );
$( function() {
	var handle = $( "#columnGap-handle" );
	$( "#columnGap" ).slider({
	  range: "max",
	  min: 0, // min value
	  max: 50, // max value
	  step: 1,
	  value: 10,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		columnGap = ui.value;
		handle.text( columnGap );
		refreshColumn();
	  }
	});
} );
$( function() {
	var handle = $( "#ColumnColorOpacity-handle" );
	$( "#ColumnColorOpacity" ).slider({
	  range: "max",
	  min: 0, // min value
	  max: 1, // max value
	  step: 0.01,
	  value: 0.5,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		ColumnColorOpacity = ui.value;
		handle.text( ColumnColorOpacity );
		refreshColumn();
	  }
	});
} );


function refreshColumn() {

	var columnColor = document.getElementById("columnColor").value;
		
	var ColumnColorString = '#' + columnColor;
	if (ColumnColorOpacity < 1) {
		ColumnColorString = 'rgba(' + hexToRgb(columnColor).r + ',' + hexToRgb(columnColor).g + ',' + hexToRgb(columnColor).b + ',' + ColumnColorOpacity + ')';
	}
	if (ColumnColorOpacity == 0) {
		ColumnColorString = 'transparent';
	}
	
	var css = '1px solid ' + ColumnColorString;	
	
	$( "#columnPeview" ).css( "column-count", columnCount);
	$( "#columnPeview" ).css( "column-gap", columnGap);
	$( "#columnPeview" ).css( "column-rule", css);

	var code = '-webkit-column-count: ' + columnCount + ';\n-moz-column-count: ' + columnCount + ';\ncolumn-count: ' + columnCount + ';\n';
	code += '-webkit-column-gap: ' + columnGap + 'px;\n-moz-column-gap: ' + columnGap + 'px;\ncolumn-gap: ' + columnGap + 'px;\n';
	code += '-webkit-column-rule: 1px solid ' + ColumnColorString + ';\n-moz-column-rule: 1px solid ' + ColumnColorString + ';\ncolumn-rule: 1px solid ' + ColumnColorString + ';';


	
	document.getElementById("columnResult").value = code;
	
}

function applyColumn() {
	cssEditorFricc.setValue("#demoparagraph {\n"+ document.getElementById("columnResult").value +"\n}");
	sourceEditorFricc.setValue('<div id="demoparagraph">\n<p><strong>You can edit this section to test the interactive editor.</strong></p><p>Lorem ipsum dolor sit amet, nonumes voluptatum mel ea, cu case ceteros cum. Novum commodo malorum vix ut. Dolores consequuntur in ius, sale electram dissentiunt quo te. Cu duo omnes invidunt, eos eu mucius fabellas. Stet facilis ius te, quando voluptatibus eos in. Ad vix mundi alterum, integre urbanitas intellegam vix in.</p>\n<p>Eum facete intellegat ei, ut mazim melius usu. Has elit simul primis ne, regione minimum id cum. Sea deleniti dissentiet ea. Illud mollis moderatius ut per, at qui ubique populo. Eum ad cibo legimus, vim ei quidam fastidii.</p>\n<p>Quo debet vivendo ex. Qui ut admodum senserit partiendo. Id adipiscing disputando eam, sea id magna pertinax concludaturque. Ex ignota epicurei quo, his ex doctus delenit fabellas, erat timeam cotidieque sit in. Vel eu soleat voluptatibus, cum cu exerci mediocritatem. Malis legere at per, has brute putant animal et, in consul utamur usu.</p>\n<p>Te has amet modo perfecto, te eum mucius conclusionemque, mel te erat deterruisset. Duo ceteros phaedrum id, ornatus postulant in sea. His at autem inani volutpat. Tollit possit in pri, platonem persecuti ad vix, vel nisl albucius gloriatur no.</p>\n</div>');
	cssChanged();
	updateLeft();
}


$(document).ready(function(){

	$("#columnColor").change(function() {
		refreshColumn();
	});	

	if ($('#columnColor').length != 0) {	refreshColumn();	}
});




/*######################### 
Text Shadow:
######################### */

var buttonSizeSlider = 16;
var buttonPaddingSlider = 6;
var buttonRadiusSlider = 10;

$( function() {
	var handle = $( "#buttonSizeSlider-handle" );
	$( "#buttonSizeSlider" ).slider({
	  range: "max",
	  min: 8, // min value
	  max: 30, // max value
	  step: 1,
	  value: 16,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		buttonSizeSlider = ui.value;
		handle.text( buttonSizeSlider );
		refreshButton();
	  }
	});
} );
$( function() {
	var handle = $( "#buttonPaddingSlider-handle" );
	$( "#buttonPaddingSlider" ).slider({
	  range: "max",
	  min: 0, // min value
	  max: 30, // max value
	  step: 1,
	  value: 6,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		buttonPaddingSlider = ui.value;
		handle.text( buttonPaddingSlider );
		refreshButton();
	  }
	});
} );
$( function() {
	var handle = $( "#buttonRadiusSlider-handle" );
	$( "#buttonRadiusSlider" ).slider({
	  range: "max",
	  min: 0, // min value
	  max: 50, // max value
	  step: 1,
	  value: 10,
	  create: function() {
		handle.text( $( this ).slider( "value" ) );
	  },
	  slide: function( event, ui ) {
		buttonRadiusSlider = ui.value;
		handle.text( buttonRadiusSlider );
		refreshButton();
	  }
	});
} );



function refreshButton() {
	
	$('#buttonPreview').attr("style",'');
	
	var buttonTextColor = $("#buttonTextColor").val();
	buttonTextColor = "#" + buttonTextColor;
	css = css + "color: " + buttonTextColor + "\n";
	$( "#buttonPreview" ).css( "color", buttonTextColor);
	
	$( "#buttonPreview" ).css( "font-size", buttonSizeSlider+'px');
	$( "#buttonPreview" ).css( "line-height", buttonSizeSlider+'px');

	var paddingString = buttonPaddingSlider+'px ' + buttonPaddingSlider +'px';
	$( "#buttonPreview" ).css( "padding", paddingString);


	
	$("#buttonPreview").css("border-radius", buttonRadiusSlider + "px ");
	
	
	/*font*/
	$( "#buttonPreview" ).css( "font-family", $('#selectedFontFamily').css("font-family"));	
	$( "#buttonPreview" ).css( "font-weight", selectedTextWeight);
	$( "#buttonPreview" ).css( "text-decoration", selectedTextDecoration);
	$( "#buttonPreview" ).css( "font-style", selectedTextStyle);
	$( "#buttonPreview" ).css( "font-variant", selectedTextVariant);
	$( "#buttonPreview" ).css( "text-transform", selectedTextTransform);	
	
	/*box-shadow*/
	var color1 = '#' + document.getElementById("gradient1").value;
	var color2 = '#' + document.getElementById("gradient2").value;
	var color3 = '#' + document.getElementById("gradient3").value;
	
	if (!(document.getElementById('gradientRgba').checked)) {
		color1 = 'rgb(' + hexToRgb(color1).r + ',' + hexToRgb(color1).g + ',' + hexToRgb(color1).b + ')';
		color2 = 'rgb(' + hexToRgb(color2).r + ',' + hexToRgb(color2).g + ',' + hexToRgb(color2).b + ')';
		color3 = 'rgb(' + hexToRgb(color3).r + ',' + hexToRgb(color3).g + ',' + hexToRgb(color3).b + ')';
	}
	
	var gradientType = 'linear';
	if (gradientDirection == 'left')	{	gradientDirection2 = "to right";	}
	if (gradientDirection == 'top')	{	gradientDirection2 = "to bottom";	}
	if (gradientDirection == '-45deg')	{	gradientDirection2 = "135deg";	}
	if (gradientDirection == '45deg')	{	gradientDirection2 = "45deg";	}
	if (gradientDirection == 'center')	{	gradientDirection2 = "ellipse at center";	gradientType = 'radial';	}

	previewGradient = gradientType + '-gradient(' + gradientDirection2 +', ' + color1 + ' 0%, ';
	middle = color2 + ' ' + gradientPercent + '%, ';
	if (document.getElementById('gradientMiddle').checked) {
		previewGradient += middle;
	}
	previewGradient += color3 + ' 100%)';

	document.getElementById("buttonPreview").style.backgroundImage = previewGradient;
	
	previewGradient = 'linear-gradient(to right, ' + color1 + ' 0%, ';
	middle = color2 + ' 50%, ';
	if (document.getElementById('gradientMiddle').checked) {
		previewGradient += middle;
	}
	previewGradient += color3 + ' 100%)';
	document.getElementById("gradientProgressbar").style.backgroundImage = previewGradient;
	
	
	
	
	/*box shadow*/
	var boxShadowColor = document.getElementById("boxShadowColor").value;
	
	var boxShadowColorString = '#' + boxShadowColor;
	if (boxShadowOpacity != 1) {
		boxShadowColorString = 'rgba(' + hexToRgb(boxShadowColor).r + ',' + hexToRgb(boxShadowColor).g + ',' + hexToRgb(boxShadowColor).b + ',' + boxShadowOpacity + ')';
	}
	
	var css = boxShadowShiftRight +'px ' + boxShadowShiftDown + 'px ' + boxShadowBlurRadius + 'px ' + boxShadowSpread + 'px ' + boxShadowColorString;
	
	if (document.getElementById('boxShadowInset').checked) {
		css = 'inset ' + css;
	}
	
	$( "#buttonPreview" ).css( "box-shadow", css);	
	
	
	/*Border*/
	var borderColor = document.getElementById("borderColor").value;
		
	var borderColorString = '#' + borderColor;
	if (borderColorOpacity < 1) {
		borderColorString = 'rgba(' + hexToRgb(borderColor).r + ',' + hexToRgb(borderColor).g + ',' + hexToRgb(borderColor).b + ',' + borderColorOpacity + ')';
	}
	if (borderColorOpacity == 0) {
		borderColorString = 'transparent';
	}

	var css = borderWidth + 'px ' + borderStyle + ' ' + borderColorString;	

	$( "#buttonPreview" ).css( "border", "none");	
	$( "#buttonPreview" ).css( whichBorder, css);		
	
	var css = '.myButton {\n' + $("#buttonPreview").attr("style") + ' display: inline-block;}\n.myButton:hover {\nbackground: ' + color1 +'; }\n.myButton:active {\nbackground: ' + color3 +'; }';
		
	$("#buttonResult").val(css);
	
}

function applyButtonStyle() {
	cssEditorFricc.setValue($('#buttonResult').val());
	sourceEditorFricc.setValue('<div class="myButton">Change The Text</div>');
	cssChanged();
	updateLeft();
	dock();
}

$(document).ready(function(){

	$("#buttonPreview").hover(function() {
		$( "#buttonPreview" ).css( "background", '#' + document.getElementById("gradient1").value);
	});
	$("#buttonPreview").mouseout(function() {
		refreshButton();
	});	
	$("#buttonPreview").mousedown(function() {
		$( "#buttonPreview" ).css( "background", '#' + document.getElementById("gradient3").value);
	});
	$("#buttonPreview").mouseup(function() {
		$( "#buttonPreview" ).css( "background", '#' + document.getElementById("gradient1").value);
	});
	
	$("#buttonTextColor").change(function() {
		refreshButton();
	});
	
});
/*######################### 
Color
######################### */
function updateColor(color) {
	selectedColor = document.getElementById('myColor').value;

	colr = parseInt((selectedColor.charAt(0)+selectedColor.charAt(1)).toString(16), 16);
	colg = parseInt((selectedColor.charAt(2)+selectedColor.charAt(3)).toString(16), 16);
	colb = parseInt((selectedColor.charAt(4)+selectedColor.charAt(5)).toString(16), 16);
		
	rgb2cmyk(colr,colg,colb);
	var komplimentarisa = invertColor(selectedColor);

	var popul = "";
	
	ovlashato = $('#myColor').css("color");  //feher vagy fekete, amelyk jobban latszik a hatteren
	
	document.getElementById('selectedbackgr').innerHTML = '<div class="szinInfok" style="color: '+ ovlashato + '"><div class="saveOrLink"><a style="color:#'+ color + ';background-color:'+ ovlashato + '" class="colorLink" href="http://rgbcolorcode.com/color/' + selectedColor + '" target="_blank" title="Open on new page">Link</a></div><span class="uppercase">#' + color + '</span><br />rgb(' + colr + ',' + colg + ',' + colb + ')<br />CMYK( ' + colc + ', ' + colm + ', ' + coly + ', ' + colk + ')<br />HSV(' + colhue +', '+ colsat + ', ' + colval + ') </div>';

	document.getElementById('selectedbackgr').style.backgroundColor = '#'+color;
	$("h3").css("background-color", '#'+color);
	$("#colorToUse>div").css("border-top", '3px solid #'+color);
	$("h3").css("color", '#'+ ovlashato);

    $( "#red" ).slider( "value", colr );
    $( "#green" ).slider( "value", colg );
    $( "#blue" ).slider( "value", colb );

    $( "#slideh" ).slider( "value", colhue );
    $( "#slides" ).slider( "value", colsat );
    $( "#slidev" ).slider( "value", colval );

    $( "#cyan" ).slider( "value", colc*100 );
    $( "#magenta" ).slider( "value", colm*100 );
    $( "#yellow" ).slider( "value", coly*100 );
    $( "#key" ).slider( "value", colk*100 );
	
	
	
	document.getElementById('colorToUse').innerHTML = '<div class="demo1">\n<div class="inputKontener">\n<input onClick="this.select();" value="color:#' + selectedColor + ';" />\n</div>\n<div class="explanation1" style="background-color: '+ ovlashato + ';">\n<span style="color:#' + selectedColor + '">Text color</span>\n</div>\n</div>\n<div class="demo2">\n<div class="inputKontener">\n<input onClick="this.select();" value="background-color:#' + selectedColor + ';" />\n</div>\n<div class="explanation2" style="background-color: #' + selectedColor + '; color: '+ ovlashato + ';">\nBackground color \n</div>\n</div>\n<div class="demo3">\n<div class="inputKontener">\n<input onClick="this.select();" value="border: 3px solid #' + selectedColor + ';"/ >\n</div>\n<div class="explanation3" style="border: 3px solid #' + selectedColor + '">\nBox border\n</div>\n</div>\n<div class="demo4">\n<div class="inputKontener">\n<input onClick="this.select();" value="text-shadow: 1px 2px 2px #' + selectedColor + ';" / >\n</div>\n<div class="explanation4" style="text-shadow: 1px 2px 2px #' + selectedColor + ';">\nText shadow\n</div>\n</div>\n<div class="demo5">\n<div class="inputKontener">\n<input onClick="this.select();" value="box-shadow: 2px 2px 7px 1px #' + selectedColor + ';" / >\n</div>\n<div class="explanation5" style="  box-shadow: 2px 2px 7px 1px #' + selectedColor + ';">\nBox shadow\n</div>\n</div>';
	
	
}
function aplikal(szin) {
	document.getElementById('myColor').value = szin;
	console.log(szin);
	
	updateColor(szin);
}

function rgbchanged() {
	var newvalue = (Math.round(255 * document.getElementById('colorr').value)).toString(16);
	newvalue = newvalue + (Math.round(255 * document.getElementById('colorg').value)).toString(16);
	newvalue = newvalue + (Math.round(255 * document.getElementById('colorb').value)).toString(16);	
	
	document.getElementById('myColor').color.fromString(newvalue);
}




function invertColor(hex) {

    thisrgb = new Object();

    thisrgb.r = parseInt( hex.substring(0, 2), 16);;
    thisrgb.g = parseInt( hex.substring(2, 4), 16);;
    thisrgb.b = parseInt( hex.substring(4, 6), 16);;
 
    // complement
    temprgb=thisrgb;
    temphsv=RGB2HSV(temprgb);
    temphsv.hue=HueShift(temphsv.hue,180.0);
    temprgb=HSV2RGB(temphsv);
    
    hex_out = "rgb(" + temprgb.r + "," + temprgb.g + "," + temprgb.b + ")";

	hex_out = ketjegyu(temprgb.r).toString(16) + ketjegyu(temprgb.g).toString(16) + ketjegyu(temprgb.b).toString(16);
	hex_out = hex_out.toUpperCase();
	return hex_out;
}


function RGB2HSV(rgb) {
    hsv = new Object();
    max=max3(rgb.r,rgb.g,rgb.b);
    dif=max-min3(rgb.r,rgb.g,rgb.b);
    hsv.saturation=(max==0.0)?0:(100*dif/max);
    if (hsv.saturation==0) hsv.hue=0;
    else if (rgb.r==max) hsv.hue=60.0*(rgb.g-rgb.b)/dif;
    else if (rgb.g==max) hsv.hue=120.0+60.0*(rgb.b-rgb.r)/dif;
    else if (rgb.b==max) hsv.hue=240.0+60.0*(rgb.r-rgb.g)/dif;
    if (hsv.hue<0.0) hsv.hue+=360.0;
    hsv.value=Math.round(max*100/255);
    hsv.hue=Math.round(hsv.hue);
    hsv.saturation=Math.round(hsv.saturation);
	colhue = hsv.hue;
	colsat = hsv.saturation;
	colval = hsv.value;
    return hsv;
}


function CMYK2RGB(C,M,Y,K){	
	var c = C / 100;
	var m = M / 100;
	var y = Y / 100;
	var k = K / 100;

	var r = 1 - Math.min( 1, c * ( 1 - k ) + k );
	var g = 1 - Math.min( 1, m * ( 1 - k ) + k );
	var b = 1 - Math.min( 1, y * ( 1 - k ) + k );

	r = Math.round( r * 255 );
	g = Math.round( g * 255 );
	b = Math.round( b * 255 );

	return rgb2hex(r,g,b);
}

function HSV2RGB(hsv) {
    var rgb=new Object();
    if (hsv.saturation==0) {
        rgb.r=rgb.g=rgb.b=Math.round(hsv.value*2.55);
    } else {
        hsv.hue/=60;
        hsv.saturation/=100;
        hsv.value/=100;
        i=Math.floor(hsv.hue);
        f=hsv.hue-i;
        p=hsv.value*(1-hsv.saturation);
        q=hsv.value*(1-hsv.saturation*f);
        t=hsv.value*(1-hsv.saturation*(1-f));
        switch(i) {
        case 0: rgb.r=hsv.value; rgb.g=t; rgb.b=p; break;
        case 1: rgb.r=q; rgb.g=hsv.value; rgb.b=p; break;
        case 2: rgb.r=p; rgb.g=hsv.value; rgb.b=t; break;
        case 3: rgb.r=p; rgb.g=q; rgb.b=hsv.value; break;
        case 4: rgb.r=t; rgb.g=p; rgb.b=hsv.value; break;
        default: rgb.r=hsv.value; rgb.g=p; rgb.b=q;
        }
        rgb.r=Math.round(rgb.r*255);
        rgb.g=Math.round(rgb.g*255);
        rgb.b=Math.round(rgb.b*255);
    }
    return rgb;
}

function min3(a,b,c) {
    return (a<b)?((a<c)?a:c):((b<c)?b:c);
}

function max3(a,b,c) {
    return (a>b)?((a>c)?a:c):((b>c)?b:c);
}

function HueShift(h,s) {
    h+=s; while (h>=360.0) h-=360.0;
    while (h<0.0) h+=360.0;
    return h;
}


// CMYK
function rgb2cmyk(r,g,b) {
 var computedC = 0;
 var computedM = 0;
 var computedY = 0;
 var computedK = 0;

 //remove spaces from input RGB values, convert to int
 var r = parseInt( (''+r).replace(/\s/g,''),10 ); 
 var g = parseInt( (''+g).replace(/\s/g,''),10 ); 
 var b = parseInt( (''+b).replace(/\s/g,''),10 ); 

 if ( r==null || g==null || b==null ||
     isNaN(r) || isNaN(g)|| isNaN(b) )
 {
   alert ('Please enter numeric RGB values!');
   return;
 }
 if (r<0 || g<0 || b<0 || r>255 || g>255 || b>255) {
   alert ('RGB values must be in the range 0 to 255.');
   return;
 }

 // BLACK
 if (r==0 && g==0 && b==0) {
  computedK = 1;
  return [0,0,0,1];
 }

 computedC = 1 - (r/255);
 computedM = 1 - (g/255);
 computedY = 1 - (b/255);

 var minCMY = Math.min(computedC,
              Math.min(computedM,computedY));
 computedC = (computedC - minCMY) / (1 - minCMY) ;
 computedM = (computedM - minCMY) / (1 - minCMY) ;
 computedY = (computedY - minCMY) / (1 - minCMY) ;
 computedK = minCMY;

 colc = Math.round(computedC*10000)/10000;
 colm = Math.round(computedM*10000)/10000;
 coly = Math.round(computedY*10000)/10000;
 colk = Math.round(computedK*10000)/10000;
 
 return [computedC,computedM,computedY,computedK];
}


function ketjegyu(x) {
	if (x < 10) {
		return "0" + x;
	} else {
		return x;
	}
}


/*jQuery color slider RGB*/
  function rgb2hex(r, g, b) {
    var hex = [
      r.toString( 16 ),
      g.toString( 16 ),
      b.toString( 16 )
    ];
    $.each( hex, function( nr, val ) {
      if ( val.length === 1 ) {
        hex[ nr ] = "0" + val;
      }
    });
    return hex.join( "" ).toUpperCase();
  }
  function refreshSwatch() {
    var red = $( "#red" ).slider( "value" ),
      green = $( "#green" ).slider( "value" ),
      blue = $( "#blue" ).slider( "value" ),
      hex = rgb2hex( red, green, blue );
	document.getElementById('swatch').innerHTML = '<div style="background-color:#' + hex +'"><div onclick="aplikal(\''+hex+'\');" class="aplikalo" title="Activate">&nearr;</div><input onClick="this.select();" value=#' + hex + ' /> </div>';
  }
  $(function() {
    $( "#red, #green, #blue" ).slider({
      orientation: "horizontal",
      range: "min",
      max: 255,
      value: 127,
      slide: refreshSwatch,
      change: refreshSwatch
    });
    $( "#red" ).slider( "value", 255 );
    $( "#green" ).slider( "value", 255 );
    $( "#blue" ).slider( "value", 255 );
  });

  

/*jQuery color slider HSV  HSV2RGB(Object {saturation: 42, hue: 6, value: 100})*/
  function refreshSwatch3() {
    var slideh = $( "#slideh" ).slider( "value" ),
      slides = $( "#slides" ).slider( "value" ),
      slidev = $( "#slidev" ).slider( "value" );
	var hsvobj = {
		saturation: slides,
		hue: slideh,
		value: slidev
	};
	var temprgb=HSV2RGB(hsvobj);
	var hex = rgb2hex(temprgb.r,temprgb.g,temprgb.b)

	document.getElementById('swatch3').innerHTML = '<div style="background-color:#' + hex +'"><div onclick="aplikal(\''+hex+'\');" class="aplikalo" title="Activate">&nearr;</div><input onClick="this.select();" value=#' + hex + ' /> </div>';
  }
  $(function() {
    $( "#slideh" ).slider({
      orientation: "horizontal",
      range: "min",
      max: 360,
      slide: refreshSwatch3,
      change: refreshSwatch3
    });
    $( "#slideh" ).slider( 0 );
  });
  $(function() {
    $( "#slides" ).slider({
      orientation: "horizontal",
      range: "min",
      max: 100,
      slide: refreshSwatch3,
      change: refreshSwatch3
    });
    $( "#slides" ).slider( 0 );
  });
  $(function() {
    $( "#slidev" ).slider({
      orientation: "horizontal",
      range: "min",
      max: 100,
      slide: refreshSwatch3,
      change: refreshSwatch3
    });
    $( "#slidev" ).slider( 0 );
  });
  
  
/*jQuery color slider CMYK*/

  function refreshSwatch2() {
    var cyan = $( "#cyan" ).slider( "value" ),
      magenta = $( "#magenta" ).slider( "value" ),
      yellow = $( "#yellow" ).slider( "value" ),
      key = $( "#key" ).slider( "value" ),
      hex = CMYK2RGB( cyan, magenta, yellow, key );
	  document.getElementById('swatch2').innerHTML = '<div style="background-color:#' + hex +'"><div onclick="aplikal(\''+hex+'\');" class="aplikalo" title="Activate">&nearr;</div><input onClick="this.select();" value=#' + hex + ' /> </div>';
  }
  $(function() {
    $( "#cyan, #magenta, #yellow, #key" ).slider({
      orientation: "horizontal",
      range: "min",
      max: 100,
      value: 0.5,
      slide: refreshSwatch2,
      change: refreshSwatch2
    });
    $( "#cyan" ).slider( "value", 0 );
    $( "#magenta" ).slider( "value", 0 );
    $( "#yellow" ).slider( "value", 0 );
    $( "#key" ).slider( "value", 0 );
  });



function getUrlVars() {
	var vars = {};
	var parts = window.location.href.replace(/[?&]+([^=&]+)=([^&]*)/gi, function(m,key,value) {
		vars[key] = value;
	});
	return vars;
}


function updatePxEm() {
	var base = Number($('#pxemParent').val());
	var pxem1 = Number($('#pxem1').val());
	var pxem2 = Number($('#pxem2').val());
	
	$('#pxem12').html('');
	if (pxem1 > 0) {
		$('#pxem12').html(parseFloat((base/pxem1).toFixed(3))+' em');
	}
	$('#pxem22').html('');
	if (pxem2 > 0) {
		$('#pxem22').html(parseFloat((base*pxem2).toFixed(3))+' px');
	}
	
}

$( document ).ready(function() {
	if ($('#myColor').length != 0) {	updateColor('1C6EA4');	}
		
	refreshButton();
	
	$("#pxemParent, #pxem1, #pxem2").change(function() {
		updatePxEm();
	});	
	$("#pxemParent, #pxem1, #pxem2").keyup(function() {
		updatePxEm();
	});	
	
});







































