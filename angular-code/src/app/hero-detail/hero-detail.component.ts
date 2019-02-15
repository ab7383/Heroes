import { Component, OnInit,Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';

import { Hero } from '../hero';
import { HeroService } from '../hero.service';

@Component({
  selector: 'app-hero-detail',
  templateUrl: './hero-detail.component.html',
  styleUrls: ['./hero-detail.component.css']
})
export class HeroDetailComponent implements OnInit {

  hero:Hero;
  options : any;
  map:{[key:string] : number} = {};
  constructor(
    private route : ActivatedRoute,
    private heroService : HeroService,
    private location : Location,
  ) {
    this.charToNumber();
   }

  ngOnInit() {
    this.getHero();
  }

  getHero():void
  {
    const id = + this.route.snapshot.paramMap.get('id');
    this.heroService.getHero(id).subscribe(hero =>{ 
      this.radarChart(hero);
      return this.hero = hero; });
  }

  goBack(): void {
    this.location.back();
  }

  save(): void {
    this.heroService.updateHero(this.hero)
      .subscribe(() => this.goBack());
  }
  
  radarChart(hero : Hero):void{
    this.options = {
      title : {
          text: hero.standName,
          x : 'center',
      },
      tooltip : {
          trigger: 'axis'
      },
      toolbox: {
          show : false,
          feature : {
              mark : {show: true},
              saveAsImage : {show: true}
          }
      },
      calculable : true,
      polar : [
          {
              indicator : [
                  {text : '力量', max  : 100},
                  {text : '速度', max  : 100},
                  {text : '成长性', max  : 100},
                  {text : '精确度', max  : 100},
                  {text : '持久力', max  : 100},
                  {text : '射程', max  : 100}
              ],
              radius : 130
          }
      ],
      series : [
          {
              name: '替身数据',
              type: 'radar',
              itemStyle: {
                  normal: {
                    color:'#87CEEB',
                      areaStyle: {
                          type: 'default'
                      }
                  }
              },
              data : [
                  {
                      value : [this.map[hero.strength],
                               this.map[hero.speed], 
                               this.map[hero.growth], 
                               this.map[hero.precise], 
                               this.map[hero.persistentce], 
                               this.map[hero.distance]]
                  }
              ]
          }
      ]
  };
  }

  charToNumber() : void
  {
    this.map["A"] = 100;
    this.map["B"] = 80;
    this.map["C"] = 60;
    this.map["D"] = 40;
    this.map["E"] = 20;
    
  } 
}
