环境：
    JDK1.8
    angular7.2.0
    Mysql
    其他都在maven里面。
    
数据库：
    表名：user
    字段：id   int
    字段: name varchar(8) 
    字段: standName varchar(8)
    字段: strength varchar(8)
    字段: speed varchar(8)
    字段: distance varchar(8)
    字段: growth varchar(8)
    字段: precise varchar(8)
    字段: persistentce varchar(8)
    字段: description varchar(8)

    SQL:
       CREATE TABLE `user` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `name` varchar(64) DEFAULT NULL COMMENT '名字',
        `standName` varchar(64) DEFAULT NULL COMMENT '替身名字',
        `strength` varchar(8) DEFAULT 'D' COMMENT '力量',
        `speed` varchar(8) DEFAULT 'D' COMMENT '速度',
        `distance` varchar(8) DEFAULT 'D' COMMENT '射程',
        `growth` varchar(8) DEFAULT 'D' COMMENT '成长性',
        `precise` varchar(8) DEFAULT 'D' COMMENT '精密度',
        `persistentce` varchar(8) DEFAULT 'D' COMMENT '持久性',
        `description` varchar(256) DEFAULT NULL COMMENT '描述',
         PRIMARY KEY (`id`) 
        ) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

        #
        # Data for table "user"
        #

        INSERT INTO `user` VALUES 
        (11,'空条承太郎','白金之星','A','A','C','A','A','A','人型，近距离力量型，具有高精度动作与快速的反应力，与一般替身相比有着压倒性 的攻击力，速度快到超过光速，特殊能力是暂停时间，只有本体能在暂停的时间内进行行动，堪称是史上最强、无敌的替身能力。'),
        (12,'穆罕默德·阿布德尔','红色魔术师','B','B','C','D','C','B','鸟人外型，具有控制火炎与热的能力，火焰操纵，其温度可以融化钢铁'),(13,'乔瑟夫·乔斯达','紫色隐者','D','C','D','E','D','A','外观类似荆棘，透过相机、电视等物品进行“念照”拍摄，有透视远方的能力。'),
        (14,'花京院典明','绿色法皇','C','B','A','D','C','B','由绳状物构成人型外观，也可编织成结界，依附人体可控制意志，可喷射宝石状的体液作强力穿刺攻击。'),
        (15,'约翰·皮耶尔·波鲁那雷夫','银色战车','C','A','C','C','B','B','能使出快速的西洋剑攻击，爆铠后可大幅提升其速度。'),
        (16,'迪奥','世界','A','A','C','B','B','A','具有高速与强大力量，特殊能力是暂停时间，并且能在暂停的时间内行动。'),
        (17,'东方仗助','疯狂钻石','A','A','D','C','B','B','高速与强大力量，具有将破坏物恢复原貌的能力，但对自己无效。'),
        (18,'虹村亿泰','轰炸空间','B','B','D','C','C','C','具有消去空间的能力，除了作为攻击敌人之外，也可运用于瞬间移动物体。'),
        (19,'广濑康一','回声','B','B','C','A','C','B','回声有ACT1,ACT2,ACT3阶段。ACT1将声音化作文字嵌入目标上，使对方听到该文字的无限回音。ACT2将声音化作的文字具现化，产生与字义相同的效果。ACT3身材矮小人型，借由攻击增加目标重量，使对手重到无法行动。'),
        (20,'岸边露伴','天堂之门','D','B','B','A','C','B','将看到其漫画或替身的人的身体变成书页,读取对方记忆中的资料、行为以及个性。同时也能以书写的方式下达命令。例如「不能攻击岸边露伴」，甚至是原本办不到的「以70KM往后飞出去」也能做到'),
        (21,'吉良吉影','杀手皇后','A','B','D','A','B','B','能将碰触过的物体变成炸弹。炸弹的引爆形式有两种，一种是接触到炸弹的人会被炸掉，而变成炸弹的物体则没事，另外一个是变成炸弹的物体自己爆炸。');

