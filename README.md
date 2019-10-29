# FallingView-master
自定义view,水滴下落效果

ico图标可以更改为其他
在布局文件添加fallingview控件


初始化：
//初始化一个水滴样式的fallObject
        FallObject.Builder builder = new FallObject.Builder(getResources().getDrawable(R.drawable.ic_rain));
        FallObject fallObject = builder
                .setSpeed(7,true)
                .setSize(50,50,true)
                .setWind(5,true,true)
                .build();

        fallingView = (FallingView) findViewById(R.id.fallView);
        fallingView.addFallObject(fallObject,100);//添加50个下落物体对象
    }
