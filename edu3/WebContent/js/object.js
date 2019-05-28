/**
 * 자바스크립트 객체
 */

const log = console.log;

let array = ['가','하','다','바'];

//array.length
//array[0]
//array.pop()

//객체 만들기 싱글톤 방법
var student = {
		name : "홍길동",
		ko:99,
		eng:100,
		sum:function(){
			return this.ko+this.eng;
		},
		avg:function(){
			return this.sum()/2;
		}
}

student.name
student["name"]
student.address='서울'
delete student.address
//
//for(let i in student){
//	log(student[i])
//}
//for(let i in student){
//	log(`${i},${student[i]}`);
//}
//// 숫자  1옆의 `주의

//자바스크립트의 배열이군
var product = [
	{name : '바나나', price : 900},
	{name : '체리', price : 9000},
	{name : '사과', price : 1200},
	{name : '배',price : 1900}
]

//var product = [
//	   {name : '바나나', price : 900},
//	   {name : '체리', price : 9000},
//	   {name : '사과', price : 1200},
//	   {name : '배',
//	      price : 1900,
//	      print:function(){
//	         log(this.name," ",this.price)
//	      }   
//	   }
//	]

product[0].name
product[0].price
//product[0].print()

function print(data){
	log(data.name," ",data.price)
}

print(product[1])

// 자바스크립트 객체 => !!!생성자 함수!!!를 통한 객체생성
function Student(name,ko,eng) {
		this.name = name,
		this.ko=ko,
		this.eng=eng
}

var s1 = new Student("홍길동",99,55);
var s2 = new Student("김길동",85,84);

// 뭔가 ... 프로토타입 ?... 이래...
Student.prototype.sum=function(){
	return this.ko+this.eng;
}

Student.prototype.avg=function(){
	return this.sum()/2;
}

var students = [
	new Student("홍길동",99,55),
	new Student("김길동",85,84),
	new Student("고길동",19,65),
	new Student("최길동",59,55),
	new Student("박길동",75,37)
]

log('평균 list')
for(let data of students){
	log(data.avg())
}

// 이것은 오버라이딩
s2.toString = function(){
	return this.name + " " + this.avg();
}
