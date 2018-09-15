// 完美运动框架
function move(obj,json,fnEnd)
{
	clearInterval(obj.timer);
	obj.timer = setInterval(function(){
		var bStop = true;  //假设所有值都已经到达
		for(var attr in json)
		{
			var current = 0;
			if(attr == 'opacity')
			{
				current = Math.round(100*parseFloat(getStyle(obj,attr)));
			}
			else
			{
				current = parseInt(getStyle(obj,attr));
			}			
			var speed = (json[attr]-current)/4;
			speed = speed > 0 ? Math.ceil(speed) : Math.floor(speed);
			if(current != json[attr])   //判断每一个目标是否到达，只要没有到达，就将bStop=false
			{
				bStop = false;
			}
		
			if(attr == 'opacity')
			{
				obj.style.filter = 'alpha(opacity:'+(current+speed)+')';
				obj.style[attr] = (current+speed)/100;
			}
			else
			{
				obj.style[attr] = current + speed + 'px';
			}
		}
		if(bStop)
		{
			clearInterval(obj.timer);
			if(fnEnd)fnEnd();
		}
	},30);
}

// 获取非行间样式
function getStyle(obj,name)
{
	if(obj.currentStyle)
	{
		return obj.currentStyle[name];  //兼容IE
	}	
	else
	{
		return	getComputedStyle(obj,false)[name];  //兼容谷歌和FF
	}
}