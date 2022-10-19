(function(){/*

 Copyright The Closure Library Authors.
 SPDX-License-Identifier: Apache-2.0
*/
'use strict';var l;function aa(a){var b=0;return function(){return b<a.length?{done:!1,value:a[b++]}:{done:!0}}}
var ba="function"==typeof Object.defineProperties?Object.defineProperty:function(a,b,c){if(a==Array.prototype||a==Object.prototype)return a;a[b]=c.value;return a};
function da(a){a=["object"==typeof globalThis&&globalThis,a,"object"==typeof window&&window,"object"==typeof self&&self,"object"==typeof global&&global];for(var b=0;b<a.length;++b){var c=a[b];if(c&&c.Math==Math)return c}throw Error("Cannot find global object");}
var ea=da(this);function n(a,b){if(b)a:{var c=ea;a=a.split(".");for(var d=0;d<a.length-1;d++){var e=a[d];if(!(e in c))break a;c=c[e]}a=a[a.length-1];d=c[a];b=b(d);b!=d&&null!=b&&ba(c,a,{configurable:!0,writable:!0,value:b})}}
n("Symbol",function(a){function b(f){if(this instanceof b)throw new TypeError("Symbol is not a constructor");return new c(d+(f||"")+"_"+e++,f)}
function c(f,g){this.i=f;ba(this,"description",{configurable:!0,writable:!0,value:g})}
if(a)return a;c.prototype.toString=function(){return this.i};
var d="jscomp_symbol_"+(1E9*Math.random()>>>0)+"_",e=0;return b});
n("Symbol.iterator",function(a){if(a)return a;a=Symbol("Symbol.iterator");for(var b="Array Int8Array Uint8Array Uint8ClampedArray Int16Array Uint16Array Int32Array Uint32Array Float32Array Float64Array".split(" "),c=0;c<b.length;c++){var d=ea[b[c]];"function"===typeof d&&"function"!=typeof d.prototype[a]&&ba(d.prototype,a,{configurable:!0,writable:!0,value:function(){return ha(aa(this))}})}return a});
function ha(a){a={next:a};a[Symbol.iterator]=function(){return this};
return a}
function p(a){var b="undefined"!=typeof Symbol&&Symbol.iterator&&a[Symbol.iterator];return b?b.call(a):{next:aa(a)}}
function ia(a){if(!(a instanceof Array)){a=p(a);for(var b,c=[];!(b=a.next()).done;)c.push(b.value);a=c}return a}
function ja(a,b){return Object.prototype.hasOwnProperty.call(a,b)}
var ka="function"==typeof Object.assign?Object.assign:function(a,b){for(var c=1;c<arguments.length;c++){var d=arguments[c];if(d)for(var e in d)ja(d,e)&&(a[e]=d[e])}return a};
n("Object.assign",function(a){return a||ka});
var ma="function"==typeof Object.create?Object.create:function(a){function b(){}
b.prototype=a;return new b},oa=function(){function a(){function c(){}
new c;Reflect.construct(c,[],function(){});
return new c instanceof c}
if("undefined"!=typeof Reflect&&Reflect.construct){if(a())return Reflect.construct;var b=Reflect.construct;return function(c,d,e){c=b(c,d);e&&Reflect.setPrototypeOf(c,e.prototype);return c}}return function(c,d,e){void 0===e&&(e=c);
e=ma(e.prototype||Object.prototype);return Function.prototype.apply.call(c,e,d)||e}}(),qa;
if("function"==typeof Object.setPrototypeOf)qa=Object.setPrototypeOf;else{var ra;a:{var sa={a:!0},ta={};try{ta.__proto__=sa;ra=ta.a;break a}catch(a){}ra=!1}qa=ra?function(a,b){a.__proto__=b;if(a.__proto__!==b)throw new TypeError(a+" is not extensible");return a}:null}var ua=qa;
function u(a,b){a.prototype=ma(b.prototype);a.prototype.constructor=a;if(ua)ua(a,b);else for(var c in b)if("prototype"!=c)if(Object.defineProperties){var d=Object.getOwnPropertyDescriptor(b,c);d&&Object.defineProperty(a,c,d)}else a[c]=b[c];a.Z=b.prototype}
function va(){this.C=!1;this.m=null;this.j=void 0;this.i=1;this.o=this.s=0;this.u=this.l=null}
function wa(a){if(a.C)throw new TypeError("Generator is already running");a.C=!0}
va.prototype.N=function(a){this.j=a};
function xa(a,b){a.l={Zb:b,ic:!0};a.i=a.s||a.o}
va.prototype.return=function(a){this.l={return:a};this.i=this.o};
function v(a,b,c){a.i=c;return{value:b}}
va.prototype.B=function(a){this.i=a};
function ya(a,b,c){a.s=b;void 0!=c&&(a.o=c)}
function za(a,b){a.i=b;a.s=0}
function Aa(a){a.s=0;var b=a.l.Zb;a.l=null;return b}
function Ba(a){a.u=[a.l];a.s=0;a.o=0}
function Ca(a){var b=a.u.splice(0)[0];(b=a.l=a.l||b)?b.ic?a.i=a.s||a.o:void 0!=b.B&&a.o<b.B?(a.i=b.B,a.l=null):a.i=a.o:a.i=0}
function Da(a){this.i=new va;this.j=a}
function Ea(a,b){wa(a.i);var c=a.i.m;if(c)return Fa(a,"return"in c?c["return"]:function(d){return{value:d,done:!0}},b,a.i.return);
a.i.return(b);return Ga(a)}
function Fa(a,b,c,d){try{var e=b.call(a.i.m,c);if(!(e instanceof Object))throw new TypeError("Iterator result "+e+" is not an object");if(!e.done)return a.i.C=!1,e;var f=e.value}catch(g){return a.i.m=null,xa(a.i,g),Ga(a)}a.i.m=null;d.call(a.i,f);return Ga(a)}
function Ga(a){for(;a.i.i;)try{var b=a.j(a.i);if(b)return a.i.C=!1,{value:b.value,done:!1}}catch(c){a.i.j=void 0,xa(a.i,c)}a.i.C=!1;if(a.i.l){b=a.i.l;a.i.l=null;if(b.ic)throw b.Zb;return{value:b.return,done:!0}}return{value:void 0,done:!0}}
function Ha(a){this.next=function(b){wa(a.i);a.i.m?b=Fa(a,a.i.m.next,b,a.i.N):(a.i.N(b),b=Ga(a));return b};
this.throw=function(b){wa(a.i);a.i.m?b=Fa(a,a.i.m["throw"],b,a.i.N):(xa(a.i,b),b=Ga(a));return b};
this.return=function(b){return Ea(a,b)};
this[Symbol.iterator]=function(){return this}}
function Ia(a){function b(d){return a.next(d)}
function c(d){return a.throw(d)}
return new Promise(function(d,e){function f(g){g.done?d(g.value):Promise.resolve(g.value).then(b,c).then(f,e)}
f(a.next())})}
function x(a){return Ia(new Ha(new Da(a)))}
function Ja(){for(var a=Number(this),b=[],c=a;c<arguments.length;c++)b[c-a]=arguments[c];return b}
n("Reflect",function(a){return a?a:{}});
n("Reflect.construct",function(){return oa});
n("Reflect.setPrototypeOf",function(a){return a?a:ua?function(b,c){try{return ua(b,c),!0}catch(d){return!1}}:null});
n("Promise",function(a){function b(g){this.i=0;this.l=void 0;this.j=[];this.C=!1;var h=this.m();try{g(h.resolve,h.reject)}catch(k){h.reject(k)}}
function c(){this.i=null}
function d(g){return g instanceof b?g:new b(function(h){h(g)})}
if(a)return a;c.prototype.j=function(g){if(null==this.i){this.i=[];var h=this;this.l(function(){h.o()})}this.i.push(g)};
var e=ea.setTimeout;c.prototype.l=function(g){e(g,0)};
c.prototype.o=function(){for(;this.i&&this.i.length;){var g=this.i;this.i=[];for(var h=0;h<g.length;++h){var k=g[h];g[h]=null;try{k()}catch(m){this.m(m)}}}this.i=null};
c.prototype.m=function(g){this.l(function(){throw g;})};
b.prototype.m=function(){function g(m){return function(q){k||(k=!0,m.call(h,q))}}
var h=this,k=!1;return{resolve:g(this.L),reject:g(this.o)}};
b.prototype.L=function(g){if(g===this)this.o(new TypeError("A Promise cannot resolve to itself"));else if(g instanceof b)this.R(g);else{a:switch(typeof g){case "object":var h=null!=g;break a;case "function":h=!0;break a;default:h=!1}h?this.K(g):this.s(g)}};
b.prototype.K=function(g){var h=void 0;try{h=g.then}catch(k){this.o(k);return}"function"==typeof h?this.T(h,g):this.s(g)};
b.prototype.o=function(g){this.N(2,g)};
b.prototype.s=function(g){this.N(1,g)};
b.prototype.N=function(g,h){if(0!=this.i)throw Error("Cannot settle("+g+", "+h+"): Promise already settled in state"+this.i);this.i=g;this.l=h;2===this.i&&this.P();this.u()};
b.prototype.P=function(){var g=this;e(function(){if(g.H()){var h=ea.console;"undefined"!==typeof h&&h.error(g.l)}},1)};
b.prototype.H=function(){if(this.C)return!1;var g=ea.CustomEvent,h=ea.Event,k=ea.dispatchEvent;if("undefined"===typeof k)return!0;"function"===typeof g?g=new g("unhandledrejection",{cancelable:!0}):"function"===typeof h?g=new h("unhandledrejection",{cancelable:!0}):(g=ea.document.createEvent("CustomEvent"),g.initCustomEvent("unhandledrejection",!1,!0,g));g.promise=this;g.reason=this.l;return k(g)};
b.prototype.u=function(){if(null!=this.j){for(var g=0;g<this.j.length;++g)f.j(this.j[g]);this.j=null}};
var f=new c;b.prototype.R=function(g){var h=this.m();g.cb(h.resolve,h.reject)};
b.prototype.T=function(g,h){var k=this.m();try{g.call(h,k.resolve,k.reject)}catch(m){k.reject(m)}};
b.prototype.then=function(g,h){function k(w,t){return"function"==typeof w?function(y){try{m(w(y))}catch(E){q(E)}}:t}
var m,q,r=new b(function(w,t){m=w;q=t});
this.cb(k(g,m),k(h,q));return r};
b.prototype.catch=function(g){return this.then(void 0,g)};
b.prototype.cb=function(g,h){function k(){switch(m.i){case 1:g(m.l);break;case 2:h(m.l);break;default:throw Error("Unexpected state: "+m.i);}}
var m=this;null==this.j?f.j(k):this.j.push(k);this.C=!0};
b.resolve=d;b.reject=function(g){return new b(function(h,k){k(g)})};
b.race=function(g){return new b(function(h,k){for(var m=p(g),q=m.next();!q.done;q=m.next())d(q.value).cb(h,k)})};
b.all=function(g){var h=p(g),k=h.next();return k.done?d([]):new b(function(m,q){function r(y){return function(E){w[y]=E;t--;0==t&&m(w)}}
var w=[],t=0;do w.push(void 0),t++,d(k.value).cb(r(w.length-1),q),k=h.next();while(!k.done)})};
return b});
n("WeakMap",function(a){function b(k){this.i=(h+=Math.random()+1).toString();if(k){k=p(k);for(var m;!(m=k.next()).done;)m=m.value,this.set(m[0],m[1])}}
function c(){}
function d(k){var m=typeof k;return"object"===m&&null!==k||"function"===m}
function e(k){if(!ja(k,g)){var m=new c;ba(k,g,{value:m})}}
function f(k){var m=Object[k];m&&(Object[k]=function(q){if(q instanceof c)return q;Object.isExtensible(q)&&e(q);return m(q)})}
if(function(){if(!a||!Object.seal)return!1;try{var k=Object.seal({}),m=Object.seal({}),q=new a([[k,2],[m,3]]);if(2!=q.get(k)||3!=q.get(m))return!1;q.delete(k);q.set(m,4);return!q.has(k)&&4==q.get(m)}catch(r){return!1}}())return a;
var g="$jscomp_hidden_"+Math.random();f("freeze");f("preventExtensions");f("seal");var h=0;b.prototype.set=function(k,m){if(!d(k))throw Error("Invalid WeakMap key");e(k);if(!ja(k,g))throw Error("WeakMap key fail: "+k);k[g][this.i]=m;return this};
b.prototype.get=function(k){return d(k)&&ja(k,g)?k[g][this.i]:void 0};
b.prototype.has=function(k){return d(k)&&ja(k,g)&&ja(k[g],this.i)};
b.prototype.delete=function(k){return d(k)&&ja(k,g)&&ja(k[g],this.i)?delete k[g][this.i]:!1};
return b});
n("Map",function(a){function b(){var h={};return h.previous=h.next=h.head=h}
function c(h,k){var m=h.i;return ha(function(){if(m){for(;m.head!=h.i;)m=m.previous;for(;m.next!=m.head;)return m=m.next,{done:!1,value:k(m)};m=null}return{done:!0,value:void 0}})}
function d(h,k){var m=k&&typeof k;"object"==m||"function"==m?f.has(k)?m=f.get(k):(m=""+ ++g,f.set(k,m)):m="p_"+k;var q=h.data_[m];if(q&&ja(h.data_,m))for(h=0;h<q.length;h++){var r=q[h];if(k!==k&&r.key!==r.key||k===r.key)return{id:m,list:q,index:h,entry:r}}return{id:m,list:q,index:-1,entry:void 0}}
function e(h){this.data_={};this.i=b();this.size=0;if(h){h=p(h);for(var k;!(k=h.next()).done;)k=k.value,this.set(k[0],k[1])}}
if(function(){if(!a||"function"!=typeof a||!a.prototype.entries||"function"!=typeof Object.seal)return!1;try{var h=Object.seal({x:4}),k=new a(p([[h,"s"]]));if("s"!=k.get(h)||1!=k.size||k.get({x:4})||k.set({x:4},"t")!=k||2!=k.size)return!1;var m=k.entries(),q=m.next();if(q.done||q.value[0]!=h||"s"!=q.value[1])return!1;q=m.next();return q.done||4!=q.value[0].x||"t"!=q.value[1]||!m.next().done?!1:!0}catch(r){return!1}}())return a;
var f=new WeakMap;e.prototype.set=function(h,k){h=0===h?0:h;var m=d(this,h);m.list||(m.list=this.data_[m.id]=[]);m.entry?m.entry.value=k:(m.entry={next:this.i,previous:this.i.previous,head:this.i,key:h,value:k},m.list.push(m.entry),this.i.previous.next=m.entry,this.i.previous=m.entry,this.size++);return this};
e.prototype.delete=function(h){h=d(this,h);return h.entry&&h.list?(h.list.splice(h.index,1),h.list.length||delete this.data_[h.id],h.entry.previous.next=h.entry.next,h.entry.next.previous=h.entry.previous,h.entry.head=null,this.size--,!0):!1};
e.prototype.clear=function(){this.data_={};this.i=this.i.previous=b();this.size=0};
e.prototype.has=function(h){return!!d(this,h).entry};
e.prototype.get=function(h){return(h=d(this,h).entry)&&h.value};
e.prototype.entries=function(){return c(this,function(h){return[h.key,h.value]})};
e.prototype.keys=function(){return c(this,function(h){return h.key})};
e.prototype.values=function(){return c(this,function(h){return h.value})};
e.prototype.forEach=function(h,k){for(var m=this.entries(),q;!(q=m.next()).done;)q=q.value,h.call(k,q[1],q[0],this)};
e.prototype[Symbol.iterator]=e.prototype.entries;var g=0;return e});
function Ka(a,b,c){if(null==a)throw new TypeError("The 'this' value for String.prototype."+c+" must not be null or undefined");if(b instanceof RegExp)throw new TypeError("First argument to String.prototype."+c+" must not be a regular expression");return a+""}
n("String.prototype.endsWith",function(a){return a?a:function(b,c){var d=Ka(this,b,"endsWith");b+="";void 0===c&&(c=d.length);c=Math.max(0,Math.min(c|0,d.length));for(var e=b.length;0<e&&0<c;)if(d[--c]!=b[--e])return!1;return 0>=e}});
n("Array.prototype.find",function(a){return a?a:function(b,c){a:{var d=this;d instanceof String&&(d=String(d));for(var e=d.length,f=0;f<e;f++){var g=d[f];if(b.call(c,g,f,d)){b=g;break a}}b=void 0}return b}});
n("String.prototype.startsWith",function(a){return a?a:function(b,c){var d=Ka(this,b,"startsWith");b+="";var e=d.length,f=b.length;c=Math.max(0,Math.min(c|0,d.length));for(var g=0;g<f&&c<e;)if(d[c++]!=b[g++])return!1;return g>=f}});
n("Number.isFinite",function(a){return a?a:function(b){return"number"!==typeof b?!1:!isNaN(b)&&Infinity!==b&&-Infinity!==b}});
n("Number.isInteger",function(a){return a?a:function(b){return Number.isFinite(b)?b===Math.floor(b):!1}});
n("Number.MAX_SAFE_INTEGER",function(){return 9007199254740991});
function La(a,b){a instanceof String&&(a+="");var c=0,d=!1,e={next:function(){if(!d&&c<a.length){var f=c++;return{value:b(f,a[f]),done:!1}}d=!0;return{done:!0,value:void 0}}};
e[Symbol.iterator]=function(){return e};
return e}
n("Array.prototype.entries",function(a){return a?a:function(){return La(this,function(b,c){return[b,c]})}});
n("Array.from",function(a){return a?a:function(b,c,d){c=null!=c?c:function(h){return h};
var e=[],f="undefined"!=typeof Symbol&&Symbol.iterator&&b[Symbol.iterator];if("function"==typeof f){b=f.call(b);for(var g=0;!(f=b.next()).done;)e.push(c.call(d,f.value,g++))}else for(f=b.length,g=0;g<f;g++)e.push(c.call(d,b[g],g));return e}});
n("Array.prototype.keys",function(a){return a?a:function(){return La(this,function(b){return b})}});
n("Number.isNaN",function(a){return a?a:function(b){return"number"===typeof b&&isNaN(b)}});
n("Object.setPrototypeOf",function(a){return a||ua});
n("Set",function(a){function b(c){this.i=new Map;if(c){c=p(c);for(var d;!(d=c.next()).done;)this.add(d.value)}this.size=this.i.size}
if(function(){if(!a||"function"!=typeof a||!a.prototype.entries||"function"!=typeof Object.seal)return!1;try{var c=Object.seal({x:4}),d=new a(p([c]));if(!d.has(c)||1!=d.size||d.add(c)!=d||1!=d.size||d.add({x:4})!=d||2!=d.size)return!1;var e=d.entries(),f=e.next();if(f.done||f.value[0]!=c||f.value[1]!=c)return!1;f=e.next();return f.done||f.value[0]==c||4!=f.value[0].x||f.value[1]!=f.value[0]?!1:e.next().done}catch(g){return!1}}())return a;
b.prototype.add=function(c){c=0===c?0:c;this.i.set(c,c);this.size=this.i.size;return this};
b.prototype.delete=function(c){c=this.i.delete(c);this.size=this.i.size;return c};
b.prototype.clear=function(){this.i.clear();this.size=0};
b.prototype.has=function(c){return this.i.has(c)};
b.prototype.entries=function(){return this.i.entries()};
b.prototype.values=function(){return this.i.values()};
b.prototype.keys=b.prototype.values;b.prototype[Symbol.iterator]=b.prototype.values;b.prototype.forEach=function(c,d){var e=this;this.i.forEach(function(f){return c.call(d,f,f,e)})};
return b});
n("Object.entries",function(a){return a?a:function(b){var c=[],d;for(d in b)ja(b,d)&&c.push([d,b[d]]);return c}});
n("Array.prototype.values",function(a){return a?a:function(){return La(this,function(b,c){return c})}});
n("Object.is",function(a){return a?a:function(b,c){return b===c?0!==b||1/b===1/c:b!==b&&c!==c}});
n("Array.prototype.includes",function(a){return a?a:function(b,c){var d=this;d instanceof String&&(d=String(d));var e=d.length;c=c||0;for(0>c&&(c=Math.max(c+e,0));c<e;c++){var f=d[c];if(f===b||Object.is(f,b))return!0}return!1}});
n("String.prototype.includes",function(a){return a?a:function(b,c){return-1!==Ka(this,b,"includes").indexOf(b,c||0)}});
n("globalThis",function(a){return a||ea});
n("Object.values",function(a){return a?a:function(b){var c=[],d;for(d in b)ja(b,d)&&c.push(b[d]);return c}});
var Ma=Ma||{},z=this||self;function A(a,b,c){a=a.split(".");c=c||z;a[0]in c||"undefined"==typeof c.execScript||c.execScript("var "+a[0]);for(var d;a.length&&(d=a.shift());)a.length||void 0===b?c[d]&&c[d]!==Object.prototype[d]?c=c[d]:c=c[d]={}:c[d]=b}
function B(a,b){a=a.split(".");b=b||z;for(var c=0;c<a.length;c++)if(b=b[a[c]],null==b)return null;return b}
function Na(a){a.zb=void 0;a.getInstance=function(){return a.zb?a.zb:a.zb=new a}}
function Oa(a){var b=typeof a;return"object"!=b?b:a?Array.isArray(a)?"array":b:"null"}
function Pa(a){var b=Oa(a);return"array"==b||"object"==b&&"number"==typeof a.length}
function Qa(a){var b=typeof a;return"object"==b&&null!=a||"function"==b}
function Ra(a){return Object.prototype.hasOwnProperty.call(a,Sa)&&a[Sa]||(a[Sa]=++Ta)}
var Sa="closure_uid_"+(1E9*Math.random()>>>0),Ta=0;function Ua(a,b,c){return a.call.apply(a.bind,arguments)}
function Va(a,b,c){if(!a)throw Error();if(2<arguments.length){var d=Array.prototype.slice.call(arguments,2);return function(){var e=Array.prototype.slice.call(arguments);Array.prototype.unshift.apply(e,d);return a.apply(b,e)}}return function(){return a.apply(b,arguments)}}
function Wa(a,b,c){Function.prototype.bind&&-1!=Function.prototype.bind.toString().indexOf("native code")?Wa=Ua:Wa=Va;return Wa.apply(null,arguments)}
function Ya(a,b){var c=Array.prototype.slice.call(arguments,1);return function(){var d=c.slice();d.push.apply(d,arguments);return a.apply(this,d)}}
function Za(a,b){function c(){}
c.prototype=b.prototype;a.Z=b.prototype;a.prototype=new c;a.prototype.constructor=a;a.fr=function(d,e,f){for(var g=Array(arguments.length-2),h=2;h<arguments.length;h++)g[h-2]=arguments[h];return b.prototype[e].apply(d,g)}}
function $a(a){return a}
;function ab(a,b){if(Error.captureStackTrace)Error.captureStackTrace(this,ab);else{var c=Error().stack;c&&(this.stack=c)}a&&(this.message=String(a));void 0!==b&&(this.cause=b)}
Za(ab,Error);ab.prototype.name="CustomError";function bb(a){a=a.url;var b=/[?&]dsh=1(&|$)/.test(a);this.l=!b&&/[?&]ae=1(&|$)/.test(a);this.m=!b&&/[?&]ae=2(&|$)/.test(a);if((this.i=/[?&]adurl=([^&]*)/.exec(a))&&this.i[1]){try{var c=decodeURIComponent(this.i[1])}catch(d){c=null}this.j=c}}
;function cb(){}
function db(a){var b=!1,c;return function(){b||(c=a(),b=!0);return c}}
;var eb=Array.prototype.indexOf?function(a,b){return Array.prototype.indexOf.call(a,b,void 0)}:function(a,b){if("string"===typeof a)return"string"!==typeof b||1!=b.length?-1:a.indexOf(b,0);
for(var c=0;c<a.length;c++)if(c in a&&a[c]===b)return c;return-1},fb=Array.prototype.forEach?function(a,b,c){Array.prototype.forEach.call(a,b,c)}:function(a,b,c){for(var d=a.length,e="string"===typeof a?a.split(""):a,f=0;f<d;f++)f in e&&b.call(c,e[f],f,a)},gb=Array.prototype.filter?function(a,b){return Array.prototype.filter.call(a,b,void 0)}:function(a,b){for(var c=a.length,d=[],e=0,f="string"===typeof a?a.split(""):a,g=0;g<c;g++)if(g in f){var h=f[g];
b.call(void 0,h,g,a)&&(d[e++]=h)}return d},hb=Array.prototype.map?function(a,b){return Array.prototype.map.call(a,b,void 0)}:function(a,b){for(var c=a.length,d=Array(c),e="string"===typeof a?a.split(""):a,f=0;f<c;f++)f in e&&(d[f]=b.call(void 0,e[f],f,a));
return d},ib=Array.prototype.reduce?function(a,b,c){return Array.prototype.reduce.call(a,b,c)}:function(a,b,c){var d=c;
fb(a,function(e,f){d=b.call(void 0,d,e,f,a)});
return d},jb=Array.prototype.every?function(a,b){return Array.prototype.every.call(a,b,void 0)}:function(a,b){for(var c=a.length,d="string"===typeof a?a.split(""):a,e=0;e<c;e++)if(e in d&&!b.call(void 0,d[e],e,a))return!1;
return!0};
function kb(a,b){a:{for(var c=a.length,d="string"===typeof a?a.split(""):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a)){b=e;break a}b=-1}return 0>b?null:"string"===typeof a?a.charAt(b):a[b]}
function mb(a,b){b=eb(a,b);var c;(c=0<=b)&&Array.prototype.splice.call(a,b,1);return c}
function nb(a,b){for(var c=1;c<arguments.length;c++){var d=arguments[c];if(Pa(d)){var e=a.length||0,f=d.length||0;a.length=e+f;for(var g=0;g<f;g++)a[e+g]=d[g]}else a.push(d)}}
;function ob(a,b){for(var c in a)b.call(void 0,a[c],c,a)}
function pb(a){var b=qb,c;for(c in b)if(a.call(void 0,b[c],c,b))return c}
function rb(a){for(var b in a)return!1;return!0}
function sb(a,b){if(null!==a&&b in a)throw Error('The object already contains the key "'+b+'"');a[b]=!0}
function tb(a){return null!==a&&"privembed"in a?a.privembed:!1}
function ub(a,b){for(var c in a)if(!(c in b)||a[c]!==b[c])return!1;for(var d in b)if(!(d in a))return!1;return!0}
function vb(a){var b={},c;for(c in a)b[c]=a[c];return b}
function wb(a){if(!a||"object"!==typeof a)return a;if("function"===typeof a.clone)return a.clone();if("undefined"!==typeof Map&&a instanceof Map)return new Map(a);if("undefined"!==typeof Set&&a instanceof Set)return new Set(a);if(a instanceof Date)return new Date(a.getTime());var b=Array.isArray(a)?[]:"function"!==typeof ArrayBuffer||"function"!==typeof ArrayBuffer.isView||!ArrayBuffer.isView(a)||a instanceof DataView?{}:new a.constructor(a.length),c;for(c in a)b[c]=wb(a[c]);return b}
var xb="constructor hasOwnProperty isPrototypeOf propertyIsEnumerable toLocaleString toString valueOf".split(" ");function yb(a,b){for(var c,d,e=1;e<arguments.length;e++){d=arguments[e];for(c in d)a[c]=d[c];for(var f=0;f<xb.length;f++)c=xb[f],Object.prototype.hasOwnProperty.call(d,c)&&(a[c]=d[c])}}
;var zb;function Ab(){if(void 0===zb){var a=null,b=z.trustedTypes;if(b&&b.createPolicy){try{a=b.createPolicy("goog#html",{createHTML:$a,createScript:$a,createScriptURL:$a})}catch(c){z.console&&z.console.error(c.message)}zb=a}else zb=a}return zb}
;function Bb(a,b){this.l=a===Cb&&b||""}
Bb.prototype.j=!0;Bb.prototype.i=function(){return this.l};
function Db(a){return new Bb(Cb,a)}
var Cb={};Db("");var Eb={};function Fb(a){this.l=Eb===Eb?a:"";this.j=!0}
Fb.prototype.toString=function(){return this.l.toString()};
Fb.prototype.i=function(){return this.l.toString()};function Ib(a,b){this.l=b===Jb?a:""}
Ib.prototype.toString=function(){return this.l+""};
Ib.prototype.j=!0;Ib.prototype.i=function(){return this.l.toString()};
function Kb(a){if(a instanceof Ib&&a.constructor===Ib)return a.l;Oa(a);return"type_error:TrustedResourceUrl"}
var Jb={};function Lb(a){var b=Ab();a=b?b.createScriptURL(a):a;return new Ib(a,Jb)}
;var Mb=String.prototype.trim?function(a){return a.trim()}:function(a){return/^[\s\xa0]*([\s\S]*?)[\s\xa0]*$/.exec(a)[1]};
function Nb(a,b){return a<b?-1:a>b?1:0}
;function Ob(a,b){this.l=b===Pb?a:""}
Ob.prototype.toString=function(){return this.l.toString()};
Ob.prototype.j=!0;Ob.prototype.i=function(){return this.l.toString()};
function Qb(a){if(a instanceof Ob&&a.constructor===Ob)return a.l;Oa(a);return"type_error:SafeUrl"}
var Rb=/^(?:(?:https?|mailto|ftp):|[^:/?#]*(?:[/?#]|$))/i,Pb={},Sb=new Ob("about:invalid#zClosurez",Pb);function Tb(){var a=z.navigator;return a&&(a=a.userAgent)?a:""}
function C(a){return-1!=Tb().indexOf(a)}
;function Ub(){return C("Trident")||C("MSIE")}
function Vb(){return C("Firefox")||C("FxiOS")}
function Wb(){return C("Safari")&&!(Xb()||C("Coast")||C("Opera")||C("Edge")||C("Edg/")||C("OPR")||Vb()||C("Silk")||C("Android"))}
function Xb(){return(C("Chrome")||C("CriOS"))&&!C("Edge")||C("Silk")}
function $b(){return C("Android")&&!(Xb()||Vb()||C("Opera")||C("Silk"))}
function ac(a){var b={};a.forEach(function(c){b[c[0]]=c[1]});
return function(c){return b[c.find(function(d){return d in b})]||""}}
function bc(a){var b=Tb();if("Internet Explorer"===a){if(Ub())if((a=/rv: *([\d\.]*)/.exec(b))&&a[1])b=a[1];else{a="";var c=/MSIE +([\d\.]+)/.exec(b);if(c&&c[1])if(b=/Trident\/(\d.\d)/.exec(b),"7.0"==c[1])if(b&&b[1])switch(b[1]){case "4.0":a="8.0";break;case "5.0":a="9.0";break;case "6.0":a="10.0";break;case "7.0":a="11.0"}else a="7.0";else a=c[1];b=a}else b="";return b}var d=RegExp("([A-Z][\\w ]+)/([^\\s]+)\\s*(?:\\((.*?)\\))?","g");c=[];for(var e;e=d.exec(b);)c.push([e[1],e[2],e[3]||void 0]);b=ac(c);
switch(a){case "Opera":if(C("Opera"))return b(["Version","Opera"]);if(C("OPR"))return b(["OPR"]);break;case "Microsoft Edge":if(C("Edge"))return b(["Edge"]);if(C("Edg/"))return b(["Edg"]);break;case "Chromium":if(Xb())return b(["Chrome","CriOS","HeadlessChrome"])}return"Firefox"===a&&Vb()||"Safari"===a&&Wb()||"Android Browser"===a&&$b()||"Silk"===a&&C("Silk")?(b=c[2])&&b[1]||"":""}
function cc(a){a=bc(a);if(""===a)return NaN;a=a.split(".");return 0===a.length?NaN:Number(a[0])}
;var dc={};function ec(a){this.l=dc===dc?a:"";this.j=!0}
ec.prototype.i=function(){return this.l.toString()};
ec.prototype.toString=function(){return this.l.toString()};function fc(a,b){b instanceof Ob||b instanceof Ob||(b="object"==typeof b&&b.j?b.i():String(b),Rb.test(b)||(b="about:invalid#zClosurez"),b=new Ob(b,Pb));a.href=Qb(b)}
function gc(a,b){a.rel="stylesheet";a.href=Kb(b).toString();(b=hc('style[nonce],link[rel="stylesheet"][nonce]',a.ownerDocument&&a.ownerDocument.defaultView))&&a.setAttribute("nonce",b)}
function ic(){return hc("script[nonce]")}
var jc=/^[\w+/_-]+[=]{0,2}$/;function hc(a,b){b=(b||z).document;return b.querySelector?(a=b.querySelector(a))&&(a=a.nonce||a.getAttribute("nonce"))&&jc.test(a)?a:"":""}
;function kc(a){for(var b=0,c=0;c<a.length;++c)b=31*b+a.charCodeAt(c)>>>0;return b}
;var lc=RegExp("^(?:([^:/?#.]+):)?(?://(?:([^\\\\/?#]*)@)?([^\\\\/?#]*?)(?::([0-9]+))?(?=[\\\\/?#]|$))?([^?#]+)?(?:\\?([^#]*))?(?:#([\\s\\S]*))?$");function mc(a){return a?decodeURI(a):a}
function nc(a,b){return b.match(lc)[a]||null}
function oc(a){return mc(nc(3,a))}
function pc(a){var b=a.match(lc);a=b[5];var c=b[6];b=b[7];var d="";a&&(d+=a);c&&(d+="?"+c);b&&(d+="#"+b);return d}
function qc(a,b){if(!b)return a;var c=a.indexOf("#");0>c&&(c=a.length);var d=a.indexOf("?");if(0>d||d>c){d=c;var e=""}else e=a.substring(d+1,c);a=[a.slice(0,d),e,a.slice(c)];c=a[1];a[1]=b?c?c+"&"+b:b:c;return a[0]+(a[1]?"?"+a[1]:"")+a[2]}
function rc(a,b,c){if(Array.isArray(b))for(var d=0;d<b.length;d++)rc(a,String(b[d]),c);else null!=b&&c.push(a+(""===b?"":"="+encodeURIComponent(String(b))))}
function sc(a,b){var c=[];for(b=b||0;b<a.length;b+=2)rc(a[b],a[b+1],c);return c.join("&")}
function tc(a){var b=[],c;for(c in a)rc(c,a[c],b);return b.join("&")}
function uc(a,b){var c=2==arguments.length?sc(arguments[1],0):sc(arguments,1);return qc(a,c)}
function vc(a,b){b=tc(b);return qc(a,b)}
function wc(a,b,c){c=null!=c?"="+encodeURIComponent(String(c)):"";return qc(a,b+c)}
function Ac(a,b,c,d){for(var e=c.length;0<=(b=a.indexOf(c,b))&&b<d;){var f=a.charCodeAt(b-1);if(38==f||63==f)if(f=a.charCodeAt(b+e),!f||61==f||38==f||35==f)return b;b+=e+1}return-1}
var Bc=/#|$/,Cc=/[?&]($|#)/;function Dc(a,b){for(var c=a.search(Bc),d=0,e,f=[];0<=(e=Ac(a,d,b,c));)f.push(a.substring(d,e)),d=Math.min(a.indexOf("&",e)+1||c,c);f.push(a.slice(d));return f.join("").replace(Cc,"$1")}
;function Ec(a){z.setTimeout(function(){throw a;},0)}
;function Fc(){return C("iPhone")&&!C("iPod")&&!C("iPad")}
function Gc(){var a=Tb();if(C("Windows")){var b=/Windows (?:NT|Phone) ([0-9.]+)/;b.exec(a)}else Fc()||C("iPad")||C("iPod")?(b=/(?:iPhone|iPod|iPad|CPU)\s+OS\s+(\S+)/,(a=b.exec(a))&&a[1].replace(/_/g,".")):C("Macintosh")?(b=/Mac OS X ([0-9_.]+)/,(a=b.exec(a))&&a[1].replace(/_/g,".")):-1!=Tb().toLowerCase().indexOf("kaios")?(b=/(?:KaiOS)\/(\S+)/i,b.exec(a)):C("Android")?(b=/Android\s+([^\);]+)(\)|;)/,b.exec(a)):C("CrOS")&&(b=/(?:CrOS\s+(?:i686|x86_64)\s+([0-9.]+))/,b.exec(a))}
;function Hc(a){Hc[" "](a);return a}
Hc[" "]=function(){};
function Ic(a){var b=Jc;return Object.prototype.hasOwnProperty.call(b,9)?b[9]:b[9]=a(9)}
;var Kc=C("Opera"),Lc=Ub(),Mc=C("Edge"),Nc=C("Gecko")&&!(-1!=Tb().toLowerCase().indexOf("webkit")&&!C("Edge"))&&!(C("Trident")||C("MSIE"))&&!C("Edge"),Oc=-1!=Tb().toLowerCase().indexOf("webkit")&&!C("Edge"),Pc=C("Android");function Qc(){var a=z.document;return a?a.documentMode:void 0}
var Rc;a:{var Sc="",Tc=function(){var a=Tb();if(Nc)return/rv:([^\);]+)(\)|;)/.exec(a);if(Mc)return/Edge\/([\d\.]+)/.exec(a);if(Lc)return/\b(?:MSIE|rv)[: ]([^\);]+)(\)|;)/.exec(a);if(Oc)return/WebKit\/(\S+)/.exec(a);if(Kc)return/(?:Version)[ \/]?(\S+)/.exec(a)}();
Tc&&(Sc=Tc?Tc[1]:"");if(Lc){var Uc=Qc();if(null!=Uc&&Uc>parseFloat(Sc)){Rc=String(Uc);break a}}Rc=Sc}var Vc=Rc,Jc={};
function Wc(){return Ic(function(){for(var a=0,b=Mb(String(Vc)).split("."),c=Mb("9").split("."),d=Math.max(b.length,c.length),e=0;0==a&&e<d;e++){var f=b[e]||"",g=c[e]||"";do{f=/(\d*)(\D*)(.*)/.exec(f)||["","","",""];g=/(\d*)(\D*)(.*)/.exec(g)||["","","",""];if(0==f[0].length&&0==g[0].length)break;a=Nb(0==f[1].length?0:parseInt(f[1],10),0==g[1].length?0:parseInt(g[1],10))||Nb(0==f[2].length,0==g[2].length)||Nb(f[2],g[2]);f=f[3];g=g[3]}while(0==a)}return 0<=a})}
var Xc;if(z.document&&Lc){var Yc=Qc();Xc=Yc?Yc:parseInt(Vc,10)||void 0}else Xc=void 0;var Zc=Xc;var $c=Fc()||C("iPod"),ad=C("iPad");$b();Xb();var bd=Wb()&&!(Fc()||C("iPad")||C("iPod"));var cd={},dd=null;function ed(a,b){Pa(a);void 0===b&&(b=0);fd();b=cd[b];for(var c=Array(Math.floor(a.length/3)),d=b[64]||"",e=0,f=0;e<a.length-2;e+=3){var g=a[e],h=a[e+1],k=a[e+2],m=b[g>>2];g=b[(g&3)<<4|h>>4];h=b[(h&15)<<2|k>>6];k=b[k&63];c[f++]=""+m+g+h+k}m=0;k=d;switch(a.length-e){case 2:m=a[e+1],k=b[(m&15)<<2]||d;case 1:a=a[e],c[f]=""+b[a>>2]+b[(a&3)<<4|m>>4]+k+d}return c.join("")}
function gd(a){var b=a.length,c=3*b/4;c%3?c=Math.floor(c):-1!="=.".indexOf(a[b-1])&&(c=-1!="=.".indexOf(a[b-2])?c-2:c-1);var d=new Uint8Array(c),e=0;hd(a,function(f){d[e++]=f});
return e!==c?d.subarray(0,e):d}
function hd(a,b){function c(k){for(;d<a.length;){var m=a.charAt(d++),q=dd[m];if(null!=q)return q;if(!/^[\s\xa0]*$/.test(m))throw Error("Unknown base64 encoding at char: "+m);}return k}
fd();for(var d=0;;){var e=c(-1),f=c(0),g=c(64),h=c(64);if(64===h&&-1===e)break;b(e<<2|f>>4);64!=g&&(b(f<<4&240|g>>2),64!=h&&b(g<<6&192|h))}}
function fd(){if(!dd){dd={};for(var a="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".split(""),b=["+/=","+/","-_=","-_.","-_"],c=0;5>c;c++){var d=a.concat(b[c].split(""));cd[c]=d;for(var e=0;e<d.length;e++){var f=d[e];void 0===dd[f]&&(dd[f]=e)}}}}
;var id="undefined"!==typeof Uint8Array;function jd(a){return id&&null!=a&&a instanceof Uint8Array}
var kd={};var ld;function md(a){if(a!==kd)throw Error("illegal external caller");}
function nd(a,b){md(b);this.da=a;if(null!=a&&0===a.length)throw Error("ByteString should be constructed with non-empty values");}
function od(){return ld||(ld=new nd(null,kd))}
nd.prototype.isEmpty=function(){return null==this.da};
nd.prototype.sizeBytes=function(){md(kd);var a=this.da;null==a||jd(a)||("string"===typeof a?a=gd(a):(Oa(a),a=null));return(a=null==a?a:this.da=a)?a.length:0};var td="function"===typeof Symbol&&"symbol"===typeof Symbol()?Symbol(void 0):void 0;function ud(a,b){Object.isFrozen(a)||(td?a[td]|=b:void 0!==a.ha?a.ha|=b:Object.defineProperties(a,{ha:{value:b,configurable:!0,writable:!0,enumerable:!1}}))}
function vd(a,b){Object.isExtensible(a)&&(td?a[td]&&(a[td]&=~b):void 0!==a.ha&&(a.ha&=~b))}
function wd(a){var b;td?b=a[td]:b=a.ha;return null==b?0:b}
function xd(a,b){td?a[td]=b:void 0!==a.ha?a.ha=b:Object.defineProperties(a,{ha:{value:b,configurable:!0,writable:!0,enumerable:!1}})}
function yd(a){ud(a,1);return a}
function zd(a){ud(a,17);return a}
function Ad(a){return a?!!(wd(a)&2):!1}
function Bd(a){ud(a,16);return a}
function Cd(a){if(!Array.isArray(a))throw Error("cannot mark non-array as shared mutably");vd(a,16)}
function Dd(a,b){xd(b,(wd(a)|0)&-51)}
;var Ed={};function Fd(a){return null!==a&&"object"===typeof a&&!Array.isArray(a)&&a.constructor===Object}
var Gd,Hd=Object,Id=Hd.freeze,Jd=[];ud(Jd,3);var Kd=Id.call(Hd,Jd);function Ld(a){if(Ad(a.v))throw Error("Cannot mutate an immutable Message");}
;function Md(a){return a.displayName||a.name||"unknown type name"}
function Nd(a,b){if(!(a instanceof b))throw Error("Expected instanceof "+Md(b)+" but got "+(a&&Md(a.constructor)));return a}
;function Od(a){switch(typeof a){case "number":return isFinite(a)?a:String(a);case "object":if(a&&!Array.isArray(a)){if(jd(a))return ed(a);if(a instanceof nd){var b=a.da;return null==b?"":"string"===typeof b?b:a.da=ed(b)}}}return a}
;function Pd(a,b,c,d){if(null!=a){if(Array.isArray(a))a=Qd(a,b,c,void 0!==d);else if(Fd(a)){var e={},f;for(f in a)e[f]=Pd(a[f],b,c,d);a=e}else a=b(a,d);return a}}
function Qd(a,b,c,d){d=d?!!(wd(a)&16):void 0;var e=Array.prototype.slice.call(a);c(a,e);for(a=0;a<e.length;a++)e[a]=Pd(e[a],b,c,d);return e}
function Rd(a){return a.Cb===Ed?a.toJSON():Od(a)}
function Sd(a){if(!a)return a;if("object"===typeof a){if(jd(a))return new Uint8Array(a);if(a.Cb===Ed)return a.clone()}return a}
function Td(){}
;function Ud(a,b,c){return-1===b?null:b>=a.ra?a.S?a.S[b]:void 0:(void 0===c?0:c)&&a.S&&(c=a.S[b],null!=c)?c:a.v[b+a.ma]}
function D(a,b,c,d,e){d=void 0===d?!1:d;(void 0===e?0:e)||Ld(a);a.hc&&(a.hc=void 0);if(b>=a.ra||d)return(a.S||(a.S=a.v[a.ra+a.ma]={}))[b]=c,a;void 0!==a.S&&a.ra>=a.v.length?(d=a.v.length-1,e=b+a.ma,e>=d?(a.v[d]=void 0,a.v[e]=c,a.v.push(a.S)):a.v[e]=c):a.v[b+a.ma]=c;void 0!==a.S&&b in a.S&&delete a.S[b];return a}
function Vd(a,b,c,d){var e=Ud(a,b,d);Array.isArray(e)||(e=Kd);var f=wd(e);f&1||yd(e);Ad(a.v)?(f&2||ud(e,2),c&1||Object.freeze(e)):e===Kd||!(c&1&&c&2)&&f&2?(e=yd(Array.prototype.slice.call(e)),D(a,b,e,d)):!(c&2)&&f&16&&Cd(e);return e}
function Wd(a,b,c,d){Ld(a);(c=Xd(a,c))&&c!==b&&null!=d&&D(a,c,void 0,!1);return D(a,b,d)}
function Xd(a,b){for(var c=0,d=0;d<b.length;d++){var e=b[d];null!=Ud(a,e)&&(0!==c&&D(a,c,void 0,!1,!0),c=e)}return c}
function Yd(a,b,c,d){var e=d=void 0===d?!1:d,f=Ud(a,c,e);var g=!1;var h=null==f||"object"!==typeof f||(g=Array.isArray(f))||f.Cb!==Ed?g?new b(f):void 0:f;h!==f&&null!=h&&(D(a,c,h,e,!0),ud(h.v,wd(a.v)&-33));b=h;if(null==b)return b;Ad(b.v)&&!Ad(a.v)&&(b=Zd(b),D(a,c,b,d));return b}
function $d(a,b,c,d,e){e=void 0===e?!0:e;a.i||(a.i={});var f=a.i[c],g=Vd(a,c,3,d),h=Ad(a.v),k=!!(wd(a.v)&16),m=Ad(g),q=h||m;!e&&m&&(g=yd(Array.prototype.slice.call(g)),D(a,c,g,d));if(!f){f=[];d=q;for(m=0;m<g.length;m++){var r=g[m];d=d||Ad(r);var w=b,t=k,y=!1;y=void 0===y?!1:y;t=void 0===t?!1:t;r=Array.isArray(r)?new w(t?Bd(r):r):y?new w:void 0;void 0!==r&&(f.push(r),q&&ud(r.v,2))}a.i[c]=f;b=g;g=!d;Object.isFrozen(b)||(k=wd(b)|33,xd(b,g?k|8:k&-9))}e=h||e;h=Ad(f);e&&!h&&(Object.isFrozen(f)&&(a.i[c]=
f=f.slice()),ud(f,2),Object.freeze(f));!e&&h&&(a.i[c]=f=f.slice());return f}
function ae(a,b,c,d){d=void 0===d?!1:d;var e=Ad(a.v);b=$d(a,b,c,d,e);a=Vd(a,c,3,d);if(e=!e&&a){if(!a)throw Error("cannot check mutability state of non-array");e=!(wd(a)&8)}if(e){for(e=0;e<b.length;e++)(c=b[e])&&Ad(c.v)&&(c=e,d=Zd(b[e]),b[c]=d,a[e]=b[e].v);ud(a,8)}return b}
function G(a,b,c,d){Ld(a);null!=d?Nd(d,b):d=void 0;return D(a,c,d)}
function be(a,b,c,d,e){Ld(a);null!=e?Nd(e,b):e=void 0;Wd(a,c,d,e)}
function ce(a,b,c,d){Ld(a);if(null!=d){var e=yd([]);for(var f=!1,g=0;g<d.length;g++)e[g]=Nd(d[g],b).v,f=f||Ad(e[g]);a.i||(a.i={});a.i[c]=d;b=e;f?vd(b,8):ud(b,8)}else a.i&&(a.i[c]=void 0),e=Kd;return D(a,c,e)}
function de(a,b,c,d){Ld(a);var e=$d(a,c,b,void 0,!1);c=null!=d?Nd(d,c):new c;a=Vd(a,b,2);e.push(c);a.push(c.v);Ad(c.v)&&vd(a,8)}
function ee(a,b){return Ud(a,b)}
function fe(a,b){return null==a?b:a}
;function ge(a,b,c,d,e,f){(a=a.i&&a.i[c])?(e=f.rb?yd(a.slice()):a,ce(b,0<e.length?e[0].constructor:void 0,c,e)):(null!=d?id&&d instanceof Uint8Array?e=d.length?new nd(new Uint8Array(d),kd):od():(Array.isArray(d)&&(e?ud(d,2):d&&wd(d)&1&&f.rb?(e=Array.prototype.slice.call(d),xd(e,(wd(d)|0)&-51),d=e):Cd(d)),e=d):e=void 0,D(b,c,e))}
;function Zd(a){if(!Ad(a.v))return a;var b={rb:!0},c=Ad(a.v);if(c&&!b.rb)throw Error("copyRepeatedFields must be true for frozen messages");c||Cd(a.v);var d=new a.constructor;a.Ma&&(d.Ma=a.Ma.slice());for(var e=a.v,f=0;f<e.length;f++){var g=e[f];if(f===e.length-1&&Fd(g))for(var h in g){var k=+h;Number.isNaN(k)?(d.S||(d.S=d.v[d.ra+d.ma]={}))[h]=g[h]:ge(a,d,k,g[h],c,b)}else ge(a,d,f-a.ma,g,c,b)}d.hc=a;return d}
;function I(a,b,c){null==a&&(a=he);he=null;var d=this.constructor.i||0,e=0<d,f=this.constructor.j,g=!1;if(null==a){var h=f?[f]:[];ud(h,48);a=h;h=!0}else if(h=!!(wd(a)&16))g=wd(a),xd(a,g|32),g=!!(g&32);e&&0<a.length&&Fd(a[a.length-1])&&"g"in a[a.length-1]&&(d=0);this.ma=(f?0:-1)-d;this.i=void 0;this.v=a;a:{f=this.v.length;d=f-1;if(f&&(f=this.v[d],Fd(f))){this.S=f;b=Object.keys(f);0<b.length&&jb(b,isNaN)?this.ra=Number.MAX_VALUE:this.ra=d-this.ma;break a}void 0!==b&&-1<b?(this.ra=Math.max(b,d+1-this.ma),
this.S=void 0):this.ra=Number.MAX_VALUE}if(!e&&this.S&&"g"in this.S)throw Error('Unexpected "g" flag in sparse object of message that is not a group type.');if(c)for(e=h&&!g?zd:yd,b=0;b<c.length;b++)h=c[b],(g=Ud(this,h))?Array.isArray(g)&&e(g):D(this,h,Kd,!1,!0)}
l=I.prototype;l.toJSON=function(){var a=this.v,b;Gd?b=a:b=Qd(a,Rd,Td);return b};
function ie(a){Gd=!0;try{return JSON.stringify(a.toJSON(),je)}finally{Gd=!1}}
l.clone=function(){var a=Qd(this.v,Sd,Dd);Bd(a);he=a;a=new this.constructor(a);he=null;ke(a,this);return a};
l.isMutable=function(){return!Ad(this.v)};
l.Cb=Ed;l.toString=function(){return this.v.toString()};
function je(a,b){return Od(b)}
function ke(a,b){b.Ma&&(a.Ma=b.Ma.slice());var c=b.i;if(c){b=b.S;for(var d in c){var e=c[d];if(e){var f=!(!b||!b[d]),g=+d;if(Array.isArray(e)){if(e.length)for(f=ae(a,e[0].constructor,g,f),g=0;g<Math.min(f.length,e.length);g++)ke(f[g],e[g])}else throw Error("unexpected object: type: "+Oa(e)+": "+e);}}}}
var he;function le(a){var b=this.i,c=this.j;return this.isRepeated?ae(a,b,c,!0):Yd(a,b,c,!0)}
;function me(a){this.Tb=a}
;function ne(a,b,c){this.j=a;this.m=b;this.i=c||[];this.Ca=new Map}
l=ne.prototype;l.Hc=function(a){var b=Ja.apply(1,arguments),c=this.ub(b);c?c.push(new me(a)):this.uc(a,b)};
l.uc=function(a){this.Ca.set(this.ac(Ja.apply(1,arguments)),[new me(a)])};
l.ub=function(){var a=this.ac(Ja.apply(0,arguments));return this.Ca.has(a)?this.Ca.get(a):void 0};
l.Tc=function(){var a=this.ub(Ja.apply(0,arguments));return a&&a.length?a[0]:void 0};
l.clear=function(){this.Ca.clear()};
l.ac=function(){var a=Ja.apply(0,arguments);return a?a.join(","):"key"};function oe(a,b){ne.call(this,a,3,b)}
u(oe,ne);oe.prototype.l=function(a){var b=Ja.apply(1,arguments),c=0,d=this.Tc(b);d&&(c=d.Tb);this.uc(c+a,b)};function pe(a,b){ne.call(this,a,2,b)}
u(pe,ne);pe.prototype.l=function(a){this.Hc(a,Ja.apply(1,arguments))};function qe(a){a&&"function"==typeof a.dispose&&a.dispose()}
;function re(a){for(var b=0,c=arguments.length;b<c;++b){var d=arguments[b];Pa(d)?re.apply(null,d):qe(d)}}
;function J(){this.N=this.N;this.C=this.C}
J.prototype.N=!1;J.prototype.i=function(){return this.N};
J.prototype.dispose=function(){this.N||(this.N=!0,this.D())};
function se(a,b){te(a,Ya(qe,b))}
function te(a,b){a.N?b():(a.C||(a.C=[]),a.C.push(b))}
J.prototype.D=function(){if(this.C)for(;this.C.length;)this.C.shift()()};function ue(a,b){this.type=a;this.i=this.target=b;this.defaultPrevented=this.l=!1}
ue.prototype.stopPropagation=function(){this.l=!0};
ue.prototype.preventDefault=function(){this.defaultPrevented=!0};function ve(a){var b=B("window.location.href");null==a&&(a='Unknown Error of type "null/undefined"');if("string"===typeof a)return{message:a,name:"Unknown error",lineNumber:"Not available",fileName:b,stack:"Not available"};var c=!1;try{var d=a.lineNumber||a.line||"Not available"}catch(g){d="Not available",c=!0}try{var e=a.fileName||a.filename||a.sourceURL||z.$googDebugFname||b}catch(g){e="Not available",c=!0}b=Be(a);if(!(!c&&a.lineNumber&&a.fileName&&a.stack&&a.message&&a.name)){c=a.message;if(null==
c){if(a.constructor&&a.constructor instanceof Function){if(a.constructor.name)c=a.constructor.name;else if(c=a.constructor,Ce[c])c=Ce[c];else{c=String(c);if(!Ce[c]){var f=/function\s+([^\(]+)/m.exec(c);Ce[c]=f?f[1]:"[Anonymous]"}c=Ce[c]}c='Unknown Error of type "'+c+'"'}else c="Unknown Error of unknown type";"function"===typeof a.toString&&Object.prototype.toString!==a.toString&&(c+=": "+a.toString())}return{message:c,name:a.name||"UnknownError",lineNumber:d,fileName:e,stack:b||"Not available"}}a.stack=
b;return{message:a.message,name:a.name,lineNumber:a.lineNumber,fileName:a.fileName,stack:a.stack}}
function Be(a,b){b||(b={});b[De(a)]=!0;var c=a.stack||"";(a=a.cause)&&!b[De(a)]&&(c+="\nCaused by: ",a.stack&&0==a.stack.indexOf(a.toString())||(c+="string"===typeof a?a:a.message+"\n"),c+=Be(a,b));return c}
function De(a){var b="";"function"===typeof a.toString&&(b=""+a);return b+a.stack}
var Ce={};var Ee=function(){if(!z.addEventListener||!Object.defineProperty)return!1;var a=!1,b=Object.defineProperty({},"passive",{get:function(){a=!0}});
try{z.addEventListener("test",function(){},b),z.removeEventListener("test",function(){},b)}catch(c){}return a}();function Fe(a,b){ue.call(this,a?a.type:"");this.relatedTarget=this.i=this.target=null;this.button=this.screenY=this.screenX=this.clientY=this.clientX=0;this.key="";this.charCode=this.keyCode=0;this.metaKey=this.shiftKey=this.altKey=this.ctrlKey=!1;this.state=null;this.pointerId=0;this.pointerType="";this.j=null;a&&this.init(a,b)}
Za(Fe,ue);var Ge={2:"touch",3:"pen",4:"mouse"};
Fe.prototype.init=function(a,b){var c=this.type=a.type,d=a.changedTouches&&a.changedTouches.length?a.changedTouches[0]:null;this.target=a.target||a.srcElement;this.i=b;if(b=a.relatedTarget){if(Nc){a:{try{Hc(b.nodeName);var e=!0;break a}catch(f){}e=!1}e||(b=null)}}else"mouseover"==c?b=a.fromElement:"mouseout"==c&&(b=a.toElement);this.relatedTarget=b;d?(this.clientX=void 0!==d.clientX?d.clientX:d.pageX,this.clientY=void 0!==d.clientY?d.clientY:d.pageY,this.screenX=d.screenX||0,this.screenY=d.screenY||
0):(this.clientX=void 0!==a.clientX?a.clientX:a.pageX,this.clientY=void 0!==a.clientY?a.clientY:a.pageY,this.screenX=a.screenX||0,this.screenY=a.screenY||0);this.button=a.button;this.keyCode=a.keyCode||0;this.key=a.key||"";this.charCode=a.charCode||("keypress"==c?a.keyCode:0);this.ctrlKey=a.ctrlKey;this.altKey=a.altKey;this.shiftKey=a.shiftKey;this.metaKey=a.metaKey;this.pointerId=a.pointerId||0;this.pointerType="string"===typeof a.pointerType?a.pointerType:Ge[a.pointerType]||"";this.state=a.state;
this.j=a;a.defaultPrevented&&Fe.Z.preventDefault.call(this)};
Fe.prototype.stopPropagation=function(){Fe.Z.stopPropagation.call(this);this.j.stopPropagation?this.j.stopPropagation():this.j.cancelBubble=!0};
Fe.prototype.preventDefault=function(){Fe.Z.preventDefault.call(this);var a=this.j;a.preventDefault?a.preventDefault():a.returnValue=!1};var He="closure_listenable_"+(1E6*Math.random()|0);var Ie=0;function Je(a,b,c,d,e){this.listener=a;this.proxy=null;this.src=b;this.type=c;this.capture=!!d;this.gb=e;this.key=++Ie;this.Oa=this.bb=!1}
function Ke(a){a.Oa=!0;a.listener=null;a.proxy=null;a.src=null;a.gb=null}
;function Le(a){this.src=a;this.listeners={};this.i=0}
Le.prototype.add=function(a,b,c,d,e){var f=a.toString();a=this.listeners[f];a||(a=this.listeners[f]=[],this.i++);var g=Me(a,b,d,e);-1<g?(b=a[g],c||(b.bb=!1)):(b=new Je(b,this.src,f,!!d,e),b.bb=c,a.push(b));return b};
Le.prototype.remove=function(a,b,c,d){a=a.toString();if(!(a in this.listeners))return!1;var e=this.listeners[a];b=Me(e,b,c,d);return-1<b?(Ke(e[b]),Array.prototype.splice.call(e,b,1),0==e.length&&(delete this.listeners[a],this.i--),!0):!1};
function Ne(a,b){var c=b.type;c in a.listeners&&mb(a.listeners[c],b)&&(Ke(b),0==a.listeners[c].length&&(delete a.listeners[c],a.i--))}
function Me(a,b,c,d){for(var e=0;e<a.length;++e){var f=a[e];if(!f.Oa&&f.listener==b&&f.capture==!!c&&f.gb==d)return e}return-1}
;var Oe="closure_lm_"+(1E6*Math.random()|0),Pe={},Qe=0;function Re(a,b,c,d,e){if(d&&d.once)Se(a,b,c,d,e);else if(Array.isArray(b))for(var f=0;f<b.length;f++)Re(a,b[f],c,d,e);else c=Te(c),a&&a[He]?a.ja(b,c,Qa(d)?!!d.capture:!!d,e):Ue(a,b,c,!1,d,e)}
function Ue(a,b,c,d,e,f){if(!b)throw Error("Invalid event type");var g=Qa(e)?!!e.capture:!!e,h=Ve(a);h||(a[Oe]=h=new Le(a));c=h.add(b,c,d,g,f);if(!c.proxy){d=We();c.proxy=d;d.src=a;d.listener=c;if(a.addEventListener)Ee||(e=g),void 0===e&&(e=!1),a.addEventListener(b.toString(),d,e);else if(a.attachEvent)a.attachEvent(Xe(b.toString()),d);else if(a.addListener&&a.removeListener)a.addListener(d);else throw Error("addEventListener and attachEvent are unavailable.");Qe++}}
function We(){function a(c){return b.call(a.src,a.listener,c)}
var b=Ye;return a}
function Se(a,b,c,d,e){if(Array.isArray(b))for(var f=0;f<b.length;f++)Se(a,b[f],c,d,e);else c=Te(c),a&&a[He]?a.m.add(String(b),c,!0,Qa(d)?!!d.capture:!!d,e):Ue(a,b,c,!0,d,e)}
function Ze(a,b,c,d,e){if(Array.isArray(b))for(var f=0;f<b.length;f++)Ze(a,b[f],c,d,e);else(d=Qa(d)?!!d.capture:!!d,c=Te(c),a&&a[He])?a.m.remove(String(b),c,d,e):a&&(a=Ve(a))&&(b=a.listeners[b.toString()],a=-1,b&&(a=Me(b,c,d,e)),(c=-1<a?b[a]:null)&&$e(c))}
function $e(a){if("number"!==typeof a&&a&&!a.Oa){var b=a.src;if(b&&b[He])Ne(b.m,a);else{var c=a.type,d=a.proxy;b.removeEventListener?b.removeEventListener(c,d,a.capture):b.detachEvent?b.detachEvent(Xe(c),d):b.addListener&&b.removeListener&&b.removeListener(d);Qe--;(c=Ve(b))?(Ne(c,a),0==c.i&&(c.src=null,b[Oe]=null)):Ke(a)}}}
function Xe(a){return a in Pe?Pe[a]:Pe[a]="on"+a}
function Ye(a,b){if(a.Oa)a=!0;else{b=new Fe(b,this);var c=a.listener,d=a.gb||a.src;a.bb&&$e(a);a=c.call(d,b)}return a}
function Ve(a){a=a[Oe];return a instanceof Le?a:null}
var af="__closure_events_fn_"+(1E9*Math.random()>>>0);function Te(a){if("function"===typeof a)return a;a[af]||(a[af]=function(b){return a.handleEvent(b)});
return a[af]}
;function bf(){J.call(this);this.m=new Le(this);this.Ec=this;this.la=null}
Za(bf,J);bf.prototype[He]=!0;bf.prototype.addEventListener=function(a,b,c,d){Re(this,a,b,c,d)};
bf.prototype.removeEventListener=function(a,b,c,d){Ze(this,a,b,c,d)};
function cf(a,b){var c=a.la;if(c){var d=[];for(var e=1;c;c=c.la)d.push(c),++e}a=a.Ec;c=b.type||b;"string"===typeof b?b=new ue(b,a):b instanceof ue?b.target=b.target||a:(e=b,b=new ue(c,a),yb(b,e));e=!0;if(d)for(var f=d.length-1;!b.l&&0<=f;f--){var g=b.i=d[f];e=df(g,c,!0,b)&&e}b.l||(g=b.i=a,e=df(g,c,!0,b)&&e,b.l||(e=df(g,c,!1,b)&&e));if(d)for(f=0;!b.l&&f<d.length;f++)g=b.i=d[f],e=df(g,c,!1,b)&&e}
bf.prototype.D=function(){bf.Z.D.call(this);if(this.m){var a=this.m,b=0,c;for(c in a.listeners){for(var d=a.listeners[c],e=0;e<d.length;e++)++b,Ke(d[e]);delete a.listeners[c];a.i--}}this.la=null};
bf.prototype.ja=function(a,b,c,d){return this.m.add(String(a),b,!1,c,d)};
function df(a,b,c,d){b=a.m.listeners[String(b)];if(!b)return!0;b=b.concat();for(var e=!0,f=0;f<b.length;++f){var g=b[f];if(g&&!g.Oa&&g.capture==c){var h=g.listener,k=g.gb||g.src;g.bb&&Ne(a.m,g);e=!1!==h.call(k,d)&&e}}return e&&!d.defaultPrevented}
;function ef(a,b){this.l=a;this.m=b;this.j=0;this.i=null}
ef.prototype.get=function(){if(0<this.j){this.j--;var a=this.i;this.i=a.next;a.next=null}else a=this.l();return a};
function ff(a,b){a.m(b);100>a.j&&(a.j++,b.next=a.i,a.i=b)}
;function gf(a,b){return a+Math.random()*(b-a)}
;function hf(a,b){this.x=void 0!==a?a:0;this.y=void 0!==b?b:0}
l=hf.prototype;l.clone=function(){return new hf(this.x,this.y)};
l.equals=function(a){return a instanceof hf&&(this==a?!0:this&&a?this.x==a.x&&this.y==a.y:!1)};
l.ceil=function(){this.x=Math.ceil(this.x);this.y=Math.ceil(this.y);return this};
l.floor=function(){this.x=Math.floor(this.x);this.y=Math.floor(this.y);return this};
l.round=function(){this.x=Math.round(this.x);this.y=Math.round(this.y);return this};
l.scale=function(a,b){this.x*=a;this.y*="number"===typeof b?b:a;return this};function jf(a,b){this.width=a;this.height=b}
l=jf.prototype;l.clone=function(){return new jf(this.width,this.height)};
l.aspectRatio=function(){return this.width/this.height};
l.isEmpty=function(){return!(this.width*this.height)};
l.ceil=function(){this.width=Math.ceil(this.width);this.height=Math.ceil(this.height);return this};
l.floor=function(){this.width=Math.floor(this.width);this.height=Math.floor(this.height);return this};
l.round=function(){this.width=Math.round(this.width);this.height=Math.round(this.height);return this};
l.scale=function(a,b){this.width*=a;this.height*="number"===typeof b?b:a;return this};function kf(a){var b=document;return"string"===typeof a?b.getElementById(a):a}
function lf(a){var b=document;a=String(a);"application/xhtml+xml"===b.contentType&&(a=a.toLowerCase());return b.createElement(a)}
function mf(a,b){for(var c=0;a;){if(b(a))return a;a=a.parentNode;c++}return null}
;var nf;function of(){var a=z.MessageChannel;"undefined"===typeof a&&"undefined"!==typeof window&&window.postMessage&&window.addEventListener&&!C("Presto")&&(a=function(){var e=lf("IFRAME");e.style.display="none";document.documentElement.appendChild(e);var f=e.contentWindow;e=f.document;e.open();e.close();var g="callImmediate"+Math.random(),h="file:"==f.location.protocol?"*":f.location.protocol+"//"+f.location.host;e=Wa(function(k){if(("*"==h||k.origin==h)&&k.data==g)this.port1.onmessage()},this);
f.addEventListener("message",e,!1);this.port1={};this.port2={postMessage:function(){f.postMessage(g,h)}}});
if("undefined"!==typeof a&&!Ub()){var b=new a,c={},d=c;b.port1.onmessage=function(){if(void 0!==c.next){c=c.next;var e=c.Sb;c.Sb=null;e()}};
return function(e){d.next={Sb:e};d=d.next;b.port2.postMessage(0)}}return function(e){z.setTimeout(e,0)}}
;function pf(){this.j=this.i=null}
pf.prototype.add=function(a,b){var c=qf.get();c.set(a,b);this.j?this.j.next=c:this.i=c;this.j=c};
pf.prototype.remove=function(){var a=null;this.i&&(a=this.i,this.i=this.i.next,this.i||(this.j=null),a.next=null);return a};
var qf=new ef(function(){return new rf},function(a){return a.reset()});
function rf(){this.next=this.scope=this.i=null}
rf.prototype.set=function(a,b){this.i=a;this.scope=b;this.next=null};
rf.prototype.reset=function(){this.next=this.scope=this.i=null};var sf,tf=!1,uf=new pf;function vf(a,b){sf||wf();tf||(sf(),tf=!0);uf.add(a,b)}
function wf(){if(z.Promise&&z.Promise.resolve){var a=z.Promise.resolve(void 0);sf=function(){a.then(xf)}}else sf=function(){var b=xf;
"function"!==typeof z.setImmediate||z.Window&&z.Window.prototype&&!C("Edge")&&z.Window.prototype.setImmediate==z.setImmediate?(nf||(nf=of()),nf(b)):z.setImmediate(b)}}
function xf(){for(var a;a=uf.remove();){try{a.i.call(a.scope)}catch(b){Ec(b)}ff(qf,a)}tf=!1}
;function yf(a){this.i=0;this.C=void 0;this.m=this.j=this.l=null;this.o=this.s=!1;if(a!=cb)try{var b=this;a.call(void 0,function(c){zf(b,2,c)},function(c){zf(b,3,c)})}catch(c){zf(this,3,c)}}
function Af(){this.next=this.context=this.onRejected=this.j=this.i=null;this.l=!1}
Af.prototype.reset=function(){this.context=this.onRejected=this.j=this.i=null;this.l=!1};
var Bf=new ef(function(){return new Af},function(a){a.reset()});
function Cf(a,b,c){var d=Bf.get();d.j=a;d.onRejected=b;d.context=c;return d}
function Df(a){return new yf(function(b,c){c(a)})}
yf.prototype.then=function(a,b,c){return Ef(this,"function"===typeof a?a:null,"function"===typeof b?b:null,c)};
yf.prototype.$goog_Thenable=!0;l=yf.prototype;l.nb=function(a,b){return Ef(this,null,a,b)};
l.catch=yf.prototype.nb;l.cancel=function(a){if(0==this.i){var b=new Ff(a);vf(function(){Gf(this,b)},this)}};
function Gf(a,b){if(0==a.i)if(a.l){var c=a.l;if(c.j){for(var d=0,e=null,f=null,g=c.j;g&&(g.l||(d++,g.i==a&&(e=g),!(e&&1<d)));g=g.next)e||(f=g);e&&(0==c.i&&1==d?Gf(c,b):(f?(d=f,d.next==c.m&&(c.m=d),d.next=d.next.next):Hf(c),If(c,e,3,b)))}a.l=null}else zf(a,3,b)}
function Jf(a,b){a.j||2!=a.i&&3!=a.i||Kf(a);a.m?a.m.next=b:a.j=b;a.m=b}
function Ef(a,b,c,d){var e=Cf(null,null,null);e.i=new yf(function(f,g){e.j=b?function(h){try{var k=b.call(d,h);f(k)}catch(m){g(m)}}:f;
e.onRejected=c?function(h){try{var k=c.call(d,h);void 0===k&&h instanceof Ff?g(h):f(k)}catch(m){g(m)}}:g});
e.i.l=a;Jf(a,e);return e.i}
l.Ad=function(a){this.i=0;zf(this,2,a)};
l.Bd=function(a){this.i=0;zf(this,3,a)};
function zf(a,b,c){if(0==a.i){a===c&&(b=3,c=new TypeError("Promise cannot resolve to itself"));a.i=1;a:{var d=c,e=a.Ad,f=a.Bd;if(d instanceof yf){Jf(d,Cf(e||cb,f||null,a));var g=!0}else{if(d)try{var h=!!d.$goog_Thenable}catch(m){h=!1}else h=!1;if(h)d.then(e,f,a),g=!0;else{if(Qa(d))try{var k=d.then;if("function"===typeof k){Lf(d,k,e,f,a);g=!0;break a}}catch(m){f.call(a,m);g=!0;break a}g=!1}}}g||(a.C=c,a.i=b,a.l=null,Kf(a),3!=b||c instanceof Ff||Mf(a,c))}}
function Lf(a,b,c,d,e){function f(k){h||(h=!0,d.call(e,k))}
function g(k){h||(h=!0,c.call(e,k))}
var h=!1;try{b.call(a,g,f)}catch(k){f(k)}}
function Kf(a){a.s||(a.s=!0,vf(a.Rc,a))}
function Hf(a){var b=null;a.j&&(b=a.j,a.j=b.next,b.next=null);a.j||(a.m=null);return b}
l.Rc=function(){for(var a;a=Hf(this);)If(this,a,this.i,this.C);this.s=!1};
function If(a,b,c,d){if(3==c&&b.onRejected&&!b.l)for(;a&&a.o;a=a.l)a.o=!1;if(b.i)b.i.l=null,Nf(b,c,d);else try{b.l?b.j.call(b.context):Nf(b,c,d)}catch(e){Of.call(null,e)}ff(Bf,b)}
function Nf(a,b,c){2==b?a.j.call(a.context,c):a.onRejected&&a.onRejected.call(a.context,c)}
function Mf(a,b){a.o=!0;vf(function(){a.o&&Of.call(null,b)})}
var Of=Ec;function Ff(a){ab.call(this,a)}
Za(Ff,ab);Ff.prototype.name="cancel";function Pf(a,b){bf.call(this);this.l=a||1;this.j=b||z;this.o=Wa(this.yd,this);this.s=Date.now()}
Za(Pf,bf);l=Pf.prototype;l.enabled=!1;l.ca=null;function Qf(a,b){a.l=b;a.ca&&a.enabled?(a.stop(),a.start()):a.ca&&a.stop()}
l.yd=function(){if(this.enabled){var a=Date.now()-this.s;0<a&&a<.8*this.l?this.ca=this.j.setTimeout(this.o,this.l-a):(this.ca&&(this.j.clearTimeout(this.ca),this.ca=null),cf(this,"tick"),this.enabled&&(this.stop(),this.start()))}};
l.start=function(){this.enabled=!0;this.ca||(this.ca=this.j.setTimeout(this.o,this.l),this.s=Date.now())};
l.stop=function(){this.enabled=!1;this.ca&&(this.j.clearTimeout(this.ca),this.ca=null)};
l.D=function(){Pf.Z.D.call(this);this.stop();delete this.j};
function Rf(a,b,c){if("function"===typeof a)c&&(a=Wa(a,c));else if(a&&"function"==typeof a.handleEvent)a=Wa(a.handleEvent,a);else throw Error("Invalid listener argument");return 2147483647<Number(b)?-1:z.setTimeout(a,b||0)}
;function Sf(a){this.C=a;this.i=new Map;this.s=new Set;this.l=0;this.m=100;this.flushInterval=3E4;this.j=new Pf(this.flushInterval);this.j.ja("tick",this.pb,!1,this);this.o=!1}
l=Sf.prototype;l.sc=function(a){this.o=a;this.m=1};
function Tf(a){a.j.enabled||a.j.start();a.l++;a.l>=a.m&&a.pb()}
l.pb=function(){var a=this.i.values();a=[].concat(ia(a)).filter(function(b){return b.Ca.size});
a.length&&this.C.flush(a,this.o);Uf(a);this.l=0;this.j.enabled&&this.j.stop()};
l.Ic=function(a){var b=Ja.apply(1,arguments);this.i.has(a)||this.i.set(a,new oe(a,b))};
l.Qb=function(a){var b=Ja.apply(1,arguments);this.i.has(a)||this.i.set(a,new pe(a,b))};
function Vf(a,b){return a.s.has(b)?void 0:a.i.get(b)}
l.Lb=function(a){this.Cc.apply(this,[a,1].concat(ia(Ja.apply(1,arguments))))};
l.Cc=function(a,b){var c=Ja.apply(2,arguments),d=Vf(this,a);d&&d instanceof oe&&(d.l(b,c),Tf(this))};
l.ob=function(a,b){var c=Ja.apply(2,arguments),d=Vf(this,a);d&&d instanceof pe&&(d.l(b,c),Tf(this))};
function Uf(a){for(var b=0;b<a.length;b++)a[b].clear()}
;function Wf(a){this.i=a;this.i.Qb("/client_streamz/bg/fil",{tb:3,sb:"rk"})}
function Xf(a){this.i=a;this.i.Ic("/client_streamz/bg/fsc",{tb:3,sb:"rk"})}
function Yf(a){this.i=a;this.i.Qb("/client_streamz/bg/fsl",{tb:3,sb:"rk"})}
;function Zf(a){I.call(this,a,-1,$f)}
u(Zf,I);function ag(a){I.call(this,a,-1,bg)}
u(ag,I);function cg(a){I.call(this,a)}
u(cg,I);function dg(a){I.call(this,a)}
u(dg,I);var $f=[3,6,4],bg=[1],eg=[1,2,3],fg=[1,2,3];function gg(a){I.call(this,a,-1,hg)}
u(gg,I);var hg=[1];function ig(a){if(!a)return"";if(/^about:(?:blank|srcdoc)$/.test(a))return window.origin||"";a=a.split("#")[0].split("?")[0];a=a.toLowerCase();0==a.indexOf("//")&&(a=window.location.protocol+a);/^[\w\-]*:\/\//.test(a)||(a=window.location.href);var b=a.substring(a.indexOf("://")+3),c=b.indexOf("/");-1!=c&&(b=b.substring(0,c));c=a.substring(0,a.indexOf("://"));if(!c)throw Error("URI is missing protocol: "+a);if("http"!==c&&"https"!==c&&"chrome-extension"!==c&&"moz-extension"!==c&&"file"!==c&&"android-app"!==
c&&"chrome-search"!==c&&"chrome-untrusted"!==c&&"chrome"!==c&&"app"!==c&&"devtools"!==c)throw Error("Invalid URI scheme in origin: "+c);a="";var d=b.indexOf(":");if(-1!=d){var e=b.substring(d+1);b=b.substring(0,d);if("http"===c&&"80"!==e||"https"===c&&"443"!==e)a=":"+e}return c+"://"+b+a}
;function jg(){function a(){e[0]=1732584193;e[1]=4023233417;e[2]=2562383102;e[3]=271733878;e[4]=3285377520;q=m=0}
function b(r){for(var w=g,t=0;64>t;t+=4)w[t/4]=r[t]<<24|r[t+1]<<16|r[t+2]<<8|r[t+3];for(t=16;80>t;t++)r=w[t-3]^w[t-8]^w[t-14]^w[t-16],w[t]=(r<<1|r>>>31)&4294967295;r=e[0];var y=e[1],E=e[2],F=e[3],O=e[4];for(t=0;80>t;t++){if(40>t)if(20>t){var N=F^y&(E^F);var Q=1518500249}else N=y^E^F,Q=1859775393;else 60>t?(N=y&E|F&(y|E),Q=2400959708):(N=y^E^F,Q=3395469782);N=((r<<5|r>>>27)&4294967295)+N+O+Q+w[t]&4294967295;O=F;F=E;E=(y<<30|y>>>2)&4294967295;y=r;r=N}e[0]=e[0]+r&4294967295;e[1]=e[1]+y&4294967295;e[2]=
e[2]+E&4294967295;e[3]=e[3]+F&4294967295;e[4]=e[4]+O&4294967295}
function c(r,w){if("string"===typeof r){r=unescape(encodeURIComponent(r));for(var t=[],y=0,E=r.length;y<E;++y)t.push(r.charCodeAt(y));r=t}w||(w=r.length);t=0;if(0==m)for(;t+64<w;)b(r.slice(t,t+64)),t+=64,q+=64;for(;t<w;)if(f[m++]=r[t++],q++,64==m)for(m=0,b(f);t+64<w;)b(r.slice(t,t+64)),t+=64,q+=64}
function d(){var r=[],w=8*q;56>m?c(h,56-m):c(h,64-(m-56));for(var t=63;56<=t;t--)f[t]=w&255,w>>>=8;b(f);for(t=w=0;5>t;t++)for(var y=24;0<=y;y-=8)r[w++]=e[t]>>y&255;return r}
for(var e=[],f=[],g=[],h=[128],k=1;64>k;++k)h[k]=0;var m,q;a();return{reset:a,update:c,digest:d,Oc:function(){for(var r=d(),w="",t=0;t<r.length;t++)w+="0123456789ABCDEF".charAt(Math.floor(r[t]/16))+"0123456789ABCDEF".charAt(r[t]%16);return w}}}
;function kg(a,b,c){var d=String(z.location.href);return d&&a&&b?[b,lg(ig(d),a,c||null)].join(" "):null}
function lg(a,b,c){var d=[],e=[];if(1==(Array.isArray(c)?2:1))return e=[b,a],fb(d,function(h){e.push(h)}),mg(e.join(" "));
var f=[],g=[];fb(c,function(h){g.push(h.key);f.push(h.value)});
c=Math.floor((new Date).getTime()/1E3);e=0==f.length?[c,b,a]:[f.join(":"),c,b,a];fb(d,function(h){e.push(h)});
a=mg(e.join(" "));a=[c,a];0==g.length||a.push(g.join(""));return a.join("_")}
function mg(a){var b=jg();b.update(a);return b.Oc().toLowerCase()}
;var ng={};function og(a){this.i=a||{cookie:""}}
l=og.prototype;l.isEnabled=function(){if(!z.navigator.cookieEnabled)return!1;if(!this.isEmpty())return!0;this.set("TESTCOOKIESENABLED","1",{hb:60});if("1"!==this.get("TESTCOOKIESENABLED"))return!1;this.remove("TESTCOOKIESENABLED");return!0};
l.set=function(a,b,c){var d=!1;if("object"===typeof c){var e=c.xr;d=c.secure||!1;var f=c.domain||void 0;var g=c.path||void 0;var h=c.hb}if(/[;=\s]/.test(a))throw Error('Invalid cookie name "'+a+'"');if(/[;\r\n]/.test(b))throw Error('Invalid cookie value "'+b+'"');void 0===h&&(h=-1);c=f?";domain="+f:"";g=g?";path="+g:"";d=d?";secure":"";h=0>h?"":0==h?";expires="+(new Date(1970,1,1)).toUTCString():";expires="+(new Date(Date.now()+1E3*h)).toUTCString();this.i.cookie=a+"="+b+c+g+h+d+(null!=e?";samesite="+
e:"")};
l.get=function(a,b){for(var c=a+"=",d=(this.i.cookie||"").split(";"),e=0,f;e<d.length;e++){f=Mb(d[e]);if(0==f.lastIndexOf(c,0))return f.slice(c.length);if(f==a)return""}return b};
l.remove=function(a,b,c){var d=void 0!==this.get(a);this.set(a,"",{hb:0,path:b,domain:c});return d};
l.xb=function(){return pg(this).keys};
l.isEmpty=function(){return!this.i.cookie};
l.clear=function(){for(var a=pg(this).keys,b=a.length-1;0<=b;b--)this.remove(a[b])};
function pg(a){a=(a.i.cookie||"").split(";");for(var b=[],c=[],d,e,f=0;f<a.length;f++)e=Mb(a[f]),d=e.indexOf("="),-1==d?(b.push(""),c.push(e)):(b.push(e.substring(0,d)),c.push(e.substring(d+1)));return{keys:b,values:c}}
var qg=new og("undefined"==typeof document?null:document);function rg(a){return!!ng.FPA_SAMESITE_PHASE2_MOD||!(void 0===a||!a)}
function sg(a){a=void 0===a?!1:a;var b=z.__SAPISID||z.__APISID||z.__3PSAPISID||z.__OVERRIDE_SID;rg(a)&&(b=b||z.__1PSAPISID);if(b)return!0;var c=new og(document);b=c.get("SAPISID")||c.get("APISID")||c.get("__Secure-3PAPISID")||c.get("SID");rg(a)&&(b=b||c.get("__Secure-1PAPISID"));return!!b}
function tg(a,b,c,d){(a=z[a])||(a=(new og(document)).get(b));return a?kg(a,c,d):null}
function ug(a,b){b=void 0===b?!1:b;var c=ig(String(z.location.href)),d=[];if(sg(b)){c=0==c.indexOf("https:")||0==c.indexOf("chrome-extension:")||0==c.indexOf("moz-extension:");var e=c?z.__SAPISID:z.__APISID;e||(e=new og(document),e=e.get(c?"SAPISID":"APISID")||e.get("__Secure-3PAPISID"));(e=e?kg(e,c?"SAPISIDHASH":"APISIDHASH",a):null)&&d.push(e);c&&rg(b)&&((b=tg("__1PSAPISID","__Secure-1PAPISID","SAPISID1PHASH",a))&&d.push(b),(a=tg("__3PSAPISID","__Secure-3PAPISID","SAPISID3PHASH",a))&&d.push(a))}return 0==
d.length?null:d.join(" ")}
;function vg(a){I.call(this,a,-1,wg)}
u(vg,I);var wg=[2];function xg(a){this.i=this.j=this.l=a}
xg.prototype.reset=function(){this.i=this.j=this.l};
xg.prototype.getValue=function(){return this.j};function yg(a){var b=[];zg(new Ag,a,b);return b.join("")}
function Ag(){}
function zg(a,b,c){if(null==b)c.push("null");else{if("object"==typeof b){if(Array.isArray(b)){var d=b;b=d.length;c.push("[");for(var e="",f=0;f<b;f++)c.push(e),zg(a,d[f],c),e=",";c.push("]");return}if(b instanceof String||b instanceof Number||b instanceof Boolean)b=b.valueOf();else{c.push("{");e="";for(d in b)Object.prototype.hasOwnProperty.call(b,d)&&(f=b[d],"function"!=typeof f&&(c.push(e),Bg(d,c),c.push(":"),zg(a,f,c),e=","));c.push("}");return}}switch(typeof b){case "string":Bg(b,c);break;case "number":c.push(isFinite(b)&&
!isNaN(b)?String(b):"null");break;case "boolean":c.push(String(b));break;case "function":c.push("null");break;default:throw Error("Unknown type: "+typeof b);}}}
var Cg={'"':'\\"',"\\":"\\\\","/":"\\/","\b":"\\b","\f":"\\f","\n":"\\n","\r":"\\r","\t":"\\t","\v":"\\u000b"},Dg=/\uffff/.test("\uffff")?/[\\"\x00-\x1f\x7f-\uffff]/g:/[\\"\x00-\x1f\x7f-\xff]/g;function Bg(a,b){b.push('"',a.replace(Dg,function(c){var d=Cg[c];d||(d="\\u"+(c.charCodeAt(0)|65536).toString(16).slice(1),Cg[c]=d);return d}),'"')}
;function Eg(){}
Eg.prototype.i=null;Eg.prototype.getOptions=function(){var a;(a=this.i)||(a={},Fg(this)&&(a[0]=!0,a[1]=!0),a=this.i=a);return a};var Gg;function Hg(){}
Za(Hg,Eg);function Kg(a){return(a=Fg(a))?new ActiveXObject(a):new XMLHttpRequest}
function Fg(a){if(!a.j&&"undefined"==typeof XMLHttpRequest&&"undefined"!=typeof ActiveXObject){for(var b=["MSXML2.XMLHTTP.6.0","MSXML2.XMLHTTP.3.0","MSXML2.XMLHTTP","Microsoft.XMLHTTP"],c=0;c<b.length;c++){var d=b[c];try{return new ActiveXObject(d),a.j=d}catch(e){}}throw Error("Could not create ActiveXObject. ActiveX might be disabled, or MSXML might not be installed");}return a.j}
Gg=new Hg;function Lg(a){bf.call(this);this.headers=new Map;this.L=a||null;this.j=!1;this.K=this.A=null;this.o=this.T="";this.l=this.R=this.u=this.P=!1;this.s=0;this.H=null;this.ea="";this.X=this.Y=!1}
Za(Lg,bf);var Mg=/^https?$/i,Ng=["POST","PUT"],Og=[];function Pg(a,b,c,d,e,f,g){var h=new Lg;Og.push(h);b&&h.ja("complete",b);h.m.add("ready",h.Mc,!0,void 0,void 0);f&&(h.s=Math.max(0,f));g&&(h.Y=g);h.send(a,c,d,e)}
l=Lg.prototype;l.Mc=function(){this.dispose();mb(Og,this)};
l.send=function(a,b,c,d){if(this.A)throw Error("[goog.net.XhrIo] Object is active with another request="+this.T+"; newUri="+a);b=b?b.toUpperCase():"GET";this.T=a;this.o="";this.P=!1;this.j=!0;this.A=this.L?Kg(this.L):Kg(Gg);this.K=this.L?this.L.getOptions():Gg.getOptions();this.A.onreadystatechange=Wa(this.kc,this);try{this.getStatus(),this.R=!0,this.A.open(b,String(a),!0),this.R=!1}catch(g){this.getStatus();Qg(this,g);return}a=c||"";c=new Map(this.headers);if(d)if(Object.getPrototypeOf(d)===Object.prototype)for(var e in d)c.set(e,
d[e]);else if("function"===typeof d.keys&&"function"===typeof d.get){e=p(d.keys());for(var f=e.next();!f.done;f=e.next())f=f.value,c.set(f,d.get(f))}else throw Error("Unknown input type for opt_headers: "+String(d));d=Array.from(c.keys()).find(function(g){return"content-type"==g.toLowerCase()});
e=z.FormData&&a instanceof z.FormData;!(0<=eb(Ng,b))||d||e||c.set("Content-Type","application/x-www-form-urlencoded;charset=utf-8");b=p(c);for(d=b.next();!d.done;d=b.next())c=p(d.value),d=c.next().value,c=c.next().value,this.A.setRequestHeader(d,c);this.ea&&(this.A.responseType=this.ea);"withCredentials"in this.A&&this.A.withCredentials!==this.Y&&(this.A.withCredentials=this.Y);try{Rg(this),0<this.s&&(this.X=Sg(this.A),this.getStatus(),this.X?(this.A.timeout=this.s,this.A.ontimeout=Wa(this.xc,this)):
this.H=Rf(this.xc,this.s,this)),this.getStatus(),this.u=!0,this.A.send(a),this.u=!1}catch(g){this.getStatus(),Qg(this,g)}};
function Sg(a){return Lc&&Wc()&&"number"===typeof a.timeout&&void 0!==a.ontimeout}
l.xc=function(){"undefined"!=typeof Ma&&this.A&&(this.o="Timed out after "+this.s+"ms, aborting",this.getStatus(),cf(this,"timeout"),this.abort(8))};
function Qg(a,b){a.j=!1;a.A&&(a.l=!0,a.A.abort(),a.l=!1);a.o=b;Tg(a);Ug(a)}
function Tg(a){a.P||(a.P=!0,cf(a,"complete"),cf(a,"error"))}
l.abort=function(){this.A&&this.j&&(this.getStatus(),this.j=!1,this.l=!0,this.A.abort(),this.l=!1,cf(this,"complete"),cf(this,"abort"),Ug(this))};
l.D=function(){this.A&&(this.j&&(this.j=!1,this.l=!0,this.A.abort(),this.l=!1),Ug(this,!0));Lg.Z.D.call(this)};
l.kc=function(){this.i()||(this.R||this.u||this.l?Vg(this):this.cd())};
l.cd=function(){Vg(this)};
function Vg(a){if(a.j&&"undefined"!=typeof Ma)if(a.K[1]&&4==Wg(a)&&2==a.getStatus())a.getStatus();else if(a.u&&4==Wg(a))Rf(a.kc,0,a);else if(cf(a,"readystatechange"),a.isComplete()){a.getStatus();a.j=!1;try{if(Xg(a))cf(a,"complete"),cf(a,"success");else{try{var b=2<Wg(a)?a.A.statusText:""}catch(c){b=""}a.o=b+" ["+a.getStatus()+"]";Tg(a)}}finally{Ug(a)}}}
function Ug(a,b){if(a.A){Rg(a);var c=a.A,d=a.K[0]?function(){}:null;
a.A=null;a.K=null;b||cf(a,"ready");try{c.onreadystatechange=d}catch(e){}}}
function Rg(a){a.A&&a.X&&(a.A.ontimeout=null);a.H&&(z.clearTimeout(a.H),a.H=null)}
l.isActive=function(){return!!this.A};
l.isComplete=function(){return 4==Wg(this)};
function Xg(a){var b=a.getStatus();a:switch(b){case 200:case 201:case 202:case 204:case 206:case 304:case 1223:var c=!0;break a;default:c=!1}if(!c){if(b=0===b)a=nc(1,String(a.T)),!a&&z.self&&z.self.location&&(a=z.self.location.protocol.slice(0,-1)),b=!Mg.test(a?a.toLowerCase():"");c=b}return c}
function Wg(a){return a.A?a.A.readyState:0}
l.getStatus=function(){try{return 2<Wg(this)?this.A.status:-1}catch(a){return-1}};
l.getLastError=function(){return"string"===typeof this.o?this.o:String(this.o)};function Yg(a){I.call(this,a)}
u(Yg,I);function Zg(a){I.call(this,a,-1,$g)}
u(Zg,I);var $g=[1];var ah=["platform","platformVersion","architecture","model","uaFullVersion"];new Zg;function bh(a){I.call(this,a)}
u(bh,I);function ch(a){I.call(this,a,31,dh)}
u(ch,I);var dh=[3,20,27];function eh(a){I.call(this,a,17,fh)}
u(eh,I);var fh=[3,5];function gh(a){I.call(this,a,6,hh)}
u(gh,I);var hh=[5];function ih(a){I.call(this,a)}
u(ih,I);var jh;jh=new function(a,b,c){this.j=a;this.fieldName=b;this.i=c;this.isRepeated=0;this.l=le}(175237375,{mr:0},ih);function kh(a,b,c,d,e,f,g,h,k,m,q){bf.call(this);var r=this;this.P="";this.l=[];this.Ob="";this.Pb=this.wa=-1;this.Xa=!1;this.K=this.o=null;this.H=0;this.Fc=1;this.timeoutMillis=0;this.ea=!1;bf.call(this);this.Ya=b||function(){};
this.u=new lh(a,f);this.Dc=d;this.Wa=q;this.Gc=Ya(gf,0,1);this.T=e||null;this.L=c||null;this.X=g||!1;this.pageId=k||null;this.logger=null;this.withCredentials=!h;this.Ja=f||!1;!this.Ja&&(65<=cc("Chromium")||45<=cc("Firefox")||12<=cc("Safari")||(Fc()||C("iPad")||C("iPod"))&&Gc());a=D(new bh,1,1);mh(this.u,a);this.s=new xg(1E4);this.j=new Pf(this.s.getValue());se(this,this.j);m=nh(this,m);Re(this.j,"tick",m,!1,this);this.R=new Pf(6E5);se(this,this.R);Re(this.R,"tick",m,!1,this);this.X||this.R.start();
this.Ja||(Re(document,"visibilitychange",function(){"hidden"===document.visibilityState&&r.Y()}),Re(document,"pagehide",this.Y,!1,this))}
u(kh,bf);function nh(a,b){return b?function(){b().then(function(){a.flush()})}:function(){a.flush()}}
kh.prototype.D=function(){this.Y();bf.prototype.D.call(this)};
function oh(a){a.T||(a.T=.01>a.Gc()?"https://www.google.com/log?format=json&hasfast=true":"https://play.google.com/log?format=json&hasfast=true");return a.T}
function ph(a,b){a.s=new xg(1>b?1:b);Qf(a.j,a.s.getValue())}
kh.prototype.log=function(a){a=a.clone();var b=this.Fc++;D(a,21,b);this.P&&D(a,26,this.P);if(!Ud(a,1)){b=a;var c=Date.now().toString();D(b,1,c)}null!=Ud(a,15,!1)||D(a,15,60*(new Date).getTimezoneOffset());this.o&&(b=this.o.clone(),G(a,vg,16,b));for(;1E3<=this.l.length;)this.l.shift(),++this.H;this.l.push(a);cf(this,new qh(a));this.X||this.j.enabled||this.j.start()};
kh.prototype.flush=function(a,b){var c=this;if(0===this.l.length)a&&a();else if(this.ea)rh(this);else{var d=Date.now();if(this.Pb>d&&this.wa<d)b&&b("throttled");else{var e=sh(this.u,this.l,this.H);d={};var f=this.Ya();f&&(d.Authorization=f);var g=oh(this);this.L&&(d["X-Goog-AuthUser"]=this.L,g=wc(g,"authuser",this.L));this.pageId&&(d["X-Goog-PageId"]=this.pageId,g=wc(g,"pageId",this.pageId));if(f&&this.Ob===f)b&&b("stale-auth-token");else{this.l=[];this.j.enabled&&this.j.stop();this.H=0;var h=ie(e),
k;this.K&&this.K.isSupported(h.length)&&(k=this.K.compress(h));var m={url:g,body:h,Kc:1,Gb:d,requestType:"POST",withCredentials:this.withCredentials,timeoutMillis:this.timeoutMillis},q=function(t){c.s.reset();Qf(c.j,c.s.getValue());if(t){var y=null;try{var E=JSON.parse(t.replace(")]}'\n",""));y=new gh(E)}catch(F){}y&&(t=Number(fe(Ud(y,1),"-1")),0<t&&(c.wa=Date.now(),c.Pb=c.wa+t),y=jh.l(y))&&(y=fe(Ud(y,1),-1),-1!=y&&(c.Xa||ph(c,y)))}a&&a()},r=function(t,y){var E=ae(e,ch,3),F=c.s;
F.i=Math.min(3E5,2*F.i);F.j=Math.min(3E5,F.i+Math.round(.2*(Math.random()-.5)*F.i));Qf(c.j,c.s.getValue());401===t&&f&&(c.Ob=f);void 0===y&&(y=500<=t&&600>t||401===t||0===t);y&&(c.l=E.concat(c.l),c.X||c.j.enabled||c.j.start());b&&b("net-send-failed",t)},w=function(){c.Wa?c.Wa.send(m,q,r):c.Dc(m,q,r)};
k?k.then(function(t){m.Gb["Content-Encoding"]="gzip";m.Gb["Content-Type"]="application/binary";m.body=t;m.Kc=2;w()},function(){w()}):w()}}}};
kh.prototype.Y=function(){this.flush()};
function rh(a){th(a,function(b,c){b=wc(b,"format","json");b=window.navigator.sendBeacon(b,ie(c));a.ea&&!b&&(a.ea=!1);return b})}
function th(a,b){if(0!==a.l.length){var c=Dc(oh(a),"format");c=uc(c,"auth",a.Ya(),"authuser",a.L||"0");for(var d=0;10>d&&a.l.length;++d){var e=a.l.slice(0,32),f=sh(a.u,e,a.H);if(!b(c,f))break;a.H=0;a.l=a.l.slice(e.length)}a.j.enabled&&a.j.stop()}}
function qh(){ue.call(this,"event-logged",void 0)}
u(qh,ue);function lh(a,b){this.j=b=void 0===b?!1:b;this.uach=this.locale=null;this.i=new eh;D(this.i,2,a);b||(this.locale=document.documentElement.getAttribute("lang"));mh(this,new bh)}
function mh(a,b){G(a.i,bh,1,b);Ud(b,1)||D(b,1,1);a.j||(b=uh(a),Ud(b,5)||D(b,5,a.locale));a.uach&&(b=uh(a),Yd(b,Zg,9)||G(b,Zg,9,a.uach))}
function vh(a,b){var c=void 0===c?ah:c;b(window,c).then(function(d){a.uach=d;d=uh(a);G(d,Zg,9,a.uach);return!0}).catch(function(){return!1})}
function uh(a){a=Yd(a.i,bh,1);var b=Yd(a,Yg,11);b||(b=new Yg,G(a,Yg,11,b));return b}
function sh(a,b,c){c=void 0===c?0:c;a=a.i.clone();var d=Date.now().toString();a=D(a,4,d);b=ce(a,ch,3,b);c&&D(b,14,c);return b}
;function wh(a,b,c){Pg(a.url,function(d){d=d.target;if(Xg(d)){try{var e=d.A?d.A.responseText:""}catch(f){e=""}b(e)}else c(d.getStatus())},a.requestType,a.body,a.Gb,a.timeoutMillis,a.withCredentials)}
;function xh(){this.l="https://play.google.com/log?format=json&hasfast=true";this.u=!1;this.o=wh;this.i=""}
;function yh(){var a=void 0===a?"":a;var b=void 0===b?"":b;var c=new xh;c.i="";""!=a&&(c.l=a);b&&(c.j=b);a=new kh(1828,c.K?c.K:ug,"0",c.o,c.l,c.u,!1,c.R,void 0,void 0,c.s?c.s:void 0);c.N&&mh(a.u,c.N);if(c.j){b=c.j;var d=uh(a.u);D(d,7,b)}c.m&&(a.K=c.m);c.i&&(a.P=c.i);c.C&&((b=c.C)?(a.o||(a.o=new vg),b=ie(b),D(a.o,4,b)):a.o&&D(a.o,4,void 0,!1));c.L&&(d=c.L,a.o||(a.o=new vg),b=a.o,null==d?d=Kd:yd(d),D(b,2,d));c.H&&(b=c.H,a.Xa=!0,ph(a,b));c.P&&vh(a.u,c.P);this.i=a}
yh.prototype.flush=function(a){var b=a||[];if(b.length){a=new gg;for(var c=[],d=0;d<b.length;d++){var e=b[d],f=e,g=new Zf;var h=D(g,1,f.j);var k=f;g=[];for(var m=0;m<k.i.length;m++)g.push(k.i[m].sb);if(null==g)g=Kd;else{for(k=0;k<g.length;k++);ud(g,5)}g=D(h,3,g);h=[];k=[];m=p(f.Ca.keys());for(var q=m.next();!q.done;q=m.next())k.push(q.value.split(","));for(m=0;m<k.length;m++){q=k[m];var r=f.m;for(var w=f.ub(q)||[],t=[],y=0;y<w.length;y++){var E=w[y];E=E&&E.Tb;var F=new dg;switch(r){case 3:Wd(F,1,
fg,Number(E));break;case 2:Wd(F,2,fg,Number(E))}t.push(F)}r=t;for(w=0;w<r.length;w++){t=r[w];y=new ag;t=G(y,dg,2,t);y=q;E=[];F=f;for(var O=[],N=0;N<F.i.length;N++)O.push(F.i[N].tb);F=O;for(O=0;O<F.length;O++){N=F[O];var Q=y[O],ca=new cg;switch(N){case 3:Wd(ca,1,eg,String(Q));break;case 2:Wd(ca,2,eg,Number(Q));break;case 1:Wd(ca,3,eg,"true"==Q)}E.push(ca)}ce(t,cg,1,E);h.push(t)}}ce(g,ag,4,h);c.push(g);e.clear()}ce(a,Zf,1,c);b=this.i;a instanceof ch?b.log(a):(c=new ch,a=ie(a),a=D(c,8,a),b.log(a));this.i.flush()}};function zh(){this.s=Ah();this.m=new yh;this.i=new Sf(this.m);this.o=new Wf(this.i);this.j=new Xf(this.i);this.l=new Yf(this.i);this.Fa=window.document.location.hostname}
function Ah(){var a,b,c;return null!=(c=null==(a=globalThis.performance)?void 0:null==(b=a.now)?void 0:b.call(a))?c:Date.now()}
;function Bh(){var a=this;this.promise=new Promise(function(b,c){a.resolve=b;a.reject=c})}
;function Ch(a){var b=this;this.j=!1;if(a.gd){var c;this.xa=null!=(c=a.xa)?c:new zh}c=a.program;a=a.globalName;var d=new Bh;this.l=d.promise;this.m=p((0,z[a].a)(c,function(e,f){Promise.resolve().then(function(){var g;if(null!=(g=b.xa)){var h=Ah()-g.s;g.o.i.ob("/client_streamz/bg/fil",h,g.Fa)}d.resolve({Jc:e,ud:f})})},!0)).next().value;
this.td=d.promise.then(function(){})}
Ch.prototype.snapshot=function(a){var b=this;if(this.j)throw Error("Already disposed");var c=Ah(),d;null!=(d=this.xa)&&d.j.i.Lb("/client_streamz/bg/fsc",d.Fa);return this.l.then(function(e){var f=e.Jc;return new Promise(function(g){f(function(h){var k;if(null!=(k=b.xa)){var m=Ah()-c;k.l.i.ob("/client_streamz/bg/fsl",m,k.Fa)}g(h)},[a.Vb,
a.vd])})})};
Ch.prototype.vc=function(a){if(this.j)throw Error("Already disposed");var b=Ah(),c;null!=(c=this.xa)&&c.j.i.Lb("/client_streamz/bg/fsc",c.Fa);a=this.m([a.Vb,a.vd]);null!=(c=this.xa)&&(b=Ah()-b,c.l.i.ob("/client_streamz/bg/fsl",b,c.Fa));return a};
Ch.prototype.dispose=function(){var a;null!=(a=this.xa)&&a.i.pb();this.j=!0;this.l.then(function(b){(b=b.ud)&&b()})};
Ch.prototype.i=function(){return this.j};var Dh=window;Db("csi.gstatic.com");Db("googleads.g.doubleclick.net");Db("partner.googleadservices.com");Db("pubads.g.doubleclick.net");Db("securepubads.g.doubleclick.net");Db("tpc.googlesyndication.com");/*

 SPDX-License-Identifier: Apache-2.0
*/
var Eh;try{new URL("s://g"),Eh=!0}catch(a){Eh=!1}var Fh=Eh;function Gh(a,b){a.src=Kb(b);var c,d;(c=(b=null==(d=(c=(a.ownerDocument&&a.ownerDocument.defaultView||window).document).querySelector)?void 0:d.call(c,"script[nonce]"))?b.nonce||b.getAttribute("nonce")||"":"")&&a.setAttribute("nonce",c)}
;function Hh(a){var b=Ih;if(b)for(var c in b)Object.prototype.hasOwnProperty.call(b,c)&&a(b[c],c,b)}
function Jh(){var a=[];Hh(function(b){a.push(b)});
return a}
var Ih={Pd:"allow-forms",Qd:"allow-modals",Rd:"allow-orientation-lock",Sd:"allow-pointer-lock",Td:"allow-popups",Ud:"allow-popups-to-escape-sandbox",Vd:"allow-presentation",Wd:"allow-same-origin",Xd:"allow-scripts",Yd:"allow-top-navigation",Zd:"allow-top-navigation-by-user-activation"},Kh=db(function(){return Jh()});
function Lh(){var a=Mh(),b={};fb(Kh(),function(c){a.sandbox&&a.sandbox.supports&&a.sandbox.supports(c)&&(b[c]=!0)});
return b}
function Mh(){var a=void 0===a?document:a;return a.createElement("iframe")}
;function Nh(a){this.isValid=a}
function Oh(a){return new Nh(function(b){return b.substr(0,a.length+1).toLowerCase()===a+":"})}
var Ph=[Oh("data"),Oh("http"),Oh("https"),Oh("mailto"),Oh("ftp"),new Nh(function(a){return/^[^:]*([/?#]|$)/.test(a)})];function Qh(a){"number"==typeof a&&(a=Math.round(a)+"px");return a}
;var Rh=(new Date).getTime();var Sh="client_dev_domain client_dev_regex_map client_dev_root_url client_rollout_override expflag forcedCapability jsfeat jsmode mods".split(" ");ia(Sh);function Th(a){bf.call(this);var b=this;this.u=this.l=0;this.aa=null!=a?a:{V:function(e,f){return setTimeout(e,f)},
ga:function(e){clearTimeout(e)}};
var c,d;this.j=null!=(d=null==(c=window.navigator)?void 0:c.onLine)?d:!0;this.o=function(){return x(function(e){return v(e,Uh(b),0)})};
window.addEventListener("offline",this.o);window.addEventListener("online",this.o);this.u||Vh(this)}
u(Th,bf);function Wh(){var a=Xh;Th.i||(Th.i=new Th(a));return Th.i}
Th.prototype.dispose=function(){window.removeEventListener("offline",this.o);window.removeEventListener("online",this.o);this.aa.ga(this.u);delete Th.i};
Th.prototype.W=function(){return this.j};
function Vh(a){a.u=a.aa.V(function(){var b;return x(function(c){if(1==c.i)return a.j?(null==(b=window.navigator)?0:b.onLine)?c.B(3):v(c,Uh(a),3):v(c,Uh(a),3);Vh(a);c.i=0})},3E4)}
function Uh(a,b){return a.s?a.s:a.s=new Promise(function(c){var d,e,f,g;return x(function(h){switch(h.i){case 1:return d=window.AbortController?new window.AbortController:void 0,f=null==(e=d)?void 0:e.signal,g=!1,ya(h,2,3),d&&(a.l=a.aa.V(function(){d.abort()},b||2E4)),v(h,fetch("/generate_204",{method:"HEAD",
signal:f}),5);case 5:g=!0;case 3:Ba(h);a.s=void 0;a.l&&(a.aa.ga(a.l),a.l=0);g!==a.j&&(a.j=g,a.j?cf(a,"networkstatus-online"):cf(a,"networkstatus-offline"));c(g);Ca(h);break;case 2:Aa(h),g=!1,h.B(3)}})})}
;function Yh(){this.data_=[];this.i=-1}
Yh.prototype.set=function(a,b){b=void 0===b?!0:b;0<=a&&52>a&&Number.isInteger(a)&&this.data_[a]!==b&&(this.data_[a]=b,this.i=-1)};
Yh.prototype.get=function(a){return!!this.data_[a]};
function Zh(a){-1===a.i&&(a.i=ib(a.data_,function(b,c,d){return c?b+Math.pow(2,d):b},0));
return a.i}
;function $h(a,b){this.i=a[z.Symbol.iterator]();this.j=b}
$h.prototype[Symbol.iterator]=function(){return this};
$h.prototype.next=function(){var a=this.i.next();return{value:a.done?void 0:this.j.call(void 0,a.value),done:a.done}};
function ai(a,b){return new $h(a,b)}
;function bi(){this.blockSize=-1}
;function ci(){this.blockSize=-1;this.blockSize=64;this.i=[];this.o=[];this.s=[];this.l=[];this.l[0]=128;for(var a=1;a<this.blockSize;++a)this.l[a]=0;this.m=this.j=0;this.reset()}
Za(ci,bi);ci.prototype.reset=function(){this.i[0]=1732584193;this.i[1]=4023233417;this.i[2]=2562383102;this.i[3]=271733878;this.i[4]=3285377520;this.m=this.j=0};
function di(a,b,c){c||(c=0);var d=a.s;if("string"===typeof b)for(var e=0;16>e;e++)d[e]=b.charCodeAt(c)<<24|b.charCodeAt(c+1)<<16|b.charCodeAt(c+2)<<8|b.charCodeAt(c+3),c+=4;else for(e=0;16>e;e++)d[e]=b[c]<<24|b[c+1]<<16|b[c+2]<<8|b[c+3],c+=4;for(e=16;80>e;e++){var f=d[e-3]^d[e-8]^d[e-14]^d[e-16];d[e]=(f<<1|f>>>31)&4294967295}b=a.i[0];c=a.i[1];var g=a.i[2],h=a.i[3],k=a.i[4];for(e=0;80>e;e++){if(40>e)if(20>e){f=h^c&(g^h);var m=1518500249}else f=c^g^h,m=1859775393;else 60>e?(f=c&g|h&(c|g),m=2400959708):
(f=c^g^h,m=3395469782);f=(b<<5|b>>>27)+f+k+m+d[e]&4294967295;k=h;h=g;g=(c<<30|c>>>2)&4294967295;c=b;b=f}a.i[0]=a.i[0]+b&4294967295;a.i[1]=a.i[1]+c&4294967295;a.i[2]=a.i[2]+g&4294967295;a.i[3]=a.i[3]+h&4294967295;a.i[4]=a.i[4]+k&4294967295}
ci.prototype.update=function(a,b){if(null!=a){void 0===b&&(b=a.length);for(var c=b-this.blockSize,d=0,e=this.o,f=this.j;d<b;){if(0==f)for(;d<=c;)di(this,a,d),d+=this.blockSize;if("string"===typeof a)for(;d<b;){if(e[f]=a.charCodeAt(d),++f,++d,f==this.blockSize){di(this,e);f=0;break}}else for(;d<b;)if(e[f]=a[d],++f,++d,f==this.blockSize){di(this,e);f=0;break}}this.j=f;this.m+=b}};
ci.prototype.digest=function(){var a=[],b=8*this.m;56>this.j?this.update(this.l,56-this.j):this.update(this.l,this.blockSize-(this.j-56));for(var c=this.blockSize-1;56<=c;c--)this.o[c]=b&255,b/=256;di(this,this.o);for(c=b=0;5>c;c++)for(var d=24;0<=d;d-=8)a[b]=this.i[c]>>d&255,++b;return a};function ei(a){return"string"==typeof a.className?a.className:a.getAttribute&&a.getAttribute("class")||""}
function fi(a,b){"string"==typeof a.className?a.className=b:a.setAttribute&&a.setAttribute("class",b)}
function gi(a,b){a.classList?b=a.classList.contains(b):(a=a.classList?a.classList:ei(a).match(/\S+/g)||[],b=0<=eb(a,b));return b}
function hi(){var a=document.body;a.classList?a.classList.remove("inverted-hdpi"):gi(a,"inverted-hdpi")&&fi(a,Array.prototype.filter.call(a.classList?a.classList:ei(a).match(/\S+/g)||[],function(b){return"inverted-hdpi"!=b}).join(" "))}
;function ii(){}
ii.prototype.next=function(){return ji};
var ji={done:!0,value:void 0};function ki(a){return{value:a,done:!1}}
ii.prototype.fa=function(){return this};function li(a){if(a instanceof mi||a instanceof ni||a instanceof oi)return a;if("function"==typeof a.next)return new mi(function(){return a});
if("function"==typeof a[Symbol.iterator])return new mi(function(){return a[Symbol.iterator]()});
if("function"==typeof a.fa)return new mi(function(){return a.fa()});
throw Error("Not an iterator or iterable.");}
function mi(a){this.j=a}
mi.prototype.fa=function(){return new ni(this.j())};
mi.prototype[Symbol.iterator]=function(){return new oi(this.j())};
mi.prototype.i=function(){return new oi(this.j())};
function ni(a){this.j=a}
u(ni,ii);ni.prototype.next=function(){return this.j.next()};
ni.prototype[Symbol.iterator]=function(){return new oi(this.j)};
ni.prototype.i=function(){return new oi(this.j)};
function oi(a){mi.call(this,function(){return a});
this.l=a}
u(oi,mi);oi.prototype.next=function(){return this.l.next()};function pi(a,b){this.j={};this.i=[];this.sa=this.size=0;var c=arguments.length;if(1<c){if(c%2)throw Error("Uneven number of arguments");for(var d=0;d<c;d+=2)this.set(arguments[d],arguments[d+1])}else if(a)if(a instanceof pi)for(c=a.xb(),d=0;d<c.length;d++)this.set(c[d],a.get(c[d]));else for(d in a)this.set(d,a[d])}
l=pi.prototype;l.xb=function(){qi(this);return this.i.concat()};
l.has=function(a){return ri(this.j,a)};
l.equals=function(a,b){if(this===a)return!0;if(this.size!=a.size)return!1;b=b||si;qi(this);for(var c,d=0;c=this.i[d];d++)if(!b(this.get(c),a.get(c)))return!1;return!0};
function si(a,b){return a===b}
l.isEmpty=function(){return 0==this.size};
l.clear=function(){this.j={};this.sa=this.size=this.i.length=0};
l.remove=function(a){return this.delete(a)};
l.delete=function(a){return ri(this.j,a)?(delete this.j[a],--this.size,this.sa++,this.i.length>2*this.size&&qi(this),!0):!1};
function qi(a){if(a.size!=a.i.length){for(var b=0,c=0;b<a.i.length;){var d=a.i[b];ri(a.j,d)&&(a.i[c++]=d);b++}a.i.length=c}if(a.size!=a.i.length){var e={};for(c=b=0;b<a.i.length;)d=a.i[b],ri(e,d)||(a.i[c++]=d,e[d]=1),b++;a.i.length=c}}
l.get=function(a,b){return ri(this.j,a)?this.j[a]:b};
l.set=function(a,b){ri(this.j,a)||(this.size+=1,this.i.push(a),this.sa++);this.j[a]=b};
l.forEach=function(a,b){for(var c=this.xb(),d=0;d<c.length;d++){var e=c[d],f=this.get(e);a.call(b,f,e,this)}};
l.clone=function(){return new pi(this)};
l.keys=function(){return li(this.fa(!0)).i()};
l.values=function(){return li(this.fa(!1)).i()};
l.entries=function(){var a=this;return ai(this.keys(),function(b){return[b,a.get(b)]})};
l.fa=function(a){qi(this);var b=0,c=this.sa,d=this,e=new ii;e.next=function(){if(c!=d.sa)throw Error("The map has changed since the iterator was created");if(b>=d.i.length)return ji;var f=d.i[b++];return ki(a?f:d.j[f])};
return e};
function ri(a,b){return Object.prototype.hasOwnProperty.call(a,b)}
;function K(a){J.call(this);this.s=1;this.m=[];this.o=0;this.j=[];this.l={};this.u=!!a}
Za(K,J);l=K.prototype;l.subscribe=function(a,b,c){var d=this.l[a];d||(d=this.l[a]=[]);var e=this.s;this.j[e]=a;this.j[e+1]=b;this.j[e+2]=c;this.s=e+3;d.push(e);return e};
function ti(a,b,c,d){if(b=a.l[b]){var e=a.j;(b=b.find(function(f){return e[f+1]==c&&e[f+2]==d}))&&a.Ia(b)}}
l.Ia=function(a){var b=this.j[a];if(b){var c=this.l[b];0!=this.o?(this.m.push(a),this.j[a+1]=function(){}):(c&&mb(c,a),delete this.j[a],delete this.j[a+1],delete this.j[a+2])}return!!b};
l.va=function(a,b){var c=this.l[a];if(c){for(var d=Array(arguments.length-1),e=1,f=arguments.length;e<f;e++)d[e-1]=arguments[e];if(this.u)for(e=0;e<c.length;e++){var g=c[e];ui(this.j[g+1],this.j[g+2],d)}else{this.o++;try{for(e=0,f=c.length;e<f&&!this.i();e++)g=c[e],this.j[g+1].apply(this.j[g+2],d)}finally{if(this.o--,0<this.m.length&&0==this.o)for(;c=this.m.pop();)this.Ia(c)}}return 0!=e}return!1};
function ui(a,b,c){vf(function(){a.apply(b,c)})}
l.clear=function(a){if(a){var b=this.l[a];b&&(b.forEach(this.Ia,this),delete this.l[a])}else this.j.length=0,this.l={}};
l.D=function(){K.Z.D.call(this);this.clear();this.m.length=0};function vi(a){this.i=a}
vi.prototype.set=function(a,b){void 0===b?this.i.remove(a):this.i.set(a,yg(b))};
vi.prototype.get=function(a){try{var b=this.i.get(a)}catch(c){return}if(null!==b)try{return JSON.parse(b)}catch(c){throw"Storage: Invalid value was encountered";}};
vi.prototype.remove=function(a){this.i.remove(a)};function wi(a){this.i=a}
Za(wi,vi);function xi(a){this.data=a}
function yi(a){return void 0===a||a instanceof xi?a:new xi(a)}
wi.prototype.set=function(a,b){wi.Z.set.call(this,a,yi(b))};
wi.prototype.j=function(a){a=wi.Z.get.call(this,a);if(void 0===a||a instanceof Object)return a;throw"Storage: Invalid value was encountered";};
wi.prototype.get=function(a){if(a=this.j(a)){if(a=a.data,void 0===a)throw"Storage: Invalid value was encountered";}else a=void 0;return a};function zi(a){this.i=a}
Za(zi,wi);zi.prototype.set=function(a,b,c){if(b=yi(b)){if(c){if(c<Date.now()){zi.prototype.remove.call(this,a);return}b.expiration=c}b.creation=Date.now()}zi.Z.set.call(this,a,b)};
zi.prototype.j=function(a){var b=zi.Z.j.call(this,a);if(b){var c=b.creation,d=b.expiration;if(d&&d<Date.now()||c&&c>Date.now())zi.prototype.remove.call(this,a);else return b}};function Ai(){}
;function Bi(){}
Za(Bi,Ai);Bi.prototype[Symbol.iterator]=function(){return li(this.fa(!0)).i()};
Bi.prototype.clear=function(){var a=Array.from(this);a=p(a);for(var b=a.next();!b.done;b=a.next())this.remove(b.value)};function Ci(a){this.i=a}
Za(Ci,Bi);l=Ci.prototype;l.isAvailable=function(){if(!this.i)return!1;try{return this.i.setItem("__sak","1"),this.i.removeItem("__sak"),!0}catch(a){return!1}};
l.set=function(a,b){try{this.i.setItem(a,b)}catch(c){if(0==this.i.length)throw"Storage mechanism: Storage disabled";throw"Storage mechanism: Quota exceeded";}};
l.get=function(a){a=this.i.getItem(a);if("string"!==typeof a&&null!==a)throw"Storage mechanism: Invalid value was encountered";return a};
l.remove=function(a){this.i.removeItem(a)};
l.fa=function(a){var b=0,c=this.i,d=new ii;d.next=function(){if(b>=c.length)return ji;var e=c.key(b++);if(a)return ki(e);e=c.getItem(e);if("string"!==typeof e)throw"Storage mechanism: Invalid value was encountered";return ki(e)};
return d};
l.clear=function(){this.i.clear()};
l.key=function(a){return this.i.key(a)};function Di(){var a=null;try{a=window.localStorage||null}catch(b){}this.i=a}
Za(Di,Ci);function Ei(a,b){this.j=a;this.i=null;var c;if(c=Lc)c=!(9<=Number(Zc));if(c){Fi||(Fi=new pi);this.i=Fi.get(a);this.i||(b?this.i=document.getElementById(b):(this.i=document.createElement("userdata"),this.i.addBehavior("#default#userData"),document.body.appendChild(this.i)),Fi.set(a,this.i));try{this.i.load(this.j)}catch(d){this.i=null}}}
Za(Ei,Bi);var Gi={".":".2E","!":".21","~":".7E","*":".2A","'":".27","(":".28",")":".29","%":"."},Fi=null;function Hi(a){return"_"+encodeURIComponent(a).replace(/[.!~*'()%]/g,function(b){return Gi[b]})}
l=Ei.prototype;l.isAvailable=function(){return!!this.i};
l.set=function(a,b){this.i.setAttribute(Hi(a),b);Ii(this)};
l.get=function(a){a=this.i.getAttribute(Hi(a));if("string"!==typeof a&&null!==a)throw"Storage mechanism: Invalid value was encountered";return a};
l.remove=function(a){this.i.removeAttribute(Hi(a));Ii(this)};
l.fa=function(a){var b=0,c=this.i.XMLDocument.documentElement.attributes,d=new ii;d.next=function(){if(b>=c.length)return ji;var e=c[b++];if(a)return ki(decodeURIComponent(e.nodeName.replace(/\./g,"%")).slice(1));e=e.nodeValue;if("string"!==typeof e)throw"Storage mechanism: Invalid value was encountered";return ki(e)};
return d};
l.clear=function(){for(var a=this.i.XMLDocument.documentElement,b=a.attributes.length;0<b;b--)a.removeAttribute(a.attributes[b-1].nodeName);Ii(this)};
function Ii(a){try{a.i.save(a.j)}catch(b){throw"Storage mechanism: Quota exceeded";}}
;function Ji(a,b){this.j=a;this.i=b+"::"}
Za(Ji,Bi);Ji.prototype.set=function(a,b){this.j.set(this.i+a,b)};
Ji.prototype.get=function(a){return this.j.get(this.i+a)};
Ji.prototype.remove=function(a){this.j.remove(this.i+a)};
Ji.prototype.fa=function(a){var b=this.j[Symbol.iterator](),c=this,d=new ii;d.next=function(){var e=b.next();if(e.done)return e;for(e=e.value;e.slice(0,c.i.length)!=c.i;){e=b.next();if(e.done)return e;e=e.value}return ki(a?e.slice(c.i.length):c.j.get(e))};
return d};function Ki(a){I.call(this,a)}
u(Ki,I);function Li(a){I.call(this,a)}
u(Li,I);Li.prototype.getKey=function(){return Ud(this,1)};
Li.prototype.getValue=function(){return ee(this,2===Xd(this,Mi)?2:-1)};
Li.prototype.setValue=function(a){return Wd(this,2,Mi,a)};
var Mi=[2,3,4,5,6];function Ni(a){I.call(this,a)}
u(Ni,I);function Oi(a){I.call(this,a)}
u(Oi,I);function Pi(a){I.call(this,a,-1,Qi)}
u(Pi,I);var Qi=[2];function Ri(a){I.call(this,a,-1,Si)}
u(Ri,I);Ri.prototype.getPlayerType=function(){return Ud(this,36)};
Ri.prototype.setHomeGroupInfo=function(a){return G(this,Pi,81,a)};
Ri.prototype.clearLocationPlayabilityToken=function(){return D(this,89,void 0,!1)};
var Si=[9,66,24,32,86,100,101];function Ti(a){I.call(this,a,-1,Ui)}
u(Ti,I);var Ui=[15,26,28];function Vi(a){I.call(this,a)}
u(Vi,I);Vi.prototype.setToken=function(a){return D(this,2,a)};function Wi(a){I.call(this,a,-1,Xi)}
u(Wi,I);Wi.prototype.setSafetyMode=function(a){return D(this,5,a)};
var Xi=[12];function Yi(a){I.call(this,a,-1,Zi)}
u(Yi,I);Yi.prototype.j=function(a){G(this,Ri,1,a)};
var Zi=[12];function $i(a){this.name=a}
;var aj=new $i("continuationCommand");var bj=new $i("webCommandMetadata");var cj=new $i("signalServiceEndpoint");var dj={oi:"EMBEDDED_PLAYER_MODE_UNKNOWN",li:"EMBEDDED_PLAYER_MODE_DEFAULT",ni:"EMBEDDED_PLAYER_MODE_PFP",mi:"EMBEDDED_PLAYER_MODE_PFL"};var ej=new $i("feedbackEndpoint");var fj={Iq:"WEB_DISPLAY_MODE_UNKNOWN",Eq:"WEB_DISPLAY_MODE_BROWSER",Gq:"WEB_DISPLAY_MODE_MINIMAL_UI",Hq:"WEB_DISPLAY_MODE_STANDALONE",Fq:"WEB_DISPLAY_MODE_FULLSCREEN"};function gj(a){I.call(this,a,-1,hj)}
u(gj,I);function ij(a){I.call(this,a)}
u(ij,I);ij.prototype.getKey=function(){return fe(Ud(this,1),"")};
ij.prototype.getValue=function(){return fe(Ud(this,2),"")};
ij.prototype.setValue=function(a){return D(this,2,a)};
var hj=[4,5];function jj(a){I.call(this,a)}
u(jj,I);function kj(a){I.call(this,a)}
u(kj,I);var lj=[2,3,4];function mj(a){I.call(this,a)}
u(mj,I);mj.prototype.getMessage=function(){return fe(Ud(this,1),"")};function nj(a){I.call(this,a)}
u(nj,I);function oj(a){I.call(this,a)}
u(oj,I);function pj(a){I.call(this,a,-1,qj)}
u(pj,I);var qj=[10,17];function rj(a){I.call(this,a)}
u(rj,I);function sj(a){I.call(this,a)}
u(sj,I);function tj(a){I.call(this,a)}
u(tj,I);function uj(a){I.call(this,a)}
u(uj,I);function vj(a){I.call(this,a)}
u(vj,I);function wj(a,b){G(a,tj,1,b)}
vj.prototype.j=function(a){D(this,2,a)};
function xj(a){I.call(this,a)}
u(xj,I);function yj(a,b){G(a,tj,1,b)}
;function zj(a){I.call(this,a,-1,Aj)}
u(zj,I);zj.prototype.j=function(a){D(this,1,a)};
function Bj(a,b){G(a,tj,2,b)}
var Aj=[3];function Cj(a){I.call(this,a)}
u(Cj,I);Cj.prototype.j=function(a){D(this,1,a)};function Dj(a){I.call(this,a)}
u(Dj,I);Dj.prototype.j=function(a){D(this,1,a)};function Ej(a){I.call(this,a)}
u(Ej,I);Ej.prototype.j=function(a){D(this,1,a)};function Fj(a){I.call(this,a)}
u(Fj,I);Fj.prototype.j=function(a){D(this,1,a)};function Gj(a){I.call(this,a)}
u(Gj,I);function Hj(a){I.call(this,a)}
u(Hj,I);function Ij(a){I.call(this,a,-1,Jj)}
u(Ij,I);Ij.prototype.getPlayerType=function(){var a=Ud(this,7);return null==a?0:a};
Ij.prototype.setVideoId=function(a){return D(this,19,a)};
function Kj(a,b){de(a,68,Lj,b)}
function Lj(a){I.call(this,a)}
u(Lj,I);Lj.prototype.getId=function(){return fe(Ud(this,2),"")};
var Jj=[83,68];function Mj(a){I.call(this,a)}
u(Mj,I);function Nj(a){I.call(this,a)}
u(Nj,I);function Oj(a){I.call(this,a)}
u(Oj,I);function Pj(a){I.call(this,a,449)}
u(Pj,I);
var kk=[23,24,11,6,7,5,2,3,13,20,21,22,28,32,37,229,241,45,59,225,288,72,73,78,208,156,202,215,74,76,79,80,111,85,91,97,100,102,105,119,126,127,136,146,148,151,157,158,159,163,164,168,176,222,383,177,178,179,411,184,188,189,190,191,193,194,195,196,197,198,199,200,201,402,320,203,204,205,206,258,259,260,261,327,209,219,226,227,232,233,234,240,244,247,248,249,251,256,257,266,254,255,270,272,278,291,293,300,304,308,309,310,311,313,314,319,321,323,324,328,330,331,332,334,337,338,340,344,348,350,351,352,
353,354,355,356,357,358,361,363,364,368,369,370,373,374,375,378,380,381,388,389,403,410,412,429,413,414,415,416,417,418,430,423,424,425,426,427,431,117,439,441,448];var lk={qj:0,bj:1,hj:2,ij:4,nj:8,jj:16,kj:32,pj:64,oj:128,dj:256,fj:512,mj:1024,ej:2048,gj:4096,cj:8192,lj:16384};function mk(a){I.call(this,a)}
u(mk,I);function nk(a){I.call(this,a)}
u(nk,I);nk.prototype.setVideoId=function(a){return Wd(this,1,ok,a)};
nk.prototype.getPlaylistId=function(){return ee(this,2===Xd(this,ok)?2:-1)};
var ok=[1,2];function pk(a){I.call(this,a,-1,qk)}
u(pk,I);var qk=[3];var rk=new $i("webPlayerShareEntityServiceEndpoint");var sk=new $i("playlistEditEndpoint");var tk=new $i("modifyChannelNotificationPreferenceEndpoint");var uk=new $i("unsubscribeEndpoint");var vk=new $i("subscribeEndpoint");function wk(a,b){1<b.length?a[b[0]]=b[1]:1===b.length&&Object.assign(a,b[0])}
;var xk=z.window,yk,zk,Ak=(null==xk?void 0:null==(yk=xk.yt)?void 0:yk.config_)||(null==xk?void 0:null==(zk=xk.ytcfg)?void 0:zk.data_)||{};A("yt.config_",Ak);function Bk(){wk(Ak,arguments)}
function L(a,b){return a in Ak?Ak[a]:b}
function Ck(){var a=Ak.EXPERIMENT_FLAGS;return a?a.web_disable_gel_stp_ecatcher_killswitch:void 0}
;function M(a){a=Dk(a);return"string"===typeof a&&"false"===a?!1:!!a}
function Ek(a,b){a=Dk(a);return void 0===a&&void 0!==b?b:Number(a||0)}
function Fk(){return L("EXPERIMENTS_TOKEN","")}
function Dk(a){var b=L("EXPERIMENTS_FORCED_FLAGS",{});return void 0!==b[a]?b[a]:L("EXPERIMENT_FLAGS",{})[a]}
function Gk(){var a=[],b=L("EXPERIMENTS_FORCED_FLAGS",{});for(c in b)a.push({key:c,value:String(b[c])});var c=L("EXPERIMENT_FLAGS",{});for(var d in c)d.startsWith("force_")&&void 0===b[d]&&a.push({key:d,value:String(c[d])});return a}
;var Hk=[];function Ik(a){Hk.forEach(function(b){return b(a)})}
function Jk(a){return a&&window.yterr?function(){try{return a.apply(this,arguments)}catch(b){Kk(b)}}:a}
function Kk(a,b,c,d){var e=B("yt.logging.errors.log");e?e(a,"ERROR",b,c,d):(e=L("ERRORS",[]),e.push([a,"ERROR",b,c,d]),Bk("ERRORS",e));Ik(a)}
function Lk(a,b,c,d){var e=B("yt.logging.errors.log");e?e(a,"WARNING",b,c,d):(e=L("ERRORS",[]),e.push([a,"WARNING",b,c,d]),Bk("ERRORS",e))}
;function Mk(){var a=Nk;B("yt.ads.biscotti.getId_")||A("yt.ads.biscotti.getId_",a)}
function Ok(a){A("yt.ads.biscotti.lastId_",a)}
;var Pk=/^[\w.]*$/,Qk={q:!0,search_query:!0};function Rk(a,b){b=a.split(b);for(var c={},d=0,e=b.length;d<e;d++){var f=b[d].split("=");if(1==f.length&&f[0]||2==f.length)try{var g=Sk(f[0]||""),h=Sk(f[1]||"");g in c?Array.isArray(c[g])?nb(c[g],h):c[g]=[c[g],h]:c[g]=h}catch(r){var k=r,m=f[0],q=String(Rk);k.args=[{key:m,value:f[1],query:a,method:Tk==q?"unchanged":q}];Qk.hasOwnProperty(m)||Lk(k)}}return c}
var Tk=String(Rk);function Uk(a){var b=[];ob(a,function(c,d){var e=encodeURIComponent(String(d)),f;Array.isArray(c)?f=c:f=[c];fb(f,function(g){""==g?b.push(e):b.push(e+"="+encodeURIComponent(String(g)))})});
return b.join("&")}
function Vk(a){"?"==a.charAt(0)&&(a=a.substr(1));return Rk(a,"&")}
function Wk(a){return-1!=a.indexOf("?")?(a=(a||"").split("#")[0],a=a.split("?",2),Vk(1<a.length?a[1]:a[0])):{}}
function Xk(a,b,c){var d=a.split("#",2);a=d[0];d=1<d.length?"#"+d[1]:"";var e=a.split("?",2);a=e[0];e=Vk(e[1]||"");for(var f in b)!c&&null!==e&&f in e||(e[f]=b[f]);return vc(a,e)+d}
function Yk(a){if(!b)var b=window.location.href;var c=nc(1,a),d=oc(a);c&&d?(a=a.match(lc),b=b.match(lc),a=a[3]==b[3]&&a[1]==b[1]&&a[4]==b[4]):a=d?oc(b)==d&&(Number(nc(4,b))||null)==(Number(nc(4,a))||null):!0;return a}
function Sk(a){return a&&a.match(Pk)?a:decodeURIComponent(a.replace(/\+/g," "))}
;function Zk(a){var b=$k;a=void 0===a?B("yt.ads.biscotti.lastId_")||"":a;var c=Object,d=c.assign,e={};e.dt=Rh;e.flash="0";a:{try{var f=b.i.top.location.href}catch(fa){f=2;break a}f=f?f===b.j.location.href?0:1:2}e=(e.frm=f,e);try{e.u_tz=-(new Date).getTimezoneOffset();var g=void 0===g?Dh:g;try{var h=g.history.length}catch(fa){h=0}e.u_his=h;var k;e.u_h=null==(k=Dh.screen)?void 0:k.height;var m;e.u_w=null==(m=Dh.screen)?void 0:m.width;var q;e.u_ah=null==(q=Dh.screen)?void 0:q.availHeight;var r;e.u_aw=
null==(r=Dh.screen)?void 0:r.availWidth;var w;e.u_cd=null==(w=Dh.screen)?void 0:w.colorDepth}catch(fa){}h=b.i;try{var t=h.screenX;var y=h.screenY}catch(fa){}try{var E=h.outerWidth;var F=h.outerHeight}catch(fa){}try{var O=h.innerWidth;var N=h.innerHeight}catch(fa){}try{var Q=h.screenLeft;var ca=h.screenTop}catch(fa){}try{O=h.innerWidth,N=h.innerHeight}catch(fa){}try{var U=h.screen.availWidth;var lb=h.screen.availTop}catch(fa){}t=[Q,ca,t,y,U,lb,E,F,O,N];try{var Xa=(b.i.top||window).document,na="CSS1Compat"==
Xa.compatMode?Xa.documentElement:Xa.body;var H=(new jf(na.clientWidth,na.clientHeight)).round()}catch(fa){H=new jf(-12245933,-12245933)}Xa=H;H={};var la=void 0===la?z:la;na=new Yh;la.SVGElement&&la.document.createElementNS&&na.set(0);y=Lh();y["allow-top-navigation-by-user-activation"]&&na.set(1);y["allow-popups-to-escape-sandbox"]&&na.set(2);la.crypto&&la.crypto.subtle&&na.set(3);la.TextDecoder&&la.TextEncoder&&na.set(4);la=Zh(na);H.bc=la;H.bih=Xa.height;H.biw=Xa.width;H.brdim=t.join();b=b.j;b=(H.vis=
b.prerendering?3:{visible:1,hidden:2,prerender:3,preview:4,unloaded:5}[b.visibilityState||b.webkitVisibilityState||b.mozVisibilityState||""]||0,H.wgl=!!Dh.WebGLRenderingContext,H);c=d.call(c,e,b);c.ca_type="image";a&&(c.bid=a);return c}
var $k=new function(){var a=window.document;this.i=window;this.j=a};
A("yt.ads_.signals_.getAdSignalsString",function(a){return Uk(Zk(a))});Date.now();var al="XMLHttpRequest"in z?function(){return new XMLHttpRequest}:null;
function bl(){if(!al)return null;var a=al();return"open"in a?a:null}
function cl(a){switch(a&&"status"in a?a.status:-1){case 200:case 201:case 202:case 203:case 204:case 205:case 206:case 304:return!0;default:return!1}}
;function dl(a,b){"function"===typeof a&&(a=Jk(a));return window.setTimeout(a,b)}
;var el={Authorization:"AUTHORIZATION","X-Goog-EOM-Visitor-Id":"EOM_VISITOR_DATA","X-Goog-Visitor-Id":"SANDBOXED_VISITOR_ID","X-Youtube-Domain-Admin-State":"DOMAIN_ADMIN_STATE","X-Youtube-Chrome-Connected":"CHROME_CONNECTED_HEADER","X-YouTube-Client-Name":"INNERTUBE_CONTEXT_CLIENT_NAME","X-YouTube-Client-Version":"INNERTUBE_CONTEXT_CLIENT_VERSION","X-YouTube-Delegation-Context":"INNERTUBE_CONTEXT_SERIALIZED_DELEGATION_CONTEXT","X-YouTube-Device":"DEVICE","X-Youtube-Identity-Token":"ID_TOKEN","X-YouTube-Page-CL":"PAGE_CL",
"X-YouTube-Page-Label":"PAGE_BUILD_LABEL","X-YouTube-Variants-Checksum":"VARIANTS_CHECKSUM"},fl="app debugcss debugjs expflag force_ad_params force_ad_encrypted force_viral_ad_response_params forced_experiments innertube_snapshots innertube_goldens internalcountrycode internalipoverride absolute_experiments conditional_experiments sbb sr_bns_address".split(" ").concat(ia(Sh)),gl=!1;
function hl(a,b){b=void 0===b?{}:b;var c=Yk(a),d=M("web_ajax_ignore_global_headers_if_set"),e;for(e in el){var f=L(el[e]);"X-Goog-Visitor-Id"!==e||f||(f=L("VISITOR_DATA"));!f||!c&&oc(a)||d&&void 0!==b[e]||(b[e]=f)}"X-Goog-EOM-Visitor-Id"in b&&"X-Goog-Visitor-Id"in b&&delete b["X-Goog-Visitor-Id"];if(c||!oc(a))b["X-YouTube-Utc-Offset"]=String(-(new Date).getTimezoneOffset());if(c||!oc(a)){try{var g=(new Intl.DateTimeFormat).resolvedOptions().timeZone}catch(h){}g&&(b["X-YouTube-Time-Zone"]=g)}document.location.hostname.endsWith("youtubeeducation.com")||
!c&&oc(a)||(b["X-YouTube-Ad-Signals"]=Uk(Zk()));return b}
function il(a){var b=window.location.search,c=oc(a);M("debug_handle_relative_url_for_query_forward_killswitch")||!c&&Yk(a)&&(c=document.location.hostname);var d=mc(nc(5,a));d=(c=c&&(c.endsWith("youtube.com")||c.endsWith("youtube-nocookie.com")))&&d&&d.startsWith("/api/");if(!c||d)return a;var e=Vk(b),f={};fb(fl,function(g){e[g]&&(f[g]=e[g])});
return Xk(a,f||{},!1)}
function jl(a,b){var c=b.format||"JSON";a=kl(a,b);var d=ll(a,b),e=!1,f=ml(a,function(k){if(!e){e=!0;h&&window.clearTimeout(h);var m=cl(k),q=null,r=400<=k.status&&500>k.status,w=500<=k.status&&600>k.status;if(m||r||w)q=nl(a,c,k,b.convertToSafeHtml);if(m)a:if(k&&204==k.status)m=!0;else{switch(c){case "XML":m=0==parseInt(q&&q.return_code,10);break a;case "RAW":m=!0;break a}m=!!q}q=q||{};r=b.context||z;m?b.onSuccess&&b.onSuccess.call(r,k,q):b.onError&&b.onError.call(r,k,q);b.onFinish&&b.onFinish.call(r,
k,q)}},b.method,d,b.headers,b.responseType,b.withCredentials);
d=b.timeout||0;if(b.onTimeout&&0<d){var g=b.onTimeout;var h=dl(function(){e||(e=!0,f.abort(),window.clearTimeout(h),g.call(b.context||z,f))},d)}return f}
function kl(a,b){b.includeDomain&&(a=document.location.protocol+"//"+document.location.hostname+(document.location.port?":"+document.location.port:"")+a);var c=L("XSRF_FIELD_NAME");if(b=b.urlParams)b[c]&&delete b[c],a=Xk(a,b||{},!0);return a}
function ll(a,b){var c=L("XSRF_FIELD_NAME"),d=L("XSRF_TOKEN"),e=b.postBody||"",f=b.postParams,g=L("XSRF_FIELD_NAME"),h;b.headers&&(h=b.headers["Content-Type"]);b.excludeXsrf||oc(a)&&!b.withCredentials&&oc(a)!=document.location.hostname||"POST"!=b.method||h&&"application/x-www-form-urlencoded"!=h||b.postParams&&b.postParams[g]||(f||(f={}),f[c]=d);(M("ajax_parse_query_data_only_when_filled")&&f&&0<Object.keys(f).length||f)&&"string"===typeof e&&(e=Vk(e),yb(e,f),e=b.postBodyFormat&&"JSON"==b.postBodyFormat?
JSON.stringify(e):tc(e));f=e||f&&!rb(f);!gl&&f&&"POST"!=b.method&&(gl=!0,Kk(Error("AJAX request with postData should use POST")));return e}
function nl(a,b,c,d){var e=null;switch(b){case "JSON":try{var f=c.responseText}catch(g){throw d=Error("Error reading responseText"),d.params=a,Lk(d),g;}a=c.getResponseHeader("Content-Type")||"";f&&0<=a.indexOf("json")&&(")]}'\n"===f.substring(0,5)&&(f=f.substring(5)),e=JSON.parse(f));break;case "XML":if(a=(a=c.responseXML)?ol(a):null)e={},fb(a.getElementsByTagName("*"),function(g){e[g.tagName]=pl(g)})}d&&ql(e);
return e}
function ql(a){if(Qa(a))for(var b in a){var c;(c="html_content"==b)||(c=b.length-5,c=0<=c&&b.indexOf("_html",c)==c);if(c){c=b;Db("HTML that is escaped and sanitized server-side and passed through yt.net.ajax");var d=a[b],e=Ab();d=e?e.createHTML(d):d;a[c]=new ec(d)}else ql(a[b])}}
function ol(a){return a?(a=("responseXML"in a?a.responseXML:a).getElementsByTagName("root"))&&0<a.length?a[0]:null:null}
function pl(a){var b="";fb(a.childNodes,function(c){b+=c.nodeValue});
return b}
function ml(a,b,c,d,e,f,g){function h(){4==(k&&"readyState"in k?k.readyState:0)&&b&&Jk(b)(k)}
c=void 0===c?"GET":c;d=void 0===d?"":d;var k=bl();if(!k)return null;"onloadend"in k?k.addEventListener("loadend",h,!1):k.onreadystatechange=h;M("debug_forward_web_query_parameters")&&(a=il(a));k.open(c,a,!0);f&&(k.responseType=f);g&&(k.withCredentials=!0);c="POST"==c&&(void 0===window.FormData||!(d instanceof FormData));if(e=hl(a,e))for(var m in e)k.setRequestHeader(m,e[m]),"content-type"==m.toLowerCase()&&(c=!1);c&&k.setRequestHeader("Content-Type","application/x-www-form-urlencoded");k.send(d);
return k}
;function rl(a){var b=this;this.j=void 0;this.i=!1;a.addEventListener("beforeinstallprompt",function(c){c.preventDefault();b.j=c});
a.addEventListener("appinstalled",function(){b.i=!0},{once:!0})}
function sl(){if(!z.matchMedia)return"WEB_DISPLAY_MODE_UNKNOWN";try{return z.matchMedia("(display-mode: standalone)").matches?"WEB_DISPLAY_MODE_STANDALONE":z.matchMedia("(display-mode: minimal-ui)").matches?"WEB_DISPLAY_MODE_MINIMAL_UI":z.matchMedia("(display-mode: fullscreen)").matches?"WEB_DISPLAY_MODE_FULLSCREEN":z.matchMedia("(display-mode: browser)").matches?"WEB_DISPLAY_MODE_BROWSER":"WEB_DISPLAY_MODE_UNKNOWN"}catch(a){return"WEB_DISPLAY_MODE_UNKNOWN"}}
;function tl(a,b,c,d,e){qg.set(""+a,b,{hb:c,path:"/",domain:void 0===d?"youtube.com":d,secure:void 0===e?!1:e})}
function ul(a,b,c){qg.remove(""+a,void 0===b?"/":b,void 0===c?"youtube.com":c)}
function vl(){if(!qg.isEnabled())return!1;if(!qg.isEmpty())return!0;qg.set("TESTCOOKIESENABLED","1",{hb:60});if("1"!==qg.get("TESTCOOKIESENABLED"))return!1;qg.remove("TESTCOOKIESENABLED");return!0}
;var wl=B("ytglobal.prefsUserPrefsPrefs_")||{};A("ytglobal.prefsUserPrefsPrefs_",wl);function xl(){this.i=L("ALT_PREF_COOKIE_NAME","PREF");this.j=L("ALT_PREF_COOKIE_DOMAIN","youtube.com");var a=qg.get(""+this.i,void 0);if(a){a=decodeURIComponent(a).split("&");for(var b=0;b<a.length;b++){var c=a[b].split("="),d=c[0];(c=c[1])&&(wl[d]=c.toString())}}}
xl.prototype.get=function(a,b){yl(a);zl(a);a=void 0!==wl[a]?wl[a].toString():null;return null!=a?a:b?b:""};
xl.prototype.set=function(a,b){yl(a);zl(a);if(null==b)throw Error("ExpectedNotNull");wl[a]=b.toString()};
function Al(a){return!!((Bl("f"+(Math.floor(a/31)+1))||0)&1<<a%31)}
xl.prototype.remove=function(a){yl(a);zl(a);delete wl[a]};
xl.prototype.clear=function(){for(var a in wl)delete wl[a]};
function zl(a){if(/^f([1-9][0-9]*)$/.test(a))throw Error("ExpectedRegexMatch: "+a);}
function yl(a){if(!/^\w+$/.test(a))throw Error("ExpectedRegexMismatch: "+a);}
function Bl(a){a=void 0!==wl[a]?wl[a].toString():null;return null!=a&&/^[A-Fa-f0-9]+$/.test(a)?parseInt(a,16):null}
Na(xl);var Cl={bluetooth:"CONN_DISCO",cellular:"CONN_CELLULAR_UNKNOWN",ethernet:"CONN_WIFI",none:"CONN_NONE",wifi:"CONN_WIFI",wimax:"CONN_CELLULAR_4G",other:"CONN_UNKNOWN",unknown:"CONN_UNKNOWN","slow-2g":"CONN_CELLULAR_2G","2g":"CONN_CELLULAR_2G","3g":"CONN_CELLULAR_3G","4g":"CONN_CELLULAR_4G"},Dl={CONN_DEFAULT:0,CONN_UNKNOWN:1,CONN_NONE:2,CONN_WIFI:3,CONN_CELLULAR_2G:4,CONN_CELLULAR_3G:5,CONN_CELLULAR_4G:6,CONN_CELLULAR_UNKNOWN:7,CONN_DISCO:8,CONN_CELLULAR_5G:9,CONN_WIFI_METERED:10,CONN_CELLULAR_5G_SA:11,
CONN_CELLULAR_5G_NSA:12,CONN_INVALID:31},El={EFFECTIVE_CONNECTION_TYPE_UNKNOWN:0,EFFECTIVE_CONNECTION_TYPE_OFFLINE:1,EFFECTIVE_CONNECTION_TYPE_SLOW_2G:2,EFFECTIVE_CONNECTION_TYPE_2G:3,EFFECTIVE_CONNECTION_TYPE_3G:4,EFFECTIVE_CONNECTION_TYPE_4G:5},Fl={"slow-2g":"EFFECTIVE_CONNECTION_TYPE_SLOW_2G","2g":"EFFECTIVE_CONNECTION_TYPE_2G","3g":"EFFECTIVE_CONNECTION_TYPE_3G","4g":"EFFECTIVE_CONNECTION_TYPE_4G"};function Gl(){var a=z.navigator;return a?a.connection:void 0}
function Hl(){var a=Gl();if(a){var b=Cl[a.type||"unknown"]||"CONN_UNKNOWN";a=Cl[a.effectiveType||"unknown"]||"CONN_UNKNOWN";"CONN_CELLULAR_UNKNOWN"===b&&"CONN_UNKNOWN"!==a&&(b=a);if("CONN_UNKNOWN"!==b)return b;if("CONN_UNKNOWN"!==a)return a}}
function Il(){var a=Gl();if(null!=a&&a.effectiveType)return Fl.hasOwnProperty(a.effectiveType)?Fl[a.effectiveType]:"EFFECTIVE_CONNECTION_TYPE_UNKNOWN"}
;function Jl(){}
function Kl(a,b){return Ll(a,0,b)}
Jl.prototype.V=function(a,b){return Ll(a,1,b)};
function Ml(a,b){Ll(a,2,b)}
function Nl(a){var b=B("yt.scheduler.instance.addImmediateJob");b?b(a):a()}
;function Ol(){Jl.apply(this,arguments)}
u(Ol,Jl);function Pl(){Ol.i||(Ol.i=new Ol);return Ol.i}
function Ll(a,b,c){void 0!==c&&Number.isNaN(Number(c))&&(c=void 0);var d=B("yt.scheduler.instance.addJob");return d?d(a,b,c):void 0===c?(a(),NaN):dl(a,c||0)}
Ol.prototype.ga=function(a){if(void 0===a||!Number.isNaN(Number(a))){var b=B("yt.scheduler.instance.cancelJob");b?b(a):window.clearTimeout(a)}};
Ol.prototype.start=function(){var a=B("yt.scheduler.instance.start");a&&a()};
Ol.prototype.pause=function(){var a=B("yt.scheduler.instance.pause");a&&a()};var Xh=Pl();function P(a){var b=Ja.apply(1,arguments);var c=Error.call(this,a);this.message=c.message;"stack"in c&&(this.stack=c.stack);this.args=[].concat(ia(b))}
u(P,Error);function Ql(){try{return Rl(),!0}catch(a){return!1}}
function Rl(a){if(void 0!==L("DATASYNC_ID"))return L("DATASYNC_ID");throw new P("Datasync ID not set",void 0===a?"unknown":a);}
;var Sl=$c||ad;function Tl(a){var b=Tb();return b?0<=b.toLowerCase().indexOf(a):!1}
;function Ul(a){var b=new Di;(b=b.isAvailable()?a?new Ji(b,a):b:null)||(a=new Ei(a||"UserDataSharedStore"),b=a.isAvailable()?a:null);this.i=(a=b)?new zi(a):null;this.j=document.domain||window.location.hostname}
Ul.prototype.set=function(a,b,c,d){c=c||31104E3;this.remove(a);if(this.i)try{this.i.set(a,b,Date.now()+1E3*c);return}catch(f){}var e="";if(d)try{e=escape(yg(b))}catch(f){return}else e=escape(b);tl(a,e,c,this.j)};
Ul.prototype.get=function(a,b){var c=void 0,d=!this.i;if(!d)try{c=this.i.get(a)}catch(e){d=!0}if(d&&(c=qg.get(""+a,void 0))&&(c=unescape(c),b))try{c=JSON.parse(c)}catch(e){this.remove(a),c=void 0}return c};
Ul.prototype.remove=function(a){this.i&&this.i.remove(a);ul(a,"/",this.j)};var Vl=function(){var a;return function(){a||(a=new Ul("ytidb"));return a}}();
function Wl(){var a;return null==(a=Vl())?void 0:a.get("LAST_RESULT_ENTRY_KEY",!0)}
;var Xl=[],Yl,Zl=!1;function $l(){var a={};for(Yl=new am(void 0===a.handleError?bm:a.handleError,void 0===a.logEvent?cm:a.logEvent);0<Xl.length;)switch(a=Xl.shift(),a.type){case "ERROR":Yl.handleError(a.payload);break;case "EVENT":Yl.logEvent(a.eventType,a.payload)}}
function dm(a){Zl||(Yl?Yl.handleError(a):(Xl.push({type:"ERROR",payload:a}),10<Xl.length&&Xl.shift()))}
function em(a,b){Zl||(Yl?Yl.logEvent(a,b):(Xl.push({type:"EVENT",eventType:a,payload:b}),10<Xl.length&&Xl.shift()))}
;function fm(a){if(0<=a.indexOf(":"))throw Error("Database name cannot contain ':'");}
function gm(a){return a.substr(0,a.indexOf(":"))||a}
;var hm={},im=(hm.AUTH_INVALID="No user identifier specified.",hm.EXPLICIT_ABORT="Transaction was explicitly aborted.",hm.IDB_NOT_SUPPORTED="IndexedDB is not supported.",hm.MISSING_INDEX="Index not created.",hm.MISSING_OBJECT_STORES="Object stores not created.",hm.DB_DELETED_BY_MISSING_OBJECT_STORES="Database is deleted because expected object stores were not created.",hm.DB_REOPENED_BY_MISSING_OBJECT_STORES="Database is reopened because expected object stores were not created.",hm.UNKNOWN_ABORT="Transaction was aborted for unknown reasons.",
hm.QUOTA_EXCEEDED="The current transaction exceeded its quota limitations.",hm.QUOTA_MAYBE_EXCEEDED="The current transaction may have failed because of exceeding quota limitations.",hm.EXECUTE_TRANSACTION_ON_CLOSED_DB="Can't start a transaction on a closed database",hm.INCOMPATIBLE_DB_VERSION="The binary is incompatible with the database version",hm),jm={},km=(jm.AUTH_INVALID="ERROR",jm.EXECUTE_TRANSACTION_ON_CLOSED_DB="WARNING",jm.EXPLICIT_ABORT="IGNORED",jm.IDB_NOT_SUPPORTED="ERROR",jm.MISSING_INDEX=
"WARNING",jm.MISSING_OBJECT_STORES="ERROR",jm.DB_DELETED_BY_MISSING_OBJECT_STORES="WARNING",jm.DB_REOPENED_BY_MISSING_OBJECT_STORES="WARNING",jm.QUOTA_EXCEEDED="WARNING",jm.QUOTA_MAYBE_EXCEEDED="WARNING",jm.UNKNOWN_ABORT="WARNING",jm.INCOMPATIBLE_DB_VERSION="WARNING",jm),lm={},mm=(lm.AUTH_INVALID=!1,lm.EXECUTE_TRANSACTION_ON_CLOSED_DB=!1,lm.EXPLICIT_ABORT=!1,lm.IDB_NOT_SUPPORTED=!1,lm.MISSING_INDEX=!1,lm.MISSING_OBJECT_STORES=!1,lm.DB_DELETED_BY_MISSING_OBJECT_STORES=!1,lm.DB_REOPENED_BY_MISSING_OBJECT_STORES=
!1,lm.QUOTA_EXCEEDED=!1,lm.QUOTA_MAYBE_EXCEEDED=!0,lm.UNKNOWN_ABORT=!0,lm.INCOMPATIBLE_DB_VERSION=!1,lm);function nm(a,b,c,d,e){b=void 0===b?{}:b;c=void 0===c?im[a]:c;d=void 0===d?km[a]:d;e=void 0===e?mm[a]:e;P.call(this,c,Object.assign({},{name:"YtIdbKnownError",isSw:void 0===self.document,isIframe:self!==self.top,type:a},b));this.type=a;this.message=c;this.level=d;this.i=e;Object.setPrototypeOf(this,nm.prototype)}
u(nm,P);function om(a,b){nm.call(this,"MISSING_OBJECT_STORES",{expectedObjectStores:b,foundObjectStores:a},im.MISSING_OBJECT_STORES);Object.setPrototypeOf(this,om.prototype)}
u(om,nm);function pm(a,b){var c=Error.call(this);this.message=c.message;"stack"in c&&(this.stack=c.stack);this.index=a;this.objectStore=b;Object.setPrototypeOf(this,pm.prototype)}
u(pm,Error);var qm=["The database connection is closing","Can't start a transaction on a closed database","A mutation operation was attempted on a database that did not allow mutations"];
function rm(a,b,c,d){b=gm(b);var e=a instanceof Error?a:Error("Unexpected error: "+a);if(e instanceof nm)return e;a={objectStoreNames:c,dbName:b,dbVersion:d};if("QuotaExceededError"===e.name)return new nm("QUOTA_EXCEEDED",a);if(bd&&"UnknownError"===e.name)return new nm("QUOTA_MAYBE_EXCEEDED",a);if(e instanceof pm)return new nm("MISSING_INDEX",Object.assign({},a,{objectStore:e.objectStore,index:e.index}));if("InvalidStateError"===e.name&&qm.some(function(f){return e.message.includes(f)}))return new nm("EXECUTE_TRANSACTION_ON_CLOSED_DB",
a);
if("AbortError"===e.name)return new nm("UNKNOWN_ABORT",a,e.message);e.args=[Object.assign({},a,{name:"IdbError",lc:e.name})];e.level="WARNING";return e}
function sm(a,b,c){var d=Wl();return new nm("IDB_NOT_SUPPORTED",{context:{caller:a,publicName:b,version:c,hasSucceededOnce:null==d?void 0:d.hasSucceededOnce}})}
;function tm(a){if(!a)throw Error();throw a;}
function um(a){return a}
function vm(a){this.i=a}
function wm(a){function b(e){if("PENDING"===d.state.status){d.state={status:"REJECTED",reason:e};e=p(d.onRejected);for(var f=e.next();!f.done;f=e.next())f=f.value,f()}}
function c(e){if("PENDING"===d.state.status){d.state={status:"FULFILLED",value:e};e=p(d.i);for(var f=e.next();!f.done;f=e.next())f=f.value,f()}}
var d=this;this.state={status:"PENDING"};this.i=[];this.onRejected=[];a=a.i;try{a(c,b)}catch(e){b(e)}}
wm.all=function(a){return new wm(new vm(function(b,c){var d=[],e=a.length;0===e&&b(d);for(var f={Ba:0};f.Ba<a.length;f={Ba:f.Ba},++f.Ba)wm.resolve(a[f.Ba]).then(function(g){return function(h){d[g.Ba]=h;e--;0===e&&b(d)}}(f)).catch(function(g){c(g)})}))};
wm.resolve=function(a){return new wm(new vm(function(b,c){a instanceof wm?a.then(b,c):b(a)}))};
wm.reject=function(a){return new wm(new vm(function(b,c){c(a)}))};
wm.prototype.then=function(a,b){var c=this,d=null!=a?a:um,e=null!=b?b:tm;return new wm(new vm(function(f,g){"PENDING"===c.state.status?(c.i.push(function(){xm(c,c,d,f,g)}),c.onRejected.push(function(){ym(c,c,e,f,g)})):"FULFILLED"===c.state.status?xm(c,c,d,f,g):"REJECTED"===c.state.status&&ym(c,c,e,f,g)}))};
wm.prototype.catch=function(a){return this.then(void 0,a)};
function xm(a,b,c,d,e){try{if("FULFILLED"!==a.state.status)throw Error("calling handleResolve before the promise is fulfilled.");var f=c(a.state.value);f instanceof wm?zm(a,b,f,d,e):d(f)}catch(g){e(g)}}
function ym(a,b,c,d,e){try{if("REJECTED"!==a.state.status)throw Error("calling handleReject before the promise is rejected.");var f=c(a.state.reason);f instanceof wm?zm(a,b,f,d,e):d(f)}catch(g){e(g)}}
function zm(a,b,c,d,e){b===c?e(new TypeError("Circular promise chain detected.")):c.then(function(f){f instanceof wm?zm(a,b,f,d,e):d(f)},function(f){e(f)})}
;function Am(a,b,c){function d(){c(a.error);f()}
function e(){b(a.result);f()}
function f(){try{a.removeEventListener("success",e),a.removeEventListener("error",d)}catch(g){}}
a.addEventListener("success",e);a.addEventListener("error",d)}
function Bm(a){return new Promise(function(b,c){Am(a,b,c)})}
function Cm(a){return new wm(new vm(function(b,c){Am(a,b,c)}))}
;function Dm(a,b){return new wm(new vm(function(c,d){function e(){var f=a?b(a):null;f?f.then(function(g){a=g;e()},d):c()}
e()}))}
;var Em=window,R=Em.ytcsi&&Em.ytcsi.now?Em.ytcsi.now:Em.performance&&Em.performance.timing&&Em.performance.now&&Em.performance.timing.navigationStart?function(){return Em.performance.timing.navigationStart+Em.performance.now()}:function(){return(new Date).getTime()};function Fm(a,b){this.i=a;this.options=b;this.transactionCount=0;this.l=Math.round(R());this.j=!1}
l=Fm.prototype;l.add=function(a,b,c){return Gm(this,[a],{mode:"readwrite",U:!0},function(d){return d.objectStore(a).add(b,c)})};
l.clear=function(a){return Gm(this,[a],{mode:"readwrite",U:!0},function(b){return b.objectStore(a).clear()})};
l.close=function(){this.i.close();var a;(null==(a=this.options)?0:a.closed)&&this.options.closed()};
l.count=function(a,b){return Gm(this,[a],{mode:"readonly",U:!0},function(c){return c.objectStore(a).count(b)})};
function Hm(a,b,c){a=a.i.createObjectStore(b,c);return new Im(a)}
l.delete=function(a,b){return Gm(this,[a],{mode:"readwrite",U:!0},function(c){return c.objectStore(a).delete(b)})};
l.get=function(a,b){return Gm(this,[a],{mode:"readonly",U:!0},function(c){return c.objectStore(a).get(b)})};
function Jm(a,b){return Gm(a,["LogsRequestsStore"],{mode:"readwrite",U:!0},function(c){c=c.objectStore("LogsRequestsStore");return Cm(c.i.put(b,void 0))})}
l.objectStoreNames=function(){return Array.from(this.i.objectStoreNames)};
function Gm(a,b,c,d){var e,f,g,h,k,m,q,r,w,t,y,E;return x(function(F){switch(F.i){case 1:var O={mode:"readonly",U:!1,tag:"IDB_TRANSACTION_TAG_UNKNOWN"};"string"===typeof c?O.mode=c:Object.assign(O,c);e=O;a.transactionCount++;f=e.U?3:1;g=0;case 2:if(h){F.B(3);break}g++;k=Math.round(R());ya(F,4);m=a.i.transaction(b,e.mode);O=new Km(m);O=Lm(O,d);return v(F,O,6);case 6:return q=F.j,r=Math.round(R()),Mm(a,k,r,g,void 0,b.join(),e),F.return(q);case 4:w=Aa(F);t=Math.round(R());y=rm(w,a.i.name,b.join(),a.i.version);
if((E=y instanceof nm&&!y.i)||g>=f)Mm(a,k,t,g,y,b.join(),e),h=y;F.B(2);break;case 3:return F.return(Promise.reject(h))}})}
function Mm(a,b,c,d,e,f,g){b=c-b;e?(e instanceof nm&&("QUOTA_EXCEEDED"===e.type||"QUOTA_MAYBE_EXCEEDED"===e.type)&&em("QUOTA_EXCEEDED",{dbName:gm(a.i.name),objectStoreNames:f,transactionCount:a.transactionCount,transactionMode:g.mode}),e instanceof nm&&"UNKNOWN_ABORT"===e.type&&(c-=a.l,0>c&&c>=Math.pow(2,31)&&(c=0),em("TRANSACTION_UNEXPECTEDLY_ABORTED",{objectStoreNames:f,transactionDuration:b,transactionCount:a.transactionCount,dbDuration:c}),a.j=!0),Nm(a,!1,d,f,b,g.tag),dm(e)):Nm(a,!0,d,f,b,g.tag)}
function Nm(a,b,c,d,e,f){em("TRANSACTION_ENDED",{objectStoreNames:d,connectionHasUnknownAbortedTransaction:a.j,duration:e,isSuccessful:b,tryCount:c,tag:void 0===f?"IDB_TRANSACTION_TAG_UNKNOWN":f})}
l.getName=function(){return this.i.name};
function Im(a){this.i=a}
l=Im.prototype;l.add=function(a,b){return Cm(this.i.add(a,b))};
l.autoIncrement=function(){return this.i.autoIncrement};
l.clear=function(){return Cm(this.i.clear()).then(function(){})};
l.count=function(a){return Cm(this.i.count(a))};
function Om(a,b){return Pm(a,{query:b},function(c){return c.delete().then(function(){return c.continue()})}).then(function(){})}
l.delete=function(a){return a instanceof IDBKeyRange?Om(this,a):Cm(this.i.delete(a))};
l.get=function(a){return Cm(this.i.get(a))};
l.index=function(a){try{return new Qm(this.i.index(a))}catch(b){if(b instanceof Error&&"NotFoundError"===b.name)throw new pm(a,this.i.name);throw b;}};
l.getName=function(){return this.i.name};
l.keyPath=function(){return this.i.keyPath};
function Pm(a,b,c){a=a.i.openCursor(b.query,b.direction);return Rm(a).then(function(d){return Dm(d,c)})}
function Km(a){var b=this;this.i=a;this.l=new Map;this.j=!1;this.done=new Promise(function(c,d){b.i.addEventListener("complete",function(){c()});
b.i.addEventListener("error",function(e){e.currentTarget===e.target&&d(b.i.error)});
b.i.addEventListener("abort",function(){var e=b.i.error;if(e)d(e);else if(!b.j){e=nm;for(var f=b.i.objectStoreNames,g=[],h=0;h<f.length;h++){var k=f.item(h);if(null===k)throw Error("Invariant: item in DOMStringList is null");g.push(k)}e=new e("UNKNOWN_ABORT",{objectStoreNames:g.join(),dbName:b.i.db.name,mode:b.i.mode});d(e)}})})}
function Lm(a,b){var c=new Promise(function(d,e){try{b(a).then(function(f){d(f)}).catch(e)}catch(f){e(f),a.abort()}});
return Promise.all([c,a.done]).then(function(d){return p(d).next().value})}
Km.prototype.abort=function(){this.i.abort();this.j=!0;throw new nm("EXPLICIT_ABORT");};
Km.prototype.objectStore=function(a){a=this.i.objectStore(a);var b=this.l.get(a);b||(b=new Im(a),this.l.set(a,b));return b};
function Qm(a){this.i=a}
l=Qm.prototype;l.count=function(a){return Cm(this.i.count(a))};
l.delete=function(a){return Sm(this,{query:a},function(b){return b.delete().then(function(){return b.continue()})})};
l.get=function(a){return Cm(this.i.get(a))};
l.getKey=function(a){return Cm(this.i.getKey(a))};
l.keyPath=function(){return this.i.keyPath};
l.unique=function(){return this.i.unique};
function Sm(a,b,c){a=a.i.openCursor(void 0===b.query?null:b.query,void 0===b.direction?"next":b.direction);return Rm(a).then(function(d){return Dm(d,c)})}
function Tm(a,b){this.request=a;this.cursor=b}
function Rm(a){return Cm(a).then(function(b){return b?new Tm(a,b):null})}
l=Tm.prototype;l.advance=function(a){this.cursor.advance(a);return Rm(this.request)};
l.continue=function(a){this.cursor.continue(a);return Rm(this.request)};
l.delete=function(){return Cm(this.cursor.delete()).then(function(){})};
l.getKey=function(){return this.cursor.key};
l.getValue=function(){return this.cursor.value};
l.update=function(a){return Cm(this.cursor.update(a))};function Um(a,b,c){return new Promise(function(d,e){function f(){w||(w=new Fm(g.result,{closed:r}));return w}
var g=void 0!==b?self.indexedDB.open(a,b):self.indexedDB.open(a);var h=c.blocked,k=c.blocking,m=c.xd,q=c.upgrade,r=c.closed,w;g.addEventListener("upgradeneeded",function(t){try{if(null===t.newVersion)throw Error("Invariant: newVersion on IDbVersionChangeEvent is null");if(null===g.transaction)throw Error("Invariant: transaction on IDbOpenDbRequest is null");t.dataLoss&&"none"!==t.dataLoss&&em("IDB_DATA_CORRUPTED",{reason:t.dataLossMessage||"unknown reason",dbName:gm(a)});var y=f(),E=new Km(g.transaction);
q&&q(y,function(F){return t.oldVersion<F&&t.newVersion>=F},E);
E.done.catch(function(F){e(F)})}catch(F){e(F)}});
g.addEventListener("success",function(){var t=g.result;k&&t.addEventListener("versionchange",function(){k(f())});
t.addEventListener("close",function(){em("IDB_UNEXPECTEDLY_CLOSED",{dbName:gm(a),dbVersion:t.version});m&&m()});
d(f())});
g.addEventListener("error",function(){e(g.error)});
h&&g.addEventListener("blocked",function(){h()})})}
function Vm(a,b,c){c=void 0===c?{}:c;return Um(a,b,c)}
function Wm(a,b){b=void 0===b?{}:b;var c,d,e,f;return x(function(g){if(1==g.i)return ya(g,2),c=self.indexedDB.deleteDatabase(a),d=b,(e=d.blocked)&&c.addEventListener("blocked",function(){e()}),v(g,Bm(c),4);
if(2!=g.i)return za(g,0);f=Aa(g);throw rm(f,a,"",-1);})}
;function Xm(a){return new Promise(function(b){Ml(function(){b()},a)})}
function Ym(a,b){this.name=a;this.options=b;this.m=!0;this.s=this.o=0;this.j=500}
Ym.prototype.l=function(a,b,c){c=void 0===c?{}:c;return Vm(a,b,c)};
Ym.prototype.delete=function(a){a=void 0===a?{}:a;return Wm(this.name,a)};
function Zm(a,b){return new nm("INCOMPATIBLE_DB_VERSION",{dbName:a.name,oldVersion:a.options.version,newVersion:b})}
function $m(a,b){if(!b)throw sm("openWithToken",gm(a.name));return an(a)}
function an(a){function b(){var f,g,h,k,m,q,r,w,t,y;return x(function(E){switch(E.i){case 1:return g=null!=(f=Error().stack)?f:"",ya(E,2),v(E,a.l(a.name,a.options.version,d),4);case 4:h=E.j;for(var F=a.options,O=[],N=p(Object.keys(F.Na)),Q=N.next();!Q.done;Q=N.next()){Q=Q.value;var ca=F.Na[Q],U=void 0===ca.hd?Number.MAX_VALUE:ca.hd;!(h.i.version>=ca.qb)||h.i.version>=U||h.i.objectStoreNames.contains(Q)||O.push(Q)}k=O;if(0===k.length){E.B(5);break}m=Object.keys(a.options.Na);q=h.objectStoreNames();
if(a.s<Ek("ytidb_reopen_db_retries",0))return a.s++,h.close(),dm(new nm("DB_REOPENED_BY_MISSING_OBJECT_STORES",{dbName:a.name,expectedObjectStores:m,foundObjectStores:q})),E.return(b());if(!(a.o<Ek("ytidb_remake_db_retries",1))){E.B(6);break}a.o++;if(!M("ytidb_remake_db_enable_backoff_delay")){E.B(7);break}return v(E,Xm(a.j),8);case 8:a.j*=2;case 7:return v(E,a.delete(),9);case 9:return dm(new nm("DB_DELETED_BY_MISSING_OBJECT_STORES",{dbName:a.name,expectedObjectStores:m,foundObjectStores:q})),E.return(b());
case 6:throw new om(q,m);case 5:return E.return(h);case 2:r=Aa(E);if(r instanceof DOMException?"VersionError"!==r.name:"DOMError"in self&&r instanceof DOMError?"VersionError"!==r.name:!(r instanceof Object&&"message"in r)||"An attempt was made to open a database using a lower version than the existing version."!==r.message){E.B(10);break}return v(E,a.l(a.name,void 0,Object.assign({},d,{upgrade:void 0})),11);case 11:w=E.j;t=w.i.version;if(void 0!==a.options.version&&t>a.options.version+1)throw w.close(),
a.m=!1,Zm(a,t);return E.return(w);case 10:throw c(),r instanceof Error&&!M("ytidb_async_stack_killswitch")&&(r.stack=r.stack+"\n"+g.substring(g.indexOf("\n")+1)),rm(r,a.name,"",null!=(y=a.options.version)?y:-1);}})}
function c(){a.i===e&&(a.i=void 0)}
if(!a.m)throw Zm(a);if(a.i)return a.i;var d={blocking:function(f){f.close()},
closed:c,xd:c,upgrade:a.options.upgrade};var e=b();a.i=e;return a.i}
;var bn=new Ym("YtIdbMeta",{Na:{databases:{qb:1}},upgrade:function(a,b){b(1)&&Hm(a,"databases",{keyPath:"actualName"})}});
function cn(a,b){var c;return x(function(d){if(1==d.i)return v(d,$m(bn,b),2);c=d.j;return d.return(Gm(c,["databases"],{U:!0,mode:"readwrite"},function(e){var f=e.objectStore("databases");return f.get(a.actualName).then(function(g){if(g?a.actualName!==g.actualName||a.publicName!==g.publicName||a.userIdentifier!==g.userIdentifier:1)return Cm(f.i.put(a,void 0)).then(function(){})})}))})}
function dn(a,b){var c;return x(function(d){if(1==d.i)return a?v(d,$m(bn,b),2):d.return();c=d.j;return d.return(c.delete("databases",a))})}
function en(a,b){var c,d;return x(function(e){return 1==e.i?(c=[],v(e,$m(bn,b),2)):3!=e.i?(d=e.j,v(e,Gm(d,["databases"],{U:!0,mode:"readonly"},function(f){c.length=0;return Pm(f.objectStore("databases"),{},function(g){a(g.getValue())&&c.push(g.getValue());return g.continue()})}),3)):e.return(c)})}
function fn(a){return en(function(b){return"LogsDatabaseV2"===b.publicName&&void 0!==b.userIdentifier},a)}
function gn(a,b,c){return en(function(d){return c?void 0!==d.userIdentifier&&!a.includes(d.userIdentifier)&&c.includes(d.publicName):void 0!==d.userIdentifier&&!a.includes(d.userIdentifier)},b)}
function hn(a){var b,c;return x(function(d){if(1==d.i)return b=Rl("YtIdbMeta hasAnyMeta other"),v(d,en(function(e){return void 0!==e.userIdentifier&&e.userIdentifier!==b},a),2);
c=d.j;return d.return(0<c.length)})}
;var jn,kn=new function(){}(new function(){});
function ln(){var a,b,c,d;return x(function(e){switch(e.i){case 1:a=Wl();if(null==(b=a)?0:b.hasSucceededOnce)return e.return(!0);var f;if(f=Sl)f=/WebKit\/([0-9]+)/.exec(Tb()),f=!!(f&&600<=parseInt(f[1],10));f&&(f=/WebKit\/([0-9]+)/.exec(Tb()),f=!(f&&602<=parseInt(f[1],10)));if(f||Mc)return e.return(!1);try{if(c=self,!(c.indexedDB&&c.IDBIndex&&c.IDBKeyRange&&c.IDBObjectStore))return e.return(!1)}catch(g){return e.return(!1)}if(!("IDBTransaction"in self&&"objectStoreNames"in IDBTransaction.prototype))return e.return(!1);
ya(e,2);d={actualName:"yt-idb-test-do-not-use",publicName:"yt-idb-test-do-not-use",userIdentifier:void 0};return v(e,cn(d,kn),4);case 4:return v(e,dn("yt-idb-test-do-not-use",kn),5);case 5:return e.return(!0);case 2:return Aa(e),e.return(!1)}})}
function mn(){if(void 0!==jn)return jn;Zl=!0;return jn=ln().then(function(a){Zl=!1;var b;if(null!=(b=Vl())&&b.i){var c;b={hasSucceededOnce:(null==(c=Wl())?void 0:c.hasSucceededOnce)||a};var d;null==(d=Vl())||d.set("LAST_RESULT_ENTRY_KEY",b,2592E3,!0)}return a})}
function nn(){var a=B("ytglobal.idbToken_")||void 0;return a?Promise.resolve(a):mn().then(function(b){(b=b?kn:void 0)&&A("ytglobal.idbToken_",b);return b})}
;var on=0;function pn(a,b){on||(on=Xh.V(function(){var c,d,e,f,g;return x(function(h){switch(h.i){case 1:return v(h,nn(),2);case 2:c=h.j;if(!c)return h.return();d=!0;ya(h,3);return v(h,gn(a,c,b),5);case 5:e=h.j;if(!e.length){d=!1;h.B(6);break}f=e[0];return v(h,Wm(f.actualName),7);case 7:return v(h,dn(f.actualName,c),6);case 6:za(h,4);break;case 3:g=Aa(h),dm(g),d=!1;case 4:Xh.ga(on),on=0,d&&pn(a,b),h.i=0}})}))}
function qn(){var a;return x(function(b){return 1==b.i?v(b,nn(),2):(a=b.j)?b.return(hn(a)):b.return(!1)})}
new Bh;function rn(a){if(!Ql())throw a=new nm("AUTH_INVALID",{dbName:a}),dm(a),a;var b=Rl();return{actualName:a+":"+b,publicName:a,userIdentifier:b}}
function sn(a,b,c,d){var e,f,g,h,k,m;return x(function(q){switch(q.i){case 1:return f=null!=(e=Error().stack)?e:"",v(q,nn(),2);case 2:g=q.j;if(!g)throw h=sm("openDbImpl",a,b),M("ytidb_async_stack_killswitch")||(h.stack=h.stack+"\n"+f.substring(f.indexOf("\n")+1)),dm(h),h;fm(a);k=c?{actualName:a,publicName:a,userIdentifier:void 0}:rn(a);ya(q,3);return v(q,cn(k,g),5);case 5:return v(q,Vm(k.actualName,b,d),6);case 6:return q.return(q.j);case 3:return m=Aa(q),ya(q,7),v(q,dn(k.actualName,g),9);case 9:za(q,
8);break;case 7:Aa(q);case 8:throw m;}})}
function tn(a,b,c){c=void 0===c?{}:c;return sn(a,b,!1,c)}
function un(a,b,c){c=void 0===c?{}:c;return sn(a,b,!0,c)}
function vn(a,b){b=void 0===b?{}:b;var c,d;return x(function(e){if(1==e.i)return v(e,nn(),2);if(3!=e.i){c=e.j;if(!c)return e.return();fm(a);d=rn(a);return v(e,Wm(d.actualName,b),3)}return v(e,dn(d.actualName,c),0)})}
function wn(a,b,c){a=a.map(function(d){return x(function(e){return 1==e.i?v(e,Wm(d.actualName,b),2):v(e,dn(d.actualName,c),0)})});
return Promise.all(a).then(function(){})}
function xn(){var a=void 0===a?{}:a;var b,c;return x(function(d){if(1==d.i)return v(d,nn(),2);if(3!=d.i){b=d.j;if(!b)return d.return();fm("LogsDatabaseV2");return v(d,fn(b),3)}c=d.j;return v(d,wn(c,a,b),0)})}
function yn(a,b){b=void 0===b?{}:b;var c;return x(function(d){if(1==d.i)return v(d,nn(),2);if(3!=d.i){c=d.j;if(!c)return d.return();fm(a);return v(d,Wm(a,b),3)}return v(d,dn(a,c),0)})}
;function zn(a,b){Ym.call(this,a,b);this.options=b;fm(a)}
u(zn,Ym);function An(a,b){var c;return function(){c||(c=new zn(a,b));return c}}
zn.prototype.l=function(a,b,c){c=void 0===c?{}:c;return(this.options.Jb?un:tn)(a,b,Object.assign({},c))};
zn.prototype.delete=function(a){a=void 0===a?{}:a;return(this.options.Jb?yn:vn)(this.name,a)};
function Bn(a,b){return An(a,b)}
;function Cn(){}
;function Dn(){return"INNERTUBE_API_KEY"in Ak&&"INNERTUBE_API_VERSION"in Ak}
function En(){return{innertubeApiKey:L("INNERTUBE_API_KEY"),innertubeApiVersion:L("INNERTUBE_API_VERSION"),yb:L("INNERTUBE_CONTEXT_CLIENT_CONFIG_INFO"),dc:L("INNERTUBE_CONTEXT_CLIENT_NAME","WEB"),Vc:L("INNERTUBE_CONTEXT_CLIENT_NAME",1),innertubeContextClientVersion:L("INNERTUBE_CONTEXT_CLIENT_VERSION"),fc:L("INNERTUBE_CONTEXT_HL"),ec:L("INNERTUBE_CONTEXT_GL"),Wc:L("INNERTUBE_HOST_OVERRIDE")||"",Yc:!!L("INNERTUBE_USE_THIRD_PARTY_AUTH",!1),Xc:!!L("INNERTUBE_OMIT_API_KEY_WHEN_AUTH_HEADER_IS_PRESENT",
!1),appInstallData:L("SERIALIZED_CLIENT_CONFIG_DATA")}}
function Fn(a){var b={client:{hl:a.fc,gl:a.ec,clientName:a.dc,clientVersion:a.innertubeContextClientVersion,configInfo:a.yb}};navigator.userAgent&&(b.client.userAgent=String(navigator.userAgent));var c=z.devicePixelRatio;c&&1!=c&&(b.client.screenDensityFloat=String(c));c=Fk();""!==c&&(b.client.experimentsToken=c);c=Gk();0<c.length&&(b.request={internalExperimentFlags:c});Gn(a,void 0,b);Hn(void 0,b);In(a,void 0,b);Jn(void 0,b);M("start_sending_config_hash")&&Kn(void 0,b);L("DELEGATED_SESSION_ID")&&
!M("pageid_as_header_web")&&(b.user={onBehalfOfUser:L("DELEGATED_SESSION_ID")});a=Object;c=a.assign;for(var d=b.client,e={},f=p(Object.entries(Vk(L("DEVICE","")))),g=f.next();!g.done;g=f.next()){var h=p(g.value);g=h.next().value;h=h.next().value;"cbrand"===g?e.deviceMake=h:"cmodel"===g?e.deviceModel=h:"cbr"===g?e.browserName=h:"cbrver"===g?e.browserVersion=h:"cos"===g?e.osName=h:"cosver"===g?e.osVersion=h:"cplatform"===g&&(e.platform=h)}b.client=c.call(a,d,e);return b}
function Ln(a){var b=new Yi,c=new Ri;D(c,1,a.fc);D(c,2,a.ec);D(c,16,a.Vc);D(c,17,a.innertubeContextClientVersion);if(a.yb){var d=a.yb,e=new Ni;d.coldConfigData&&D(e,1,d.coldConfigData);d.appInstallData&&D(e,6,d.appInstallData);d.coldHashData&&D(e,3,d.coldHashData);d.hotHashData&&D(e,5,d.hotHashData);G(c,Ni,62,e)}(d=z.devicePixelRatio)&&1!=d&&D(c,65,d);d=Fk();""!==d&&D(c,54,d);d=Gk();if(0<d.length){e=new Ti;for(var f=0;f<d.length;f++){var g=new Li;D(g,1,d[f].key);g.setValue(d[f].value);de(e,15,Li,
g)}G(b,Ti,5,e)}Gn(a,c);Hn(c);In(a,c);Jn(c);M("start_sending_config_hash")&&Kn(c);L("DELEGATED_SESSION_ID")&&!M("pageid_as_header_web")&&(a=new Wi,D(a,3,L("DELEGATED_SESSION_ID")));a=p(Object.entries(Vk(L("DEVICE",""))));for(d=a.next();!d.done;d=a.next())e=p(d.value),d=e.next().value,e=e.next().value,"cbrand"===d?D(c,12,e):"cmodel"===d?D(c,13,e):"cbr"===d?D(c,87,e):"cbrver"===d?D(c,88,e):"cos"===d?D(c,18,e):"cosver"===d?D(c,19,e):"cplatform"===d&&D(c,42,e);b.j(c);return b}
function Gn(a,b,c){a=a.dc;if("WEB"===a||"MWEB"===a||1===a||2===a)if(b){c=Yd(b,Oi,96)||new Oi;var d=sl();d=Object.keys(fj).indexOf(d);d=-1===d?null:d;null!==d&&D(c,3,d);G(b,Oi,96,c)}else c&&(c.client.mainAppWebInfo=null!=(d=c.client.mainAppWebInfo)?d:{},c.client.mainAppWebInfo.webDisplayMode=sl())}
function Hn(a,b){var c;if(M("web_log_memory_total_kbytes")&&(null==(c=z.navigator)?0:c.deviceMemory)){var d;c=null==(d=z.navigator)?void 0:d.deviceMemory;a?D(a,95,1E6*c):b&&(b.client.memoryTotalKbytes=""+1E6*c)}}
function In(a,b,c){if(a.appInstallData)if(b){var d;c=null!=(d=Yd(b,Ni,62))?d:new Ni;D(c,6,a.appInstallData);G(b,Ni,62,c)}else c&&(c.client.configInfo=c.client.configInfo||{},c.client.configInfo.appInstallData=a.appInstallData)}
function Jn(a,b){var c=Hl();c&&(a?D(a,61,Dl[c]):b&&(b.client.connectionType=c));M("web_log_effective_connection_type")&&(c=Il())&&(a?D(a,94,El[c]):b&&(b.client.effectiveConnectionType=c))}
function Mn(a,b,c){c=void 0===c?{}:c;var d={};L("EOM_VISITOR_DATA")?d={"X-Goog-EOM-Visitor-Id":L("EOM_VISITOR_DATA")}:d={"X-Goog-Visitor-Id":c.visitorData||L("VISITOR_DATA","")};if(b&&b.includes("www.youtube-nocookie.com"))return d;(b=c.er||L("AUTHORIZATION"))||(a?b="Bearer "+B("gapi.auth.getToken")().dr:b=ug([]));b&&(d.Authorization=b,d["X-Goog-AuthUser"]=L("SESSION_INDEX",0),M("pageid_as_header_web")&&(d["X-Goog-PageId"]=L("DELEGATED_SESSION_ID")));return d}
function Kn(a,b){Cn.i||(Cn.i=new Cn);var c=B("yt.gcf.config.coldConfigData");var d=B("yt.gcf.config.hotHashData");var e=B("yt.gcf.config.coldHashData");if(c&&e&&d)if(a){var f;b=null!=(f=Yd(a,Ni,62))?f:new Ni;D(b,1,c);D(b,3,e);D(b,5,d);G(a,Ni,62,b)}else b&&(b.client.configInfo=b.client.configInfo||{},b.client.configInfo.coldConfigData=c,b.client.configInfo.coldHashData=e,b.client.configInfo.hotHashData=d)}
;function Nn(a){a=Object.assign({},a);delete a.Authorization;var b=ug();if(b){var c=new ci;c.update(L("INNERTUBE_API_KEY"));c.update(b);a.hash=ed(c.digest(),3)}return a}
;var On;function Pn(){On||(On=new Ul("yt.innertube"));return On}
function Qn(a,b,c,d){if(d)return null;d=Pn().get("nextId",!0)||1;var e=Pn().get("requests",!0)||{};e[d]={method:a,request:b,authState:Nn(c),requestTime:Math.round(R())};Pn().set("nextId",d+1,86400,!0);Pn().set("requests",e,86400,!0);return d}
function Rn(a){var b=Pn().get("requests",!0)||{};delete b[a];Pn().set("requests",b,86400,!0)}
function Sn(a){var b=Pn().get("requests",!0);if(b){for(var c in b){var d=b[c];if(!(6E4>Math.round(R())-d.requestTime)){var e=d.authState,f=Nn(Mn(!1));ub(e,f)&&(e=d.request,"requestTimeMs"in e&&(e.requestTimeMs=Math.round(R())),Tn(a,d.method,e,{}));delete b[c]}}Pn().set("requests",b,86400,!0)}}
;function Un(a){this.ab=this.i=!1;this.potentialEsfErrorCounter=this.j=0;this.handleError=function(){};
this.Ea=function(){};
this.now=Date.now;this.La=!1;var b;this.wc=null!=(b=a.wc)?b:100;var c;this.qc=null!=(c=a.qc)?c:1;var d;this.oc=null!=(d=a.oc)?d:2592E6;var e;this.mc=null!=(e=a.mc)?e:12E4;var f;this.pc=null!=(f=a.pc)?f:5E3;var g;this.I=null!=(g=a.I)?g:void 0;this.fb=!!a.fb;var h;this.eb=null!=(h=a.eb)?h:.1;var k;this.jb=null!=(k=a.jb)?k:10;a.handleError&&(this.handleError=a.handleError);a.Ea&&(this.Ea=a.Ea);a.La&&(this.La=a.La);a.ab&&(this.ab=a.ab);this.J=a.J;this.aa=a.aa;this.O=a.O;this.M=a.M;this.ka=a.ka;this.Eb=
a.Eb;this.Db=a.Db;Vn(this)&&(!this.J||this.J("networkless_logging"))&&Wn(this)}
function Wn(a){Vn(a)&&!a.La&&(a.i=!0,a.fb&&Math.random()<=a.eb&&a.O.Lc(a.I),Xn(a),a.M.W()&&a.Qa(),a.M.ja(a.Eb,a.Qa.bind(a)),a.M.ja(a.Db,a.Rb.bind(a)))}
l=Un.prototype;l.writeThenSend=function(a,b){var c=this;b=void 0===b?{}:b;if(Vn(this)&&this.i){var d={url:a,options:b,timestamp:this.now(),status:"NEW",sendCount:0};this.O.set(d,this.I).then(function(e){d.id=e;c.M.W()&&Yn(c,d)}).catch(function(e){Yn(c,d);
Zn(c,e)})}else this.ka(a,b)};
l.sendThenWrite=function(a,b,c){var d=this;b=void 0===b?{}:b;if(Vn(this)&&this.i){var e={url:a,options:b,timestamp:this.now(),status:"NEW",sendCount:0};this.J&&this.J("nwl_skip_retry")&&(e.skipRetry=c);if(this.M.W()||this.J&&this.J("nwl_aggressive_send_then_write")&&!e.skipRetry){if(!e.skipRetry){var f=b.onError?b.onError:function(){};
b.onError=function(g,h){return x(function(k){if(1==k.i)return v(k,d.O.set(e,d.I).catch(function(m){Zn(d,m)}),2);
f(g,h);k.i=0})}}this.ka(a,b,e.skipRetry)}else this.O.set(e,this.I).catch(function(g){d.ka(a,b,e.skipRetry);
Zn(d,g)})}else this.ka(a,b,this.J&&this.J("nwl_skip_retry")&&c)};
l.sendAndWrite=function(a,b){var c=this;b=void 0===b?{}:b;if(Vn(this)&&this.i){var d={url:a,options:b,timestamp:this.now(),status:"NEW",sendCount:0},e=!1,f=b.onSuccess?b.onSuccess:function(){};
d.options.onSuccess=function(g,h){void 0!==d.id?c.O.Da(d.id,c.I):e=!0;c.M.ya&&c.J&&c.J("vss_network_hint")&&c.M.ya(!0);f(g,h)};
this.ka(d.url,d.options);this.O.set(d,this.I).then(function(g){d.id=g;e&&c.O.Da(d.id,c.I)}).catch(function(g){Zn(c,g)})}else this.ka(a,b)};
l.Qa=function(){var a=this;if(!Vn(this))throw sm("throttleSend");this.j||(this.j=this.aa.V(function(){var b;return x(function(c){if(1==c.i)return v(c,a.O.cc("NEW",a.I),2);if(3!=c.i)return b=c.j,b?v(c,Yn(a,b),3):(a.Rb(),c.return());a.j&&(a.j=0,a.Qa());c.i=0})},this.wc))};
l.Rb=function(){this.aa.ga(this.j);this.j=0};
function Yn(a,b){var c,d;return x(function(e){switch(e.i){case 1:if(!Vn(a))throw c=sm("immediateSend"),c;if(void 0===b.id){e.B(2);break}return v(e,a.O.Zc(b.id,a.I),3);case 3:(d=e.j)?b=d:a.Ea(Error("The request cannot be found in the database."));case 2:if($n(a,b,a.oc)){e.B(4);break}a.Ea(Error("Networkless Logging: Stored logs request expired age limit"));if(void 0===b.id){e.B(5);break}return v(e,a.O.Da(b.id,a.I),5);case 5:return e.return();case 4:b.skipRetry||(b=ao(a,b));if(!b){e.B(0);break}if(!b.skipRetry||
void 0===b.id){e.B(8);break}return v(e,a.O.Da(b.id,a.I),8);case 8:a.ka(b.url,b.options,!!b.skipRetry),e.i=0}})}
function ao(a,b){if(!Vn(a))throw sm("updateRequestHandlers");var c=b.options.onError?b.options.onError:function(){};
b.options.onError=function(e,f){var g,h,k;return x(function(m){switch(m.i){case 1:g=bo(f);if(!(a.J&&a.J("nwl_consider_error_code")&&g||a.J&&!a.J("nwl_consider_error_code")&&a.potentialEsfErrorCounter<=a.jb)){m.B(2);break}if(!a.M.mb){m.B(3);break}return v(m,a.M.mb(),3);case 3:if(a.M.W()){m.B(2);break}c(e,f);if(!a.J||!a.J("nwl_consider_error_code")||void 0===(null==(h=b)?void 0:h.id)){m.B(6);break}return v(m,a.O.Hb(b.id,a.I,!1),6);case 6:return m.return();case 2:if(a.J&&a.J("nwl_consider_error_code")&&
!g&&a.potentialEsfErrorCounter>a.jb)return m.return();a.potentialEsfErrorCounter++;if(void 0===(null==(k=b)?void 0:k.id)){m.B(8);break}return b.sendCount<a.qc?v(m,a.O.Hb(b.id,a.I),12):v(m,a.O.Da(b.id,a.I),8);case 12:a.aa.V(function(){a.M.W()&&a.Qa()},a.pc);
case 8:c(e,f),m.i=0}})};
var d=b.options.onSuccess?b.options.onSuccess:function(){};
b.options.onSuccess=function(e,f){var g;return x(function(h){if(1==h.i)return void 0===(null==(g=b)?void 0:g.id)?h.B(2):v(h,a.O.Da(b.id,a.I),2);a.M.ya&&a.J&&a.J("vss_network_hint")&&a.M.ya(!0);d(e,f);h.i=0})};
return b}
function $n(a,b,c){b=b.timestamp;return a.now()-b>=c?!1:!0}
function Xn(a){if(!Vn(a))throw sm("retryQueuedRequests");a.O.cc("QUEUED",a.I).then(function(b){b&&!$n(a,b,a.mc)?a.aa.V(function(){return x(function(c){if(1==c.i)return void 0===b.id?c.B(2):v(c,a.O.Hb(b.id,a.I),2);Xn(a);c.i=0})}):a.M.W()&&a.Qa()})}
function Zn(a,b){a.Bc&&!a.M.W()?a.Bc(b):a.handleError(b)}
function Vn(a){return!!a.I||a.ab}
function bo(a){var b;return(a=null==a?void 0:null==(b=a.error)?void 0:b.code)&&400<=a&&599>=a?!1:!0}
;function co(a,b){this.version=a;this.args=b}
;function eo(a,b){this.topic=a;this.i=b}
eo.prototype.toString=function(){return this.topic};var fo=B("ytPubsub2Pubsub2Instance")||new K;K.prototype.subscribe=K.prototype.subscribe;K.prototype.unsubscribeByKey=K.prototype.Ia;K.prototype.publish=K.prototype.va;K.prototype.clear=K.prototype.clear;A("ytPubsub2Pubsub2Instance",fo);var go=B("ytPubsub2Pubsub2SubscribedKeys")||{};A("ytPubsub2Pubsub2SubscribedKeys",go);var ho=B("ytPubsub2Pubsub2TopicToKeys")||{};A("ytPubsub2Pubsub2TopicToKeys",ho);var io=B("ytPubsub2Pubsub2IsAsync")||{};A("ytPubsub2Pubsub2IsAsync",io);
A("ytPubsub2Pubsub2SkipSubKey",null);function jo(a,b){var c=ko();c&&c.publish.call(c,a.toString(),a,b)}
function lo(a){var b=mo,c=ko();if(!c)return 0;var d=c.subscribe(b.toString(),function(e,f){var g=B("ytPubsub2Pubsub2SkipSubKey");g&&g==d||(g=function(){if(go[d])try{if(f&&b instanceof eo&&b!=e)try{var h=b.i,k=f;if(!k.args||!k.version)throw Error("yt.pubsub2.Data.deserialize(): serializedData is incomplete.");try{if(!h.sa){var m=new h;h.sa=m.version}var q=h.sa}catch(F){}if(!q||k.version!=q)throw Error("yt.pubsub2.Data.deserialize(): serializedData version is incompatible.");try{q=Reflect;var r=q.construct;
var w=k.args,t=w.length;if(0<t){var y=Array(t);for(k=0;k<t;k++)y[k]=w[k];var E=y}else E=[];f=r.call(q,h,E)}catch(F){throw F.message="yt.pubsub2.Data.deserialize(): "+F.message,F;}}catch(F){throw F.message="yt.pubsub2.pubsub2 cross-binary conversion error for "+b.toString()+": "+F.message,F;}a.call(window,f)}catch(F){Kk(F)}},io[b.toString()]?B("yt.scheduler.instance")?Xh.V(g):dl(g,0):g())});
go[d]=!0;ho[b.toString()]||(ho[b.toString()]=[]);ho[b.toString()].push(d);return d}
function no(){var a=oo,b=lo(function(c){a.apply(void 0,arguments);po(b)});
return b}
function po(a){var b=ko();b&&("number"===typeof a&&(a=[a]),fb(a,function(c){b.unsubscribeByKey(c);delete go[c]}))}
function ko(){return B("ytPubsub2Pubsub2Instance")}
;var qo;
function ro(){if(qo)return qo();var a={};qo=Bn("LogsDatabaseV2",{Na:(a.LogsRequestsStore={qb:2},a),Jb:!1,upgrade:function(b,c,d){c(2)&&Hm(b,"LogsRequestsStore",{keyPath:"id",autoIncrement:!0});c(3);c(5)&&(d=d.objectStore("LogsRequestsStore"),d.i.indexNames.contains("newRequest")&&d.i.deleteIndex("newRequest"),d.i.createIndex("newRequestV2",["status","interface","timestamp"],{unique:!1}));c(7)&&b.i.objectStoreNames.contains("sapisid")&&b.i.deleteObjectStore("sapisid");c(9)&&b.i.objectStoreNames.contains("SWHealthLog")&&b.i.deleteObjectStore("SWHealthLog")},
version:9});return qo()}
;function so(a){return $m(ro(),a)}
function to(a,b){var c,d,e,f;return x(function(g){if(1==g.i)return c={startTime:R(),transactionType:"YT_IDB_TRANSACTION_TYPE_WRITE"},v(g,so(b),2);if(3!=g.i)return d=g.j,e=Object.assign({},a,{options:JSON.parse(JSON.stringify(a.options)),interface:L("INNERTUBE_CONTEXT_CLIENT_NAME",0)}),v(g,Jm(d,e),3);f=g.j;c.zd=R();uo(c);return g.return(f)})}
function vo(a,b){var c,d,e,f,g,h,k;return x(function(m){if(1==m.i)return c={startTime:R(),transactionType:"YT_IDB_TRANSACTION_TYPE_READ"},v(m,so(b),2);if(3!=m.i)return d=m.j,e=L("INNERTUBE_CONTEXT_CLIENT_NAME",0),f=[a,e,0],g=[a,e,R()],h=IDBKeyRange.bound(f,g),k=void 0,v(m,Gm(d,["LogsRequestsStore"],{mode:"readwrite",U:!0},function(q){return Sm(q.objectStore("LogsRequestsStore").index("newRequestV2"),{query:h,direction:"prev"},function(r){r.getValue()&&(k=r.getValue(),"NEW"===a&&(k.status="QUEUED",
r.update(k)))})}),3);
c.zd=R();uo(c);return m.return(k)})}
function wo(a,b){var c;return x(function(d){if(1==d.i)return v(d,so(b),2);c=d.j;return d.return(Gm(c,["LogsRequestsStore"],{mode:"readwrite",U:!0},function(e){var f=e.objectStore("LogsRequestsStore");return f.get(a).then(function(g){if(g)return g.status="QUEUED",Cm(f.i.put(g,void 0)).then(function(){return g})})}))})}
function xo(a,b,c){c=void 0===c?!0:c;var d;return x(function(e){if(1==e.i)return v(e,so(b),2);d=e.j;return e.return(Gm(d,["LogsRequestsStore"],{mode:"readwrite",U:!0},function(f){var g=f.objectStore("LogsRequestsStore");return g.get(a).then(function(h){return h?(h.status="NEW",c&&(h.sendCount+=1),Cm(g.i.put(h,void 0)).then(function(){return h})):wm.resolve(void 0)})}))})}
function yo(a,b){var c;return x(function(d){if(1==d.i)return v(d,so(b),2);c=d.j;return d.return(c.delete("LogsRequestsStore",a))})}
function zo(a){var b,c;return x(function(d){if(1==d.i)return v(d,so(a),2);b=d.j;c=R()-2592E6;return v(d,Gm(b,["LogsRequestsStore"],{mode:"readwrite",U:!0},function(e){return Pm(e.objectStore("LogsRequestsStore"),{},function(f){if(f.getValue().timestamp<=c)return f.delete().then(function(){return f.continue()})})}),0)})}
function Ao(){x(function(a){return v(a,xn(),0)})}
function uo(a){M("nwl_csi_killswitch")||.01>=Math.random()&&jo("nwl_transaction_latency_payload",a)}
;var Bo={},Co=Bn("ServiceWorkerLogsDatabase",{Na:(Bo.SWHealthLog={qb:1},Bo),Jb:!0,upgrade:function(a,b){b(1)&&Hm(a,"SWHealthLog",{keyPath:"id",autoIncrement:!0}).i.createIndex("swHealthNewRequest",["interface","timestamp"],{unique:!1})},
version:1});function Do(a){return $m(Co(),a)}
function Eo(a){var b,c;x(function(d){if(1==d.i)return v(d,Do(a),2);b=d.j;c=R()-2592E6;return v(d,Gm(b,["SWHealthLog"],{mode:"readwrite",U:!0},function(e){return Pm(e.objectStore("SWHealthLog"),{},function(f){if(f.getValue().timestamp<=c)return f.delete().then(function(){return f.continue()})})}),0)})}
function Fo(a){var b;return x(function(c){if(1==c.i)return v(c,Do(a),2);b=c.j;return v(c,b.clear("SWHealthLog"),0)})}
;var Go={},Ho=0;function Io(a){var b=new Image,c=""+Ho++;Go[c]=b;b.onload=b.onerror=function(){delete Go[c]};
b.src=a}
;function Jo(){this.i=new Map;this.j=!1}
function Ko(){if(!Jo.i){var a=B("yt.networkRequestMonitor.instance")||new Jo;A("yt.networkRequestMonitor.instance",a);Jo.i=a}return Jo.i}
Jo.prototype.requestComplete=function(a,b){b&&(this.j=!0);a=this.removeParams(a);this.i.get(a)||this.i.set(a,b)};
Jo.prototype.isEndpointCFR=function(a){a=this.removeParams(a);return(a=this.i.get(a))?!1:!1===a&&this.j?!0:null};
Jo.prototype.removeParams=function(a){return a.split("?")[0]};
Jo.prototype.removeParams=Jo.prototype.removeParams;Jo.prototype.isEndpointCFR=Jo.prototype.isEndpointCFR;Jo.prototype.requestComplete=Jo.prototype.requestComplete;Jo.getInstance=Ko;var Lo;function Mo(){Lo||(Lo=new Ul("yt.offline"));return Lo}
function No(a){if(M("offline_error_handling")){var b=Mo().get("errors",!0)||{};b[a.message]={name:a.name,stack:a.stack};a.level&&(b[a.message].level=a.level);Mo().set("errors",b,2592E3,!0)}}
;function Oo(){bf.call(this);var a=this;this.l=!1;this.j=Wh();this.j.ja("networkstatus-online",function(){if(a.l&&M("offline_error_handling")){var b=Mo().get("errors",!0);if(b){for(var c in b)if(b[c]){var d=new P(c,"sent via offline_errors");d.name=b[c].name;d.stack=b[c].stack;d.level=b[c].level;Kk(d)}Mo().set("errors",{},2592E3,!0)}}})}
u(Oo,bf);function Po(){if(!Oo.i){var a=B("yt.networkStatusManager.instance")||new Oo;A("yt.networkStatusManager.instance",a);Oo.i=a}return Oo.i}
l=Oo.prototype;l.W=function(){return this.j.W()};
l.ya=function(a){this.j.j=a};
l.Uc=function(){var a=window.navigator.onLine;return void 0===a?!0:a};
l.Pc=function(){this.l=!0};
l.ja=function(a,b){return this.j.ja(a,b)};
l.mb=function(a){a=Uh(this.j,a);a.then(function(b){M("use_cfr_monitor")&&Ko().requestComplete("generate_204",b)});
return a};
Oo.prototype.sendNetworkCheckRequest=Oo.prototype.mb;Oo.prototype.listen=Oo.prototype.ja;Oo.prototype.enableErrorFlushing=Oo.prototype.Pc;Oo.prototype.getWindowStatus=Oo.prototype.Uc;Oo.prototype.networkStatusHint=Oo.prototype.ya;Oo.prototype.isNetworkAvailable=Oo.prototype.W;Oo.getInstance=Po;function Qo(a){a=void 0===a?{}:a;bf.call(this);var b=this;this.j=this.s=0;this.l=Po();var c=B("yt.networkStatusManager.instance.listen").bind(this.l);c&&(a.lb?(this.lb=a.lb,c("networkstatus-online",function(){Ro(b,"publicytnetworkstatus-online")}),c("networkstatus-offline",function(){Ro(b,"publicytnetworkstatus-offline")})):(c("networkstatus-online",function(){cf(b,"publicytnetworkstatus-online")}),c("networkstatus-offline",function(){cf(b,"publicytnetworkstatus-offline")})))}
u(Qo,bf);Qo.prototype.W=function(){var a=B("yt.networkStatusManager.instance.isNetworkAvailable");return a?a.bind(this.l)():!0};
Qo.prototype.ya=function(a){var b=B("yt.networkStatusManager.instance.networkStatusHint").bind(this.l);b&&b(a)};
Qo.prototype.mb=function(a){var b=this,c;return x(function(d){c=B("yt.networkStatusManager.instance.sendNetworkCheckRequest").bind(b.l);return M("skip_network_check_if_cfr")&&Ko().isEndpointCFR("generate_204")?d.return(new Promise(function(e){var f;b.ya((null==(f=window.navigator)?void 0:f.onLine)||!0);e(b.W())})):c?d.return(c(a)):d.return(!0)})};
function Ro(a,b){a.lb?a.j?(Xh.ga(a.s),a.s=Xh.V(function(){a.o!==b&&(cf(a,b),a.o=b,a.j=R())},a.lb-(R()-a.j))):(cf(a,b),a.o=b,a.j=R()):cf(a,b)}
;var So;function To(){var a=Un.call;So||(So=new Qo({rr:!0,kr:!0}));a.call(Un,this,{O:{Lc:zo,Da:yo,cc:vo,Zc:wo,Hb:xo,set:to},M:So,handleError:Kk,Ea:Lk,ka:Uo,now:R,Bc:No,aa:Pl(),Eb:"publicytnetworkstatus-online",Db:"publicytnetworkstatus-offline",fb:!0,eb:.1,jb:Ek("potential_esf_error_limit",10),J:M,La:!(Ql()&&Vo())});this.l=new Bh;M("networkless_immediately_drop_all_requests")&&Ao();yn("LogsDatabaseV2")}
u(To,Un);function Wo(){var a=B("yt.networklessRequestController.instance");a||(a=new To,A("yt.networklessRequestController.instance",a),M("networkless_logging")&&nn().then(function(b){a.I=b;Wn(a);a.l.resolve();a.fb&&Math.random()<=a.eb&&a.I&&Eo(a.I);M("networkless_immediately_drop_sw_health_store")&&Xo(a)}));
return a}
To.prototype.writeThenSend=function(a,b){b||(b={});Ql()||(this.i=!1);Un.prototype.writeThenSend.call(this,a,b)};
To.prototype.sendThenWrite=function(a,b,c){b||(b={});Ql()||(this.i=!1);Un.prototype.sendThenWrite.call(this,a,b,c)};
To.prototype.sendAndWrite=function(a,b){b||(b={});Ql()||(this.i=!1);Un.prototype.sendAndWrite.call(this,a,b)};
To.prototype.awaitInitialization=function(){return this.l.promise};
function Xo(a){var b;x(function(c){if(!a.I)throw b=sm("clearSWHealthLogsDb"),b;return c.return(Fo(a.I).catch(function(d){a.handleError(d)}))})}
function Uo(a,b,c){M("use_cfr_monitor")&&Yo(a,b);if(M("use_request_time_ms_header"))b.headers&&(b.headers["X-Goog-Request-Time"]=JSON.stringify(Math.round(R())));else{var d;if(null==(d=b.postParams)?0:d.requestTimeMs)b.postParams.requestTimeMs=Math.round(R())}if(c&&0===Object.keys(b).length){var e=void 0===e?"":e;var f=void 0===f?!1:f;if(a)if(e)ml(a,void 0,"POST",e);else if(L("USE_NET_AJAX_FOR_PING_TRANSPORT",!1))ml(a,void 0,"GET","",void 0,void 0,f);else{b:{try{var g=new bb({url:a});if(g.l&&g.j||
g.m){var h=mc(nc(5,a)),k;if(!(k=!h||!h.endsWith("/aclk"))){var m=a.search(Bc),q=Ac(a,0,"ri",m);if(0>q)var r=null;else{var w=a.indexOf("&",q);if(0>w||w>m)w=m;r=decodeURIComponent(a.slice(q+3,-1!==w?w:0).replace(/\+/g," "))}k="1"!==r}var t=!k;break b}}catch(E){}t=!1}if(t){b:{try{if(window.navigator&&window.navigator.sendBeacon&&window.navigator.sendBeacon(a,"")){var y=!0;break b}}catch(E){}y=!1}c=y?!0:!1}else c=!1;c||Io(a)}}else jl(a,b)}
function Yo(a,b){var c=b.onError?b.onError:function(){};
b.onError=function(e,f){Ko().requestComplete(a,!1);c(e,f)};
var d=b.onSuccess?b.onSuccess:function(){};
b.onSuccess=function(e,f){Ko().requestComplete(a,!0);d(e,f)}}
function Vo(){return"www.youtube-nocookie.com"!==oc(document.location.toString())}
;var Zo=!1,$o=z.ytNetworklessLoggingInitializationOptions||{isNwlInitialized:Zo};A("ytNetworklessLoggingInitializationOptions",$o);function np(){var a;x(function(b){if(1==b.i)return v(b,nn(),2);a=b.j;if(!a||!Ql()&&!M("nwl_init_require_datasync_id_killswitch")||!Vo())return b.B(0);Zo=!0;$o.isNwlInitialized=Zo;return v(b,Wo().awaitInitialization(),0)})}
;function Mp(a){var b=this;this.config_=null;a?this.config_=a:Dn()&&(this.config_=En());Kl(function(){Sn(b)},5E3)}
Mp.prototype.isReady=function(){!this.config_&&Dn()&&(this.config_=En());return!!this.config_};
function Tn(a,b,c,d){function e(y){y=void 0===y?!1:y;var E;if(d.retry&&"www.youtube-nocookie.com"!=h&&(y||M("skip_ls_gel_retry")||"application/json"!==g.headers["Content-Type"]||(E=Qn(b,c,m,k)),E)){var F=g.onSuccess,O=g.onFetchSuccess;g.onSuccess=function(N,Q){Rn(E);F(N,Q)};
c.onFetchSuccess=function(N,Q){Rn(E);O(N,Q)}}try{y&&d.retry&&!d.jc.bypassNetworkless?(g.method="POST",d.jc.writeThenSend?Wo().writeThenSend(t,g):Wo().sendAndWrite(t,g)):M("web_all_payloads_via_jspb")?jl(t,g):(g.method="POST",g.postParams||(g.postParams={}),jl(t,g))}catch(N){if("InvalidAccessError"==N.name)E&&(Rn(E),E=0),Lk(Error("An extension is blocking network request."));
else throw N;}E&&Kl(function(){Sn(a)},5E3)}
!L("VISITOR_DATA")&&"visitor_id"!==b&&.01>Math.random()&&Lk(new P("Missing VISITOR_DATA when sending innertube request.",b,c,d));if(!a.isReady()){var f=new P("innertube xhrclient not ready",b,c,d);Kk(f);throw f;}var g={headers:d.headers||{},method:"POST",postParams:c,postBody:d.postBody,postBodyFormat:d.postBodyFormat||"JSON",onTimeout:function(){d.onTimeout()},
onFetchTimeout:d.onTimeout,onSuccess:function(y,E){if(d.onSuccess)d.onSuccess(E)},
onFetchSuccess:function(y){if(d.onSuccess)d.onSuccess(y)},
onError:function(y,E){if(d.onError)d.onError(E)},
onFetchError:function(y){if(d.onError)d.onError(y)},
timeout:d.timeout,withCredentials:!0};g.headers["Content-Type"]||(g.headers["Content-Type"]="application/json");var h="";(f=a.config_.Wc)&&(h=f);var k=a.config_.Yc||!1,m=Mn(k,h,d);Object.assign(g.headers,m);(f=g.headers.Authorization)&&!h&&(g.headers["x-origin"]=window.location.origin);var q="/youtubei/"+a.config_.innertubeApiVersion+"/"+b,r={alt:"json"},w=a.config_.Xc&&f;w=w&&f.startsWith("Bearer");w||(r.key=a.config_.innertubeApiKey);var t=Xk(""+h+q,r||{},!0);(B("ytNetworklessLoggingInitializationOptions")?
$o.isNwlInitialized:Zo)?mn().then(function(y){e(y)}):e(!1)}
;var Np=0,Op=Oc?"webkit":Nc?"moz":Lc?"ms":Kc?"o":"";A("ytDomDomGetNextId",B("ytDomDomGetNextId")||function(){return++Np});var Pp={stopImmediatePropagation:1,stopPropagation:1,preventMouseEvent:1,preventManipulation:1,preventDefault:1,layerX:1,layerY:1,screenX:1,screenY:1,scale:1,rotation:1,webkitMovementX:1,webkitMovementY:1};
function Qp(a){this.type="";this.state=this.source=this.data=this.currentTarget=this.relatedTarget=this.target=null;this.charCode=this.keyCode=0;this.metaKey=this.shiftKey=this.ctrlKey=this.altKey=!1;this.rotation=this.clientY=this.clientX=0;this.scale=1;this.changedTouches=this.touches=null;try{if(a=a||window.event){this.event=a;for(var b in a)b in Pp||(this[b]=a[b]);this.scale=a.scale;this.rotation=a.rotation;var c=a.target||a.srcElement;c&&3==c.nodeType&&(c=c.parentNode);this.target=c;var d=a.relatedTarget;
if(d)try{d=d.nodeName?d:null}catch(e){d=null}else"mouseover"==this.type?d=a.fromElement:"mouseout"==this.type&&(d=a.toElement);this.relatedTarget=d;this.clientX=void 0!=a.clientX?a.clientX:a.pageX;this.clientY=void 0!=a.clientY?a.clientY:a.pageY;this.keyCode=a.keyCode?a.keyCode:a.which;this.charCode=a.charCode||("keypress"==this.type?this.keyCode:0);this.altKey=a.altKey;this.ctrlKey=a.ctrlKey;this.shiftKey=a.shiftKey;this.metaKey=a.metaKey;this.i=a.pageX;this.j=a.pageY}}catch(e){}}
function Rp(a){if(document.body&&document.documentElement){var b=document.body.scrollTop+document.documentElement.scrollTop;a.i=a.clientX+(document.body.scrollLeft+document.documentElement.scrollLeft);a.j=a.clientY+b}}
Qp.prototype.preventDefault=function(){this.event&&(this.event.returnValue=!1,this.event.preventDefault&&this.event.preventDefault())};
Qp.prototype.stopPropagation=function(){this.event&&(this.event.cancelBubble=!0,this.event.stopPropagation&&this.event.stopPropagation())};
Qp.prototype.stopImmediatePropagation=function(){this.event&&(this.event.cancelBubble=!0,this.event.stopImmediatePropagation&&this.event.stopImmediatePropagation())};var qb=z.ytEventsEventsListeners||{};A("ytEventsEventsListeners",qb);var Sp=z.ytEventsEventsCounter||{count:0};A("ytEventsEventsCounter",Sp);
function Tp(a,b,c,d){d=void 0===d?{}:d;a.addEventListener&&("mouseenter"!=b||"onmouseenter"in document?"mouseleave"!=b||"onmouseenter"in document?"mousewheel"==b&&"MozBoxSizing"in document.documentElement.style&&(b="MozMousePixelScroll"):b="mouseout":b="mouseover");return pb(function(e){var f="boolean"===typeof e[4]&&e[4]==!!d,g=Qa(e[4])&&Qa(d)&&ub(e[4],d);return!!e.length&&e[0]==a&&e[1]==b&&e[2]==c&&(f||g)})}
var Up=db(function(){var a=!1;try{var b=Object.defineProperty({},"capture",{get:function(){a=!0}});
window.addEventListener("test",null,b)}catch(c){}return a});
function Vp(a,b,c,d){d=void 0===d?{}:d;if(!a||!a.addEventListener&&!a.attachEvent)return"";var e=Tp(a,b,c,d);if(e)return e;e=++Sp.count+"";var f=!("mouseenter"!=b&&"mouseleave"!=b||!a.addEventListener||"onmouseenter"in document);var g=f?function(h){h=new Qp(h);if(!mf(h.relatedTarget,function(k){return k==a}))return h.currentTarget=a,h.type=b,c.call(a,h)}:function(h){h=new Qp(h);
h.currentTarget=a;return c.call(a,h)};
g=Jk(g);a.addEventListener?("mouseenter"==b&&f?b="mouseover":"mouseleave"==b&&f?b="mouseout":"mousewheel"==b&&"MozBoxSizing"in document.documentElement.style&&(b="MozMousePixelScroll"),Up()||"boolean"===typeof d?a.addEventListener(b,g,d):a.addEventListener(b,g,!!d.capture)):a.attachEvent("on"+b,g);qb[e]=[a,b,c,g,d];return e}
function Wp(a){a&&("string"==typeof a&&(a=[a]),fb(a,function(b){if(b in qb){var c=qb[b],d=c[0],e=c[1],f=c[3];c=c[4];d.removeEventListener?Up()||"boolean"===typeof c?d.removeEventListener(e,f,c):d.removeEventListener(e,f,!!c.capture):d.detachEvent&&d.detachEvent("on"+e,f);delete qb[b]}}))}
;var Xp=window.ytcsi&&window.ytcsi.now?window.ytcsi.now:window.performance&&window.performance.timing&&window.performance.now&&window.performance.timing.navigationStart?function(){return window.performance.timing.navigationStart+window.performance.now()}:function(){return(new Date).getTime()};function Yp(a){this.H=a;this.j=null;this.o=0;this.u=null;this.s=0;this.l=[];for(a=0;4>a;a++)this.l.push(0);this.m=0;this.L=Vp(window,"mousemove",Wa(this.P,this));a=Wa(this.K,this);"function"===typeof a&&(a=Jk(a));this.R=window.setInterval(a,25)}
Za(Yp,J);Yp.prototype.P=function(a){void 0===a.i&&Rp(a);var b=a.i;void 0===a.j&&Rp(a);this.j=new hf(b,a.j)};
Yp.prototype.K=function(){if(this.j){var a=Xp();if(0!=this.o){var b=this.u,c=this.j,d=b.x-c.x;b=b.y-c.y;d=Math.sqrt(d*d+b*b)/(a-this.o);this.l[this.m]=.5<Math.abs((d-this.s)/this.s)?1:0;for(c=b=0;4>c;c++)b+=this.l[c]||0;3<=b&&this.H();this.s=d}this.o=a;this.u=this.j;this.m=(this.m+1)%4}};
Yp.prototype.D=function(){window.clearInterval(this.R);Wp(this.L)};var Zp={};
function $p(a){var b=void 0===a?{}:a;a=void 0===b.ed?!1:b.ed;b=void 0===b.Qc?!0:b.Qc;if(null==B("_lact",window)){var c=parseInt(L("LACT"),10);c=isFinite(c)?Date.now()-Math.max(c,0):-1;A("_lact",c,window);A("_fact",c,window);-1==c&&aq();Vp(document,"keydown",aq);Vp(document,"keyup",aq);Vp(document,"mousedown",aq);Vp(document,"mouseup",aq);a?Vp(window,"touchmove",function(){bq("touchmove",200)},{passive:!0}):(Vp(window,"resize",function(){bq("resize",200)}),b&&Vp(window,"scroll",function(){bq("scroll",200)}));
new Yp(function(){bq("mouse",100)});
Vp(document,"touchstart",aq,{passive:!0});Vp(document,"touchend",aq,{passive:!0})}}
function bq(a,b){Zp[a]||(Zp[a]=!0,Xh.V(function(){aq();Zp[a]=!1},b))}
function aq(){null==B("_lact",window)&&$p();var a=Date.now();A("_lact",a,window);-1==B("_fact",window)&&A("_fact",a,window);(a=B("ytglobal.ytUtilActivityCallback_"))&&a()}
function cq(){var a=B("_lact",window);return null==a?-1:Math.max(Date.now()-a,0)}
;var dq=z.ytPubsubPubsubInstance||new K,eq=z.ytPubsubPubsubSubscribedKeys||{},fq=z.ytPubsubPubsubTopicToKeys||{},gq=z.ytPubsubPubsubIsSynchronous||{};function hq(a,b){var c=iq();if(c&&b){var d=c.subscribe(a,function(){var e=arguments;var f=function(){eq[d]&&b.apply&&"function"==typeof b.apply&&b.apply(window,e)};
try{gq[a]?f():dl(f,0)}catch(g){Kk(g)}},void 0);
eq[d]=!0;fq[a]||(fq[a]=[]);fq[a].push(d);return d}return 0}
function jq(a){var b=iq();b&&("number"===typeof a?a=[a]:"string"===typeof a&&(a=[parseInt(a,10)]),fb(a,function(c){b.unsubscribeByKey(c);delete eq[c]}))}
function kq(a,b){var c=iq();c&&c.publish.apply(c,arguments)}
function lq(a){var b=iq();if(b)if(b.clear(a),a)mq(a);else for(var c in fq)mq(c)}
function iq(){return z.ytPubsubPubsubInstance}
function mq(a){fq[a]&&(a=fq[a],fb(a,function(b){eq[b]&&delete eq[b]}),a.length=0)}
K.prototype.subscribe=K.prototype.subscribe;K.prototype.unsubscribeByKey=K.prototype.Ia;K.prototype.publish=K.prototype.va;K.prototype.clear=K.prototype.clear;A("ytPubsubPubsubInstance",dq);A("ytPubsubPubsubTopicToKeys",fq);A("ytPubsubPubsubIsSynchronous",gq);A("ytPubsubPubsubSubscribedKeys",eq);function nq(){this.store={}}
nq.prototype.storePayload=function(a,b){a=oq(a);this.store[a]?this.store[a].push(b):this.store[a]=[b];return a};
nq.prototype.extractMatchingEntries=function(a){a=pq(this,a);for(var b=[],c=0;c<a.length;c++)b.push.apply(b,ia(this.store[a[c]])),delete this.store[a[c]];return b};
nq.prototype.getSequenceCount=function(a){a=pq(this,a);for(var b=0,c=0;c<a.length;c++)b+=this.store[a[c]].length||0;return b};
function pq(a,b){a=Object.keys(a.store)||[];if(1>=a.length&&oq(b)===a[0])return a;for(var c=[],d=0;d<a.length;d++){var e=a[d].split("/");if(qq(b.auth,e[0])){var f=b.isJspb;qq(void 0===f?"undefined":f?"true":"false",e[1])&&qq(b.cttAuthInfo,e[2])&&c.push(a[d])}}return c}
function qq(a,b){return void 0===a||"undefined"===a?!0:a===b}
nq.prototype.getSequenceCount=nq.prototype.getSequenceCount;nq.prototype.extractMatchingEntries=nq.prototype.extractMatchingEntries;nq.prototype.storePayload=nq.prototype.storePayload;function oq(a){return[void 0===a.auth?"undefined":a.auth,void 0===a.isJspb?"undefined":a.isJspb,void 0===a.cttAuthInfo?"undefined":a.cttAuthInfo].join("/")}
;var rq=Ek("initial_gel_batch_timeout",2E3),sq=Math.pow(2,16)-1,tq=void 0;function uq(){this.l=this.i=this.j=0}
var vq=new uq,wq=new uq,xq,yq=!0,zq=z.ytLoggingTransportGELQueue_||new Map;A("ytLoggingTransportGELQueue_",zq);var Aq=z.ytLoggingTransportGELProtoQueue_||new Map;A("ytLoggingTransportGELProtoQueue_",Aq);var Bq=z.ytLoggingTransportTokensToCttTargetIds_||{};A("ytLoggingTransportTokensToCttTargetIds_",Bq);var Cq=z.ytLoggingTransportTokensToJspbCttTargetIds_||{};A("ytLoggingTransportTokensToJspbCttTargetIds_",Cq);var Dq={};function Eq(){var a=B("yt.logging.ims");a||(a=new nq,A("yt.logging.ims",a));return a}
function Fq(a,b){M("web_all_payloads_via_jspb")&&Lk(new P("transport.log called for JSON in JSPB only experiment"));if("log_event"===a.endpoint){Gq(a);var c=Hq(a);if(M("use_new_in_memory_storage")){Dq[c]=!0;var d={cttAuthInfo:c,isJspb:!1};Eq().storePayload(d,a.payload);Iq(b,[],c,!1,d)}else d=zq.get(c)||[],zq.set(c,d),d.push(a.payload),Iq(b,d,c)}}
function Jq(a,b){if("log_event"===a.endpoint){Gq(void 0,a);var c=Hq(a,!0);if(M("use_new_in_memory_storage")){Dq[c]=!0;var d={cttAuthInfo:c,isJspb:!0};Eq().storePayload(d,a.payload.toJSON());Iq(b,[],c,!0,d)}else d=Aq.get(c)||[],Aq.set(c,d),a=a.payload.toJSON(),d.push(a),Iq(b,d,c,!0)}}
function Iq(a,b,c,d,e){d=void 0===d?!1:d;a&&(tq=new a);a=Ek("tvhtml5_logging_max_batch")||Ek("web_logging_max_batch")||100;var f=R(),g=d?wq.l:vq.l;b=b.length;e&&(b=Eq().getSequenceCount(e));b>=a?M("background_thread_flush_logs_due_to_batch_limit")?xq||(xq=Kq(function(){Lq({writeThenSend:!0},M("flush_only_full_queue")?c:void 0,d);xq=void 0},0)):Lq({writeThenSend:!0},M("flush_only_full_queue")?c:void 0,d):10<=f-g&&(Mq(d),d?wq.l=f:vq.l=f)}
function Nq(a,b){M("web_all_payloads_via_jspb")&&Lk(new P("transport.logIsolatedGelPayload called in JSPB only experiment"));if("log_event"===a.endpoint){Gq(a);var c=Hq(a),d=new Map;d.set(c,[a.payload]);b&&(tq=new b);return new yf(function(e,f){tq&&tq.isReady()?Oq(d,tq,e,f,{bypassNetworkless:!0},!0):e()})}}
function Pq(a,b){if("log_event"===a.endpoint){Gq(void 0,a);var c=Hq(a,!0),d=new Map;d.set(c,[a.payload.toJSON()]);b&&(tq=new b);return new yf(function(e){tq&&tq.isReady()?Qq(d,tq,e,{bypassNetworkless:!0},!0):e()})}}
function Hq(a,b){var c="";if(a.Ka)c="visitorOnlyApprovedKey";else if(a.cttAuthInfo){if(void 0===b?0:b){b=a.cttAuthInfo.token;c=a.cttAuthInfo;var d=new nk;c.videoId?d.setVideoId(c.videoId):c.playlistId&&Wd(d,2,ok,c.playlistId);Cq[b]=d}else b=a.cttAuthInfo,c={},b.videoId?c.videoId=b.videoId:b.playlistId&&(c.playlistId=b.playlistId),Bq[a.cttAuthInfo.token]=c;c=a.cttAuthInfo.token}return c}
function Lq(a,b,c){a=void 0===a?{}:a;c=void 0===c?!1:c;!c&&M("web_all_payloads_via_jspb")&&Lk(new P("transport.flushLogs called for JSON in JSPB only experiment"));new yf(function(d,e){c?(Rq(wq.j),Rq(wq.i),wq.i=0):(Rq(vq.j),Rq(vq.i),vq.i=0);if(tq&&tq.isReady())if(M("use_new_in_memory_storage")){var f=a,g=c,h=tq;f=void 0===f?{}:f;g=void 0===g?!1:g;var k=new Map,m=new Map;if(void 0!==b)g?(e=Eq().extractMatchingEntries({isJspb:g,cttAuthInfo:b}),k.set(b,e),Qq(k,h,d,f)):(k=Eq().extractMatchingEntries({isJspb:g,
cttAuthInfo:b}),m.set(b,k),Oq(m,h,d,e,f));else if(g){e=p(Object.keys(Dq));for(g=e.next();!g.done;g=e.next())m=g.value,g=Eq().extractMatchingEntries({isJspb:!0,cttAuthInfo:m}),0<g.length&&k.set(m,g),delete Dq[m];Qq(k,h,d,f)}else{k=p(Object.keys(Dq));for(g=k.next();!g.done;g=k.next()){g=g.value;var q=Eq().extractMatchingEntries({isJspb:!1,cttAuthInfo:g});0<q.length&&m.set(g,q);delete Dq[g]}Oq(m,h,d,e,f)}}else f=a,k=c,h=tq,f=void 0===f?{}:f,k=void 0===k?!1:k,void 0!==b?k?(e=new Map,k=Aq.get(b)||[],e.set(b,
k),Qq(e,h,d,f),Aq.delete(b)):(k=new Map,m=zq.get(b)||[],k.set(b,m),Oq(k,h,d,e,f),zq.delete(b)):k?(Qq(Aq,h,d,f),Aq.clear()):(Oq(zq,h,d,e,f),zq.clear());else Mq(c),d()})}
function Mq(a){a=void 0===a?!1:a;if(M("web_gel_timeout_cap")&&(!a&&!vq.i||a&&!wq.i)){var b=Kq(function(){Lq({writeThenSend:!0},void 0,a)},6E4);
a?wq.i=b:vq.i=b}Rq(a?wq.j:vq.j);b=L("LOGGING_BATCH_TIMEOUT",Ek("web_gel_debounce_ms",1E4));M("shorten_initial_gel_batch_timeout")&&yq&&(b=rq);b=Kq(function(){Lq({writeThenSend:!0},void 0,a)},b);
a?wq.j=b:vq.j=b}
function Oq(a,b,c,d,e,f){e=void 0===e?{}:e;var g=Math.round(R()),h=a.size,k={};a=p(a);for(var m=a.next();!m.done;k={Ta:k.Ta,ta:k.ta,Ga:k.Ga,Va:k.Va,Ua:k.Ua},m=a.next()){var q=p(m.value);m=q.next().value;q=q.next().value;k.ta=wb({context:Fn(b.config_||En())});if(!Pa(q)&&!M("throw_err_when_logevent_malformed_killswitch")){d();break}k.ta.events=q;(q=Bq[m])&&Sq(k.ta,m,q);delete Bq[m];k.Ga="visitorOnlyApprovedKey"===m;Tq(k.ta,g,k.Ga);Uq(e);k.Va=function(){h--;h||c()};
k.Ta=0;k.Ua=function(r){return function(){r.Ta++;if(e.bypassNetworkless&&1===r.Ta)try{Tn(b,"log_event",r.ta,Vq({writeThenSend:!0},r.Ga,r.Va,r.Ua,f)),yq=!1}catch(w){Kk(w),d()}h--;h||c()}}(k);
try{Tn(b,"log_event",k.ta,Vq(e,k.Ga,k.Va,k.Ua,f)),yq=!1}catch(r){Kk(r),d()}}}
function Qq(a,b,c,d,e){d=void 0===d?{}:d;var f=Math.round(R()),g=a.size,h=new Map([].concat(ia(a)));h=p(h);for(var k=h.next();!k.done;k=h.next()){var m=p(k.value).next().value,q=a.get(m);k=new pk;var r=Ln(b.config_||En());G(k,Yi,1,r);q=q?Wq(q):[];q=p(q);for(r=q.next();!r.done;r=q.next())de(k,3,Pj,r.value);(q=Cq[m])&&Xq(k,m,q);delete Cq[m];m="visitorOnlyApprovedKey"===m;Yq(k,f,m);Uq(d);k=ie(k);m=Vq(d,m,function(){g--;g||c()},function(){g--;
g||c()},e);
m.headers["Content-Type"]="application/json+protobuf";m.postBodyFormat="JSPB";m.postBody=k;Tn(b,"log_event","",m);yq=!1}}
function Uq(a){M("always_send_and_write")&&(a.writeThenSend=!1)}
function Vq(a,b,c,d,e){a={retry:!0,onSuccess:c,onError:d,jc:a,Ka:b,gr:!!e,headers:{},postBodyFormat:"",postBody:""};Zq()&&(a.headers["X-Goog-Request-Time"]=JSON.stringify(Math.round(R())));return a}
function Tq(a,b,c){Zq()||(a.requestTimeMs=String(b));M("unsplit_gel_payloads_in_logs")&&(a.unsplitGelPayloadsInLogs=!0);!c&&(b=L("EVENT_ID"))&&(c=$q(),a.serializedClientEventId={serializedEventId:b,clientCounter:String(c)})}
function Yq(a,b,c){Zq()||D(a,2,b);if(!c&&(b=L("EVENT_ID"))){c=$q();var d=new mk;D(d,1,b);D(d,2,c);G(a,mk,5,d)}}
function $q(){var a=L("BATCH_CLIENT_COUNTER")||0;a||(a=Math.floor(Math.random()*sq/2));a++;a>sq&&(a=1);Bk("BATCH_CLIENT_COUNTER",a);return a}
function Sq(a,b,c){if(c.videoId)var d="VIDEO";else if(c.playlistId)d="PLAYLIST";else return;a.credentialTransferTokenTargetId=c;a.context=a.context||{};a.context.user=a.context.user||{};a.context.user.credentialTransferTokens=[{token:b,scope:d}]}
function Xq(a,b,c){if(ee(c,1===Xd(c,ok)?1:-1))var d=1;else if(c.getPlaylistId())d=2;else return;G(a,nk,4,c);a=Yd(a,Yi,1)||new Yi;c=Yd(a,Wi,3)||new Wi;var e=new Vi;e.setToken(b);D(e,1,d);de(c,12,Vi,e);G(a,Wi,3,c)}
function Wq(a){for(var b=[],c=0;c<a.length;c++)try{b.push(new Pj(a[c]))}catch(d){Kk(new P("Transport failed to deserialize "+String(a[c])))}return b}
function Gq(a,b){if(B("yt.logging.transport.enableScrapingForTest")){var c=B("yt.logging.transport.scrapedPayloadsForTesting"),d=B("yt.logging.transport.payloadToScrape","");b&&(b=B("yt.logging.transport.getScrapedPayloadFromClientEventsFunction").bind(b.payload)())&&c.push(b);a&&a.payload[d]&&c.push((null==a?void 0:a.payload)[d]);A("yt.logging.transport.scrapedPayloadsForTesting",c)}}
function Zq(){return M("use_request_time_ms_header")||M("lr_use_request_time_ms_header")}
function Kq(a,b){return M("transport_use_scheduler")?Kl(a,b):dl(a,b)}
function Rq(a){M("transport_use_scheduler")?Xh.ga(a):window.clearTimeout(a)}
;var ar=z.ytLoggingGelSequenceIdObj_||{};A("ytLoggingGelSequenceIdObj_",ar);
function br(a,b,c,d){d=void 0===d?{}:d;var e={},f=Math.round(d.timestamp||R());e.eventTimeMs=f<Number.MAX_SAFE_INTEGER?f:0;e[a]=b;M("enable_unknown_lact_fix_on_html5")&&$p();a=cq();e.context={lastActivityMs:String(d.timestamp||!isFinite(a)?-1:a)};M("log_sequence_info_on_gel_web")&&d.ba&&(a=e.context,b=d.ba,b={index:cr(b),groupKey:b},a.sequence=b,d.Yb&&delete ar[d.ba]);(d.sc?Nq:Fq)({endpoint:"log_event",payload:e,cttAuthInfo:d.cttAuthInfo,Ka:d.Ka},c)}
function dr(a){Lq(void 0,void 0,void 0===a?!1:a)}
function cr(a){ar[a]=a in ar?ar[a]+1:0;return ar[a]}
;var er=[];var fr=z.ytLoggingGelSequenceIdObj_||{};A("ytLoggingGelSequenceIdObj_",fr);function gr(a,b,c){c=void 0===c?{}:c;var d=Math.round(c.timestamp||R());D(a,1,d<Number.MAX_SAFE_INTEGER?d:0);var e=cq();d=new Oj;D(d,1,c.timestamp||!isFinite(e)?-1:e);if(M("log_sequence_info_on_gel_web")&&c.ba){e=c.ba;var f=cr(e),g=new Nj;D(g,2,f);D(g,1,e);G(d,Nj,3,g);c.Yb&&delete fr[c.ba]}G(a,Oj,33,d);(c.sc?Pq:Jq)({endpoint:"log_event",payload:a,cttAuthInfo:c.cttAuthInfo,Ka:c.Ka},b)}
;function hr(a,b){b=void 0===b?{}:b;var c=!1;L("ytLoggingEventsDefaultDisabled",!1)&&(c=!0);gr(a,c?null:Mp,b)}
;function ir(a,b){var c=new Pj;be(c,Ej,72,kk,a);hr(c,b)}
function jr(a,b,c){var d=new Pj;be(d,Dj,73,kk,a);c?gr(d,c,b):hr(d,b)}
function kr(a,b,c){var d=new Pj;be(d,Cj,78,kk,a);c?gr(d,c,b):hr(d,b)}
function lr(a,b,c){var d=new Pj;be(d,Fj,208,kk,a);c?gr(d,c,b):hr(d,b)}
function mr(a,b,c){var d=new Pj;be(d,vj,156,kk,a);c?gr(d,c,b):hr(d,b)}
function nr(a,b,c){var d=new Pj;be(d,zj,215,kk,a);c?gr(d,c,b):hr(d,b)}
function or(a,b,c){var d=new Pj;be(d,uj,111,kk,a);c?gr(d,c,b):hr(d,b)}
;function cm(a,b,c){c=void 0===c?{}:c;if(M("migrate_events_to_ts")){c=void 0===c?{}:c;var d=Mp;L("ytLoggingEventsDefaultDisabled",!1)&&Mp===Mp&&(d=null);M("web_all_payloads_via_jspb")?er.push({payloadName:a,payload:b,options:c}):br(a,b,d,c)}else d=Mp,L("ytLoggingEventsDefaultDisabled",!1)&&Mp==Mp&&(d=null),br(a,b,d,c)}
;var pr=[{Bb:function(a){return"Cannot read property '"+a.key+"'"},
ib:{Error:[{regexp:/(Permission denied) to access property "([^']+)"/,groups:["reason","key"]}],TypeError:[{regexp:/Cannot read property '([^']+)' of (null|undefined)/,groups:["key","value"]},{regexp:/\u65e0\u6cd5\u83b7\u53d6\u672a\u5b9a\u4e49\u6216 (null|undefined) \u5f15\u7528\u7684\u5c5e\u6027\u201c([^\u201d]+)\u201d/,groups:["value","key"]},{regexp:/\uc815\uc758\ub418\uc9c0 \uc54a\uc74c \ub610\ub294 (null|undefined) \ucc38\uc870\uc778 '([^']+)' \uc18d\uc131\uc744 \uac00\uc838\uc62c \uc218 \uc5c6\uc2b5\ub2c8\ub2e4./,
groups:["value","key"]},{regexp:/No se puede obtener la propiedad '([^']+)' de referencia nula o sin definir/,groups:["key"]},{regexp:/Unable to get property '([^']+)' of (undefined or null) reference/,groups:["key","value"]},{regexp:/(null) is not an object \(evaluating '(?:([^.]+)\.)?([^']+)'\)/,groups:["value","base","key"]}]}},{Bb:function(a){return"Cannot call '"+a.key+"'"},
ib:{TypeError:[{regexp:/(?:([^ ]+)?\.)?([^ ]+) is not a function/,groups:["base","key"]},{regexp:/([^ ]+) called on (null or undefined)/,groups:["key","value"]},{regexp:/Object (.*) has no method '([^ ]+)'/,groups:["base","key"]},{regexp:/Object doesn't support property or method '([^ ]+)'/,groups:["key"]},{regexp:/\u30aa\u30d6\u30b8\u30a7\u30af\u30c8\u306f '([^']+)' \u30d7\u30ed\u30d1\u30c6\u30a3\u307e\u305f\u306f\u30e1\u30bd\u30c3\u30c9\u3092\u30b5\u30dd\u30fc\u30c8\u3057\u3066\u3044\u307e\u305b\u3093/,
groups:["key"]},{regexp:/\uac1c\uccb4\uac00 '([^']+)' \uc18d\uc131\uc774\ub098 \uba54\uc11c\ub4dc\ub97c \uc9c0\uc6d0\ud558\uc9c0 \uc54a\uc2b5\ub2c8\ub2e4./,groups:["key"]}]}},{Bb:function(a){return a.key+" is not defined"},
ib:{ReferenceError:[{regexp:/(.*) is not defined/,groups:["key"]},{regexp:/Can't find variable: (.*)/,groups:["key"]}]}}];var rr={qa:[],na:[{callback:qr,weight:500}]};function qr(a){if("JavaException"===a.name)return!0;a=a.stack;return a.includes("chrome://")||a.includes("chrome-extension://")||a.includes("moz-extension://")}
;function sr(){this.na=[];this.qa=[]}
var tr;function ur(){if(!tr){var a=tr=new sr;a.qa.length=0;a.na.length=0;rr.qa&&a.qa.push.apply(a.qa,rr.qa);rr.na&&a.na.push.apply(a.na,rr.na)}return tr}
;var vr=new K;function wr(a){function b(){return a.charCodeAt(d++)}
var c=a.length,d=0;do{var e=xr(b);if(Infinity===e)break;var f=e>>3;switch(e&7){case 0:e=xr(b);if(2===f)return e;break;case 1:if(2===f)return;d+=8;break;case 2:e=xr(b);if(2===f)return a.substr(d,e);d+=e;break;case 5:if(2===f)return;d+=4;break;default:return}}while(d<c)}
function xr(a){var b=a(),c=b&127;if(128>b)return c;b=a();c|=(b&127)<<7;if(128>b)return c;b=a();c|=(b&127)<<14;if(128>b)return c;b=a();return 128>b?c|(b&127)<<21:Infinity}
;function yr(a,b,c,d){if(a)if(Array.isArray(a)){var e=d;for(d=0;d<a.length&&!(a[d]&&(e+=zr(d,a[d],b,c),500<e));d++);d=e}else if("object"===typeof a)for(e in a){if(a[e]){var f=a[e];var g=b;var h=c;g="string"!==typeof f||"clickTrackingParams"!==e&&"trackingParams"!==e?0:(f=wr(atob(f.replace(/-/g,"+").replace(/_/g,"/"))))?zr(e+".ve",f,g,h):0;d+=g;d+=zr(e,a[e],b,c);if(500<d)break}}else c[b]=Ar(a),d+=c[b].length;else c[b]=Ar(a),d+=c[b].length;return d}
function zr(a,b,c,d){c+="."+a;a=Ar(b);d[c]=a;return c.length+a.length}
function Ar(a){try{return("string"===typeof a?a:String(JSON.stringify(a))).substr(0,500)}catch(b){return"unable to serialize "+typeof a+" ("+b.message+")"}}
;var Br=new Set,Cr=0,Dr=0,Er=0,Fr=[],Gr=["PhantomJS","Googlebot","TO STOP THIS SECURITY SCAN go/scan"];function bm(a){Hr(a)}
function Ir(a){Hr(a,"WARNING")}
function Hr(a,b,c,d,e,f){f=void 0===f?{}:f;f.name=c||L("INNERTUBE_CONTEXT_CLIENT_NAME",1);f.version=d||L("INNERTUBE_CONTEXT_CLIENT_VERSION");var g=f||{},h=void 0===b?"ERROR":b;h=void 0===h?"ERROR":h;if(a){a.hasOwnProperty("level")&&a.level&&(h=a.level);if(M("console_log_js_exceptions")){var k=[];k.push("Name: "+a.name);k.push("Message: "+a.message);a.hasOwnProperty("params")&&k.push("Error Params: "+JSON.stringify(a.params));a.hasOwnProperty("args")&&k.push("Error args: "+JSON.stringify(a.args));
k.push("File name: "+a.fileName);k.push("Stacktrace: "+a.stack);window.console.log(k.join("\n"),a)}if(!(5<=Cr)){var m=Fr,q=ve(a),r=q.message||"Unknown Error",w=q.name||"UnknownError",t=q.stack||a.j||"Not available";if(t.startsWith(w+": "+r)){var y=t.split("\n");y.shift();t=y.join("\n")}var E=q.lineNumber||"Not available",F=q.fileName||"Not available",O=t,N=0;if(a.hasOwnProperty("args")&&a.args&&a.args.length)for(var Q=0;Q<a.args.length&&!(N=yr(a.args[Q],"params."+Q,g,N),500<=N);Q++);else if(a.hasOwnProperty("params")&&
a.params){var ca=a.params;if("object"===typeof a.params)for(var U in ca){if(ca[U]){var lb="params."+U,Xa=Ar(ca[U]);g[lb]=Xa;N+=lb.length+Xa.length;if(500<N)break}}else g.params=Ar(ca)}if(m.length)for(var na=0;na<m.length&&!(N=yr(m[na],"params.context."+na,g,N),500<=N);na++);navigator.vendor&&!g.hasOwnProperty("vendor")&&(g["device.vendor"]=navigator.vendor);var H={message:r,name:w,lineNumber:E,fileName:F,stack:O,params:g,sampleWeight:1},la=Number(a.columnNumber);isNaN(la)||(H.lineNumber=H.lineNumber+
":"+la);if("IGNORED"===a.level)var fa=0;else a:{for(var we=ur(),xe=p(we.qa),pd=xe.next();!pd.done;pd=xe.next()){var pa=pd.value;if(H.message&&H.message.match(pa.sr)){fa=pa.weight;break a}}for(var ap=p(we.na),Qj=ap.next();!Qj.done;Qj=ap.next()){var bp=Qj.value;if(bp.callback(H)){fa=bp.weight;break a}}fa=1}H.sampleWeight=fa;for(var cp=p(pr),Rj=cp.next();!Rj.done;Rj=cp.next()){var Sj=Rj.value;if(Sj.ib[H.name])for(var dp=p(Sj.ib[H.name]),Tj=dp.next();!Tj.done;Tj=dp.next()){var ep=Tj.value,Ig=H.message.match(ep.regexp);
if(Ig){H.params["params.error.original"]=Ig[0];for(var Uj=ep.groups,fp={},qd=0;qd<Uj.length;qd++)fp[Uj[qd]]=Ig[qd+1],H.params["params.error."+Uj[qd]]=Ig[qd+1];H.message=Sj.Bb(fp);break}}}H.params||(H.params={});var gp=ur();H.params["params.errorServiceSignature"]="msg="+gp.qa.length+"&cb="+gp.na.length;H.params["params.serviceWorker"]="false";z.document&&z.document.querySelectorAll&&(H.params["params.fscripts"]=String(document.querySelectorAll("script:not([nonce])").length));Db("sample").constructor!==
Bb&&(H.params["params.fconst"]="true");window.yterr&&"function"===typeof window.yterr&&window.yterr(H);if(0!==H.sampleWeight&&!Br.has(H.message)){if("ERROR"===h){vr.va("handleError",H);if(M("record_app_crashed_web")&&0===Er&&1===H.sampleWeight)if(Er++,M("errors_via_jspb")){var Vj=new rj;D(Vj,1,1);if(!M("report_client_error_with_app_crash_ks")){var hp=new mj;D(hp,1,H.message);var ip=new nj;G(ip,mj,3,hp);var jp=new oj;G(jp,nj,5,ip);var kp=new pj;G(kp,oj,9,jp);G(Vj,pj,4,kp)}var lp=new Pj;be(lp,rj,20,
kk,Vj);hr(lp)}else{var mp={appCrashType:"APP_CRASH_TYPE_BREAKPAD"};M("report_client_error_with_app_crash_ks")||(mp.systemHealth={crashData:{clientError:{logMessage:{message:H.message}}}});cm("appCrashed",mp)}Dr++}else"WARNING"===h&&vr.va("handleWarning",H);if(M("kevlar_gel_error_routing"))a:{var ye=h;if(M("errors_via_jspb")){if(Jr())var op=void 0;else{var rd=new jj;D(rd,1,H.stack);H.fileName&&D(rd,4,H.fileName);var Gb=H.lineNumber&&H.lineNumber.split?H.lineNumber.split(":"):[];0!==Gb.length&&(1!==
Gb.length||isNaN(Number(Gb[0]))?2!==Gb.length||isNaN(Number(Gb[0]))||isNaN(Number(Gb[1]))||(D(rd,2,Number(Gb[0])),D(rd,3,Number(Gb[1]))):D(rd,2,Number(Gb[0])));var xc=new mj;D(xc,1,H.message);D(xc,3,H.name);D(xc,6,H.sampleWeight);"ERROR"===ye?D(xc,2,2):"WARNING"===ye?D(xc,2,1):D(xc,2,0);var Wj=new kj;D(Wj,1,!0);be(Wj,jj,3,lj,rd);var Yb=new gj;D(Yb,3,window.location.href);for(var pp=L("FEXP_EXPERIMENTS",[]),Xj=0;Xj<pp.length;Xj++){var Gv=pp[Xj];Ld(Yb);Vd(Yb,5,2,!1).push(Gv)}var Yj=L("LATEST_ECATCHER_SERVICE_TRACKING_PARAMS");
if(!Ck()&&Yj)for(var qp=p(Object.keys(Yj)),yc=qp.next();!yc.done;yc=qp.next()){var rp=yc.value,Zj=new ij;D(Zj,1,rp);Zj.setValue(String(Yj[rp]));de(Yb,4,ij,Zj)}var ak=H.params;if(ak){var sp=p(Object.keys(ak));for(yc=sp.next();!yc.done;yc=sp.next()){var tp=yc.value,bk=new ij;D(bk,1,"client."+tp);bk.setValue(String(ak[tp]));de(Yb,4,ij,bk)}}var up=L("SERVER_NAME"),vp=L("SERVER_VERSION");if(up&&vp){var ck=new ij;D(ck,1,"server.name");ck.setValue(up);de(Yb,4,ij,ck);var dk=new ij;D(dk,1,"server.version");
dk.setValue(vp);de(Yb,4,ij,dk)}var Jg=new nj;G(Jg,gj,1,Yb);G(Jg,kj,2,Wj);G(Jg,mj,3,xc);op=Jg}var wp=op;if(!wp)break a;var xp=new Pj;be(xp,nj,163,kk,wp);hr(xp)}else{if(Jr())var yp=void 0;else{var ze={stackTrace:H.stack};H.fileName&&(ze.filename=H.fileName);var Hb=H.lineNumber&&H.lineNumber.split?H.lineNumber.split(":"):[];0!==Hb.length&&(1!==Hb.length||isNaN(Number(Hb[0]))?2!==Hb.length||isNaN(Number(Hb[0]))||isNaN(Number(Hb[1]))||(ze.lineNumber=Number(Hb[0]),ze.columnNumber=Number(Hb[1])):ze.lineNumber=
Number(Hb[0]));var ek={level:"ERROR_LEVEL_UNKNOWN",message:H.message,errorClassName:H.name,sampleWeight:H.sampleWeight};"ERROR"===ye?ek.level="ERROR_LEVEL_ERROR":"WARNING"===ye&&(ek.level="ERROR_LEVEL_WARNNING");var Hv={isObfuscated:!0,browserStackInfo:ze},sd={pageUrl:window.location.href,kvPairs:[]};L("FEXP_EXPERIMENTS")&&(sd.experimentIds=L("FEXP_EXPERIMENTS"));var fk=L("LATEST_ECATCHER_SERVICE_TRACKING_PARAMS");if(!Ck()&&fk)for(var zp=p(Object.keys(fk)),zc=zp.next();!zc.done;zc=zp.next()){var Ap=
zc.value;sd.kvPairs.push({key:Ap,value:String(fk[Ap])})}var gk=H.params;if(gk){var Bp=p(Object.keys(gk));for(zc=Bp.next();!zc.done;zc=Bp.next()){var Cp=zc.value;sd.kvPairs.push({key:"client."+Cp,value:String(gk[Cp])})}}var Dp=L("SERVER_NAME"),Ep=L("SERVER_VERSION");Dp&&Ep&&(sd.kvPairs.push({key:"server.name",value:Dp}),sd.kvPairs.push({key:"server.version",value:Ep}));yp={errorMetadata:sd,stackTrace:Hv,logMessage:ek}}var Fp=yp;if(!Fp)break a;cm("clientError",Fp)}if("ERROR"===ye||M("errors_flush_gel_always_killswitch"))b:if(M("migrate_events_to_ts"))c:{if(M("web_fp_via_jspb")&&
(dr(!0),!M("web_fp_via_jspb_and_json")))break c;dr()}else{if(M("web_fp_via_jspb")&&(dr(!0),!M("web_fp_via_jspb_and_json")))break b;dr()}}if(!M("suppress_error_204_logging")){var Ae=H.params||{},Zb={urlParams:{a:"logerror",t:"jserror",type:H.name,msg:H.message.substr(0,250),line:H.lineNumber,level:h,"client.name":Ae.name},postParams:{url:L("PAGE_NAME",window.location.href),file:H.fileName},method:"POST"};Ae.version&&(Zb["client.version"]=Ae.version);if(Zb.postParams){H.stack&&(Zb.postParams.stack=
H.stack);for(var Gp=p(Object.keys(Ae)),hk=Gp.next();!hk.done;hk=Gp.next()){var Hp=hk.value;Zb.postParams["client."+Hp]=Ae[Hp]}var ik=L("LATEST_ECATCHER_SERVICE_TRACKING_PARAMS");if(ik)for(var Ip=p(Object.keys(ik)),jk=Ip.next();!jk.done;jk=Ip.next()){var Jp=jk.value;Zb.postParams[Jp]=ik[Jp]}var Kp=L("SERVER_NAME"),Lp=L("SERVER_VERSION");Kp&&Lp&&(Zb.postParams["server.name"]=Kp,Zb.postParams["server.version"]=Lp)}jl(L("ECATCHER_REPORT_HOST","")+"/error_204",Zb)}try{Br.add(H.message)}catch(jx){}Cr++}}}}
function Jr(){for(var a=p(Gr),b=a.next();!b.done;b=a.next())if(Tl(b.value.toLowerCase()))return!0;return!1}
function Kr(a){var b=Ja.apply(1,arguments);a.args||(a.args=[]);a.args.push.apply(a.args,ia(b))}
;function Lr(){this.register=new Map}
function Mr(a){a=p(a.register.values());for(var b=a.next();!b.done;b=a.next())b.value.vr("ABORTED")}
Lr.prototype.clear=function(){Mr(this);this.register.clear()};
var Nr=new Lr;var Or=Date.now().toString();
function Pr(){a:{if(window.crypto&&window.crypto.getRandomValues)try{var a=Array(16),b=new Uint8Array(16);window.crypto.getRandomValues(b);for(var c=0;c<a.length;c++)a[c]=b[c];var d=a;break a}catch(e){}d=Array(16);for(a=0;16>a;a++){b=Date.now();for(c=0;c<b%23;c++)d[a]=Math.random();d[a]=Math.floor(256*Math.random())}if(Or)for(a=1,b=0;b<Or.length;b++)d[a%16]=d[a%16]^d[(a-1)%16]/4^Or.charCodeAt(b),a++}a=[];for(b=0;b<d.length;b++)a.push("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(d[b]&63));
return a.join("")}
;var Qr=z.ytLoggingDocDocumentNonce_;Qr||(Qr=Pr(),A("ytLoggingDocDocumentNonce_",Qr));var Rr=Qr;var Sr={Zh:0,te:1,Ee:2,Wl:3,bi:4,uq:5,Mm:6,zo:7,Rn:8,no:9,0:"DEFAULT",1:"CHAT",2:"CONVERSATIONS",3:"MINIPLAYER",4:"DIALOG",5:"VOZ",6:"MUSIC_WATCH_TABS",7:"SHARE",8:"PUSH_NOTIFICATIONS",9:"RICH_GRID_WATCH"};function Tr(a){this.G=a}
function Ur(a){return new Tr({trackingParams:a})}
Tr.prototype.getAsJson=function(){var a={};void 0!==this.G.trackingParams?a.trackingParams=this.G.trackingParams:(a.veType=this.G.veType,void 0!==this.G.veCounter&&(a.veCounter=this.G.veCounter),void 0!==this.G.elementIndex&&(a.elementIndex=this.G.elementIndex));void 0!==this.G.dataElement&&(a.dataElement=this.G.dataElement.getAsJson());void 0!==this.G.youtubeData&&(a.youtubeData=this.G.youtubeData);return a};
Tr.prototype.getAsJspb=function(){var a=new tj;if(void 0!==this.G.trackingParams){var b=this.G.trackingParams;if(null!=b)if("string"===typeof b)b=b?new nd(b,kd):od();else if(b.constructor!==nd)if(jd(b))b=b.length?new nd(new Uint8Array(b),kd):od();else throw Error();D(a,1,b)}else void 0!==this.G.veType&&D(a,2,this.G.veType),void 0!==this.G.veCounter&&D(a,6,this.G.veCounter),void 0!==this.G.elementIndex&&D(a,3,this.G.elementIndex);void 0!==this.G.dataElement&&(b=this.G.dataElement.getAsJspb(),G(a,tj,
7,b));void 0!==this.G.youtubeData&&G(a,Ki,8,this.G.jspbYoutubeData);return a};
Tr.prototype.toString=function(){return JSON.stringify(this.getAsJson())};
Tr.prototype.isClientVe=function(){return!this.G.trackingParams&&!!this.G.veType};function Vr(a){a=void 0===a?0:a;return 0===a?"client-screen-nonce":"client-screen-nonce."+a}
function Wr(a){a=void 0===a?0:a;return 0===a?"ROOT_VE_TYPE":"ROOT_VE_TYPE."+a}
function Xr(a){return L(Wr(void 0===a?0:a))}
A("yt_logging_screen.getRootVeType",Xr);function Yr(a){return(a=Xr(void 0===a?0:a))?new Tr({veType:a,youtubeData:void 0,jspbYoutubeData:void 0}):null}
function Zr(){var a=L("csn-to-ctt-auth-info");a||(a={},Bk("csn-to-ctt-auth-info",a));return a}
function $r(a){a=L(Vr(void 0===a?0:a));if(!a&&!L("USE_CSN_FALLBACK",!0))return null;a||(a="UNDEFINED_CSN");return a?a:null}
A("yt_logging_screen.getCurrentCsn",$r);function as(a,b,c){var d=Zr();(c=$r(c))&&delete d[c];b&&(d[a]=b)}
function bs(a){return Zr()[a]}
A("yt_logging_screen.getCttAuthInfo",bs);
function cs(a,b,c,d){c=void 0===c?0:c;if(a!==L(Vr(c))||b!==L(Wr(c)))if(as(a,d,c),Bk(Vr(c),a),Bk(Wr(c),b),b=function(){setTimeout(function(){if(a)if(M("web_time_via_jspb")){var e=new uj;D(e,1,Rr);D(e,2,a);M("use_default_heartbeat_client")?or(e):or(e,void 0,Mp)}else e={clientDocumentNonce:Rr,clientScreenNonce:a},M("use_default_heartbeat_client")?cm("foregroundHeartbeatScreenAssociated",e):br("foregroundHeartbeatScreenAssociated",e,Mp)},0)},"requestAnimationFrame"in window)try{window.requestAnimationFrame(b)}catch(e){b()}else b()}
A("yt_logging_screen.setCurrentScreen",cs);var ds=window.yt&&window.yt.msgs_||window.ytcfg&&window.ytcfg.msgs||{};A("yt.msgs_",ds);function es(a){wk(ds,arguments)}
;var fs={se:3611,Dd:27686,Ed:85013,Fd:23462,Hd:157557,Id:42016,Jd:62407,Kd:26926,Gd:43781,Ld:51236,Md:79148,Nd:50160,Od:77504,ae:153587,be:87907,ce:18630,de:54445,ee:80935,ge:152172,he:105675,ie:150723,je:37521,ke:147285,le:47786,me:98349,ne:123695,oe:6827,pe:29434,qe:7282,re:124448,we:32276,ue:76278,xe:147868,ye:147869,ze:93911,Ae:106531,Be:27259,Ce:27262,De:27263,Fe:21759,Ge:27107,He:62936,Ie:160866,Je:49568,Ke:160789,Le:38408,Me:80637,Ne:68727,Oe:68728,Pe:80353,Qe:80356,Re:74610,Se:45707,Te:83962,
Ue:83970,Ve:46713,We:89711,Xe:74612,Ye:155792,Ze:93265,af:74611,bf:131380,df:128979,ef:139311,ff:128978,cf:131391,gf:105350,jf:139312,kf:134800,hf:131392,mf:113533,nf:93252,pf:99357,rf:94521,sf:114252,tf:113532,uf:94522,qf:94583,vf:88E3,wf:139580,xf:93253,yf:93254,zf:94387,Af:94388,Bf:93255,Cf:97424,lf:72502,Df:110111,Ef:76019,Gf:117092,Hf:117093,Ff:89431,If:110466,Jf:77240,Kf:60508,Lf:148123,Mf:148124,Nf:137401,Of:137402,Pf:137046,Qf:73393,Rf:113534,Sf:92098,Tf:131381,Uf:84517,Vf:83759,Wf:162711,
Xf:162712,Yf:80357,Zf:86113,ag:72598,cg:72733,dg:107349,eg:124275,fg:118203,gg:133275,hg:160157,ig:152569,jg:156651,kg:133274,lg:160159,mg:160158,ng:133272,og:133273,pg:133276,qg:144507,rg:143247,sg:156652,tg:143248,ug:143249,vg:143250,wg:143251,xg:156653,yg:144401,Ag:117431,zg:133797,Bg:153964,Cg:128572,Dg:133405,Eg:117429,Fg:117430,Gg:117432,Hg:120080,Ig:117259,Jg:156655,Kg:156654,Lg:121692,Mg:145656,Ng:156656,Og:145655,Pg:145653,Qg:145654,Rg:145657,Sg:132972,Tg:133051,Ug:133658,Vg:132971,Wg:97615,
Yg:143359,Xg:143356,ah:143361,Zg:143358,dh:143360,bh:143357,eh:142303,fh:143353,gh:143354,hh:144479,ih:143355,jh:31402,lh:133624,mh:146477,nh:133623,oh:133622,kh:133621,ph:84774,rh:160801,qh:95117,sh:150497,th:98930,uh:98931,vh:98932,wh:153320,xh:153321,yh:43347,zh:129889,Ah:149123,Bh:45474,Ch:100352,Dh:84758,Eh:98443,Fh:117985,Gh:74613,Hh:155911,Ih:74614,Jh:64502,Kh:136032,Lh:74615,Mh:74616,Nh:122224,Oh:74617,Ph:77820,Qh:74618,Rh:93278,Sh:93274,Th:93275,Uh:93276,Vh:22110,Wh:29433,Xh:133798,Yh:132295,
ai:120541,ci:82047,di:113550,fi:75836,gi:75837,hi:42352,ii:84512,ji:76065,ki:75989,ri:51879,si:16623,ti:32594,vi:27240,wi:32633,xi:74858,yi:156999,Ai:3945,zi:16989,Bi:45520,Ci:25488,Di:25492,Ei:25494,Fi:55760,Gi:14057,Hi:18451,Ii:57204,Ji:57203,Ki:17897,Li:57205,Mi:18198,Ni:17898,Oi:17909,Pi:43980,Qi:46220,Ri:11721,Si:147994,Ti:49954,Ui:96369,Vi:3854,Wi:151633,Xi:56251,Yi:159108,Zi:25624,aj:152036,rj:16906,sj:99999,tj:68172,uj:27068,vj:47973,wj:72773,xj:26970,yj:26971,zj:96805,Aj:17752,Bj:73233,Cj:109512,
Dj:22256,Ej:14115,Fj:22696,Gj:89278,Hj:89277,Ij:109513,Jj:43278,Kj:43459,Lj:43464,Mj:89279,Nj:43717,Oj:55764,Pj:22255,Qj:147912,Rj:89281,Sj:40963,Tj:43277,Uj:43442,Vj:91824,Wj:120137,Xj:96367,Yj:36850,Zj:72694,ak:37414,bk:36851,dk:124863,ck:121343,ek:73491,fk:54473,gk:43375,hk:46674,ik:143815,jk:139095,kk:144402,lk:149968,mk:149969,nk:32473,pk:72901,qk:72906,rk:50947,sk:50612,tk:50613,uk:50942,vk:84938,wk:84943,xk:84939,yk:84941,zk:84944,Ak:84940,Bk:84942,Ck:35585,Dk:51926,Ek:79983,Fk:63238,Gk:18921,
Hk:63241,Ik:57893,Jk:41182,Kk:135732,Lk:33424,Mk:22207,Nk:42993,Ok:36229,Pk:22206,Qk:22205,Rk:18993,Sk:19001,Tk:18990,Uk:18991,Vk:18997,Wk:18725,Xk:19003,Yk:36874,Zk:44763,al:33427,bl:67793,dl:22182,fl:37091,il:34650,jl:50617,kl:47261,ll:22287,ml:25144,nl:97917,ol:62397,pl:150871,ql:150874,rl:125598,sl:137935,ul:36961,vl:108035,wl:27426,xl:27857,yl:27846,zl:27854,Al:69692,Bl:61411,Cl:39299,Dl:38696,El:62520,Fl:36382,Gl:108701,Hl:50663,Il:36387,Jl:14908,Kl:37533,Ll:105443,Ml:61635,Nl:62274,Ol:161670,
Pl:133818,Ql:65702,Rl:65703,Sl:65701,Tl:76256,Ul:37671,Vl:49953,Xl:36216,Yl:28237,Zl:39553,am:29222,bm:26107,cm:38050,dm:26108,fm:120745,em:26109,gm:26110,hm:66881,im:28236,jm:14586,km:160598,lm:57929,mm:74723,nm:44098,om:44099,rm:23528,sm:61699,pm:134104,qm:134103,tm:59149,um:101951,vm:97346,wm:118051,xm:95102,ym:64882,zm:119505,Am:63595,Bm:63349,Cm:95101,Dm:75240,Em:27039,Fm:68823,Gm:21537,Hm:83464,Im:75707,Jm:83113,Km:101952,Lm:101953,Nm:79610,Om:125755,Pm:24402,Qm:24400,Rm:32925,Tm:57173,Sm:156421,
Um:122502,Vm:145268,Wm:138480,Xm:64423,Ym:64424,Zm:33986,an:100828,bn:129089,cn:21409,gn:135155,hn:135156,jn:135157,kn:135158,ln:158225,mn:135159,nn:135160,pn:135161,rn:135162,sn:135163,qn:158226,tn:158227,un:135164,vn:135165,wn:135166,dn:11070,en:11074,fn:17880,xn:14001,zn:30709,An:30707,Bn:30711,Cn:30710,Dn:30708,yn:26984,En:146143,Fn:63648,Gn:63649,Hn:111059,In:5754,Jn:20445,Kn:151308,Ln:151152,Nn:130975,Mn:130976,On:110386,Pn:113746,Qn:66557,Sn:17310,Tn:28631,Un:21589,Vn:154946,Wn:68012,Xn:162617,
Yn:60480,Zn:138664,ao:141121,bo:31571,co:141978,eo:150105,fo:150106,ho:150107,jo:150108,ko:76980,lo:41577,mo:45469,oo:38669,po:13768,qo:13777,ro:141842,so:62985,to:4724,uo:59369,vo:43927,wo:43928,xo:12924,yo:100355,Bo:56219,Co:27669,Do:10337,Ao:47896,Eo:122629,Go:139723,Fo:139722,Ho:121258,Io:107598,Jo:127991,Ko:96639,Lo:107536,Mo:130169,No:96661,Oo:145188,Po:96658,Qo:116646,Ro:159428,So:121122,To:96660,Uo:127738,Vo:127083,Wo:155281,Xo:162959,Yo:163566,Zo:147842,ap:104443,bp:96659,cp:147595,ep:106442,
fp:162776,gp:134840,hp:63667,ip:63668,jp:63669,kp:130686,lp:147036,mp:78314,np:147799,qp:148649,rp:55761,sp:127098,tp:134841,up:96368,vp:67374,wp:48992,xp:146176,yp:49956,zp:31961,Ap:26388,Bp:23811,Cp:5E4,Dp:126250,Ep:96370,Fp:47355,Gp:47356,Hp:37935,Ip:45521,Jp:21760,Kp:83769,Lp:49977,Mp:49974,Np:93497,Op:93498,Pp:34325,Qp:140759,Rp:115803,Sp:123707,Tp:100081,Up:35309,Vp:68314,Wp:25602,Xp:100339,Yp:143516,Zp:59018,aq:18248,bq:50625,cq:9729,fq:37168,gq:37169,hq:21667,iq:16749,jq:18635,kq:39305,lq:18046,
mq:53969,nq:8213,oq:93926,pq:102852,qq:110099,rq:22678,sq:69076,tq:137575,wq:139224,xq:100856,yq:154430,zq:17736,Aq:3832,Bq:147111,Cq:55759,Dq:64031,Jq:93044,Kq:93045,Lq:34388,Mq:17657,Nq:17655,Oq:39579,Pq:39578,Qq:77448,Rq:8196,Sq:11357,Tq:69877,Uq:8197,Vq:156512,Wq:161613,Xq:156509,Yq:161612,Zq:161614,br:82039};function gs(){var a=vb(hs),b;return(new yf(function(c,d){a.onSuccess=function(e){cl(e)?c(new is(e)):d(new js("Request failed, status="+(e&&"status"in e?e.status:-1),"net.badstatus",e))};
a.onError=function(e){d(new js("Unknown request error","net.unknown",e))};
a.onTimeout=function(e){d(new js("Request timed out","net.timeout",e))};
b=jl("//googleads.g.doubleclick.net/pagead/id",a)})).nb(function(c){c instanceof Ff&&b.abort();
return Df(c)})}
function js(a,b,c){ab.call(this,a+", errorCode="+b);this.errorCode=b;this.xhr=c;this.name="PromiseAjaxError"}
u(js,ab);function is(a){this.xhr=a}
;function ks(){this.i=0;this.da=null}
ks.prototype.then=function(a,b,c){return 1===this.i&&a?(a=a.call(c,this.da))&&"function"===typeof a.then?a:ls(a):2===this.i&&b?(a=b.call(c,this.da))&&"function"===typeof a.then?a:ms(a):this};
ks.prototype.getValue=function(){return this.da};
ks.prototype.$goog_Thenable=!0;function ms(a){var b=new ks;a=void 0===a?null:a;b.i=2;b.da=void 0===a?null:a;return b}
function ls(a){var b=new ks;a=void 0===a?null:a;b.i=1;b.da=void 0===a?null:a;return b}
;function ns(a,b){if(a)return a[b.name]}
;function os(a,b){var c=void 0===c?{}:c;a={method:void 0===b?"POST":b,mode:Yk(a)?"same-origin":"cors",credentials:Yk(a)?"same-origin":"include"};b={};for(var d=p(Object.keys(c)),e=d.next();!e.done;e=d.next())e=e.value,c[e]&&(b[e]=c[e]);0<Object.keys(b).length&&(a.headers=b);return a}
;function ps(){return sg()||Sl&&Tl("applewebkit")&&!Tl("version")&&(!Tl("safari")||Tl("gsa/"))||Pc&&Tl("version/")?!0:L("EOM_VISITOR_DATA")?!1:!0}
;function qs(a){a:{var b=a.raw_embedded_player_response;if(!b&&(a=a.embedded_player_response))try{b=JSON.parse(a)}catch(d){b="EMBEDDED_PLAYER_MODE_UNKNOWN";break a}if(b)b:{for(var c in dj)if(dj[c]==b.embeddedPlayerMode){b=dj[c];break b}b="EMBEDDED_PLAYER_MODE_UNKNOWN"}else b="EMBEDDED_PLAYER_MODE_UNKNOWN"}return"EMBEDDED_PLAYER_MODE_PFL"===b}
;function rs(a){ab.call(this,a.message||a.description||a.name);this.isMissing=a instanceof ss;this.isTimeout=a instanceof js&&"net.timeout"==a.errorCode;this.isCanceled=a instanceof Ff}
u(rs,ab);rs.prototype.name="BiscottiError";function ss(){ab.call(this,"Biscotti ID is missing from server")}
u(ss,ab);ss.prototype.name="BiscottiMissingError";var hs={format:"RAW",method:"GET",timeout:5E3,withCredentials:!0},ts=null;function us(){if(M("disable_biscotti_fetch_entirely_for_all_web_clients"))return Error("Biscotti id fetching has been disabled entirely.");if(!ps())return Error("User has not consented - not fetching biscotti id.");var a=L("PLAYER_VARS",{});if("1"==tb(a))return Error("Biscotti ID is not available in private embed mode");if(qs(a))return Error("Biscotti id fetching has been disabled for pfl.")}
function Nk(){var a=us();if(void 0!==a)return Df(a);ts||(ts=gs().then(vs).nb(function(b){return ws(2,b)}));
return ts}
function vs(a){a=a.xhr.responseText;if(0!=a.lastIndexOf(")]}'",0))throw new ss;a=JSON.parse(a.substr(4));if(1<(a.type||1))throw new ss;a=a.id;Ok(a);ts=ls(a);xs(18E5,2);return a}
function ws(a,b){b=new rs(b);Ok("");ts=ms(b);0<a&&xs(12E4,a-1);throw b;}
function xs(a,b){dl(function(){gs().then(vs,function(c){return ws(b,c)}).nb(cb)},a)}
function ys(){try{var a=B("yt.ads.biscotti.getId_");return a?a():Nk()}catch(b){return Df(b)}}
;function zs(a){if("1"!=tb(L("PLAYER_VARS",{}))){a&&Mk();try{ys().then(function(){},function(){}),dl(zs,18E5)}catch(b){Kk(b)}}}
;function As(){this.wd=!0}
function Bs(a){var b={},c=ug([]);c&&(b.Authorization=c,c=a=null==a?void 0:a.sessionIndex,void 0===c&&(c=Number(L("SESSION_INDEX",0)),c=isNaN(c)?0:c),M("voice_search_auth_header_removal")||(b["X-Goog-AuthUser"]=c),"INNERTUBE_HOST_OVERRIDE"in Ak||(b["X-Origin"]=window.location.origin),void 0===a&&"DELEGATED_SESSION_ID"in Ak&&(b["X-Goog-PageId"]=L("DELEGATED_SESSION_ID")));return b}
;var Cs={identityType:"UNAUTHENTICATED_IDENTITY_TYPE_UNKNOWN"};var Ds=new Map([["dark","USER_INTERFACE_THEME_DARK"],["light","USER_INTERFACE_THEME_LIGHT"]]);function Es(){var a=void 0===a?window.location.href:a;if(M("kevlar_disable_theme_param"))return null;mc(nc(5,a));try{var b=Wk(a).theme;return Ds.get(b)||null}catch(c){}return null}
;function Fs(){this.i={};if(this.j=vl()){var a=qg.get("CONSISTENCY",void 0);a&&Gs(this,{encryptedTokenJarContents:a})}}
Fs.prototype.handleResponse=function(a,b){if(!b)throw Error("request needs to be passed into ConsistencyService");var c,d;b=(null==(c=b.ia.context)?void 0:null==(d=c.request)?void 0:d.consistencyTokenJars)||[];var e;if(a=null==(e=a.responseContext)?void 0:e.consistencyTokenJar){e=p(b);for(c=e.next();!c.done;c=e.next())delete this.i[c.value.encryptedTokenJarContents];Gs(this,a)}};
function Gs(a,b){if(b.encryptedTokenJarContents&&(a.i[b.encryptedTokenJarContents]=b,"string"===typeof b.expirationSeconds)){var c=Number(b.expirationSeconds);setTimeout(function(){delete a.i[b.encryptedTokenJarContents]},1E3*c);
a.j&&tl("CONSISTENCY",b.encryptedTokenJarContents,c,void 0,!0)}}
;var Hs=window.location.hostname.split(".").slice(-2).join(".");function Is(){var a=L("LOCATION_PLAYABILITY_TOKEN");"TVHTML5"===L("INNERTUBE_CLIENT_NAME")&&(this.i=Js(this))&&(a=this.i.get("yt-location-playability-token"));a&&(this.locationPlayabilityToken=a,this.j=void 0)}
var Ks;Is.getInstance=function(){Ks=B("yt.clientLocationService.instance");Ks||(Ks=new Is,A("yt.clientLocationService.instance",Ks));return Ks};
l=Is.prototype;l.setLocationOnInnerTubeContext=function(a){a.client||(a.client={});this.j?(a.client.locationInfo||(a.client.locationInfo={}),a.client.locationInfo.latitudeE7=Math.floor(1E7*this.j.coords.latitude),a.client.locationInfo.longitudeE7=Math.floor(1E7*this.j.coords.longitude),a.client.locationInfo.horizontalAccuracyMeters=Math.round(this.j.coords.accuracy),a.client.locationInfo.forceLocationPlayabilityTokenRefresh=!0):this.locationPlayabilityToken&&(a.client.locationPlayabilityToken=this.locationPlayabilityToken)};
l.handleResponse=function(a){var b;a=null==(b=a.responseContext)?void 0:b.locationPlayabilityToken;void 0!==a&&(this.locationPlayabilityToken=a,this.j=void 0,"TVHTML5"===L("INNERTUBE_CLIENT_NAME")?(this.i=Js(this))&&this.i.set("yt-location-playability-token",a,15552E3):tl("YT_CL",JSON.stringify({loctok:a}),15552E3,Hs,!0))};
function Js(a){return void 0===a.i?new Ul("yt-client-location"):a.i}
l.clearLocationPlayabilityToken=function(a){"TVHTML5"===a?(this.i=Js(this))&&this.i.remove("yt-location-playability-token"):ul("YT_CL")};
l.getCurrentPositionFromGeolocation=function(){var a=this;if(!(navigator&&navigator.geolocation&&navigator.geolocation.getCurrentPosition))return Promise.reject(Error("Geolocation unsupported"));var b=!1,c=1E4;"MWEB"===L("INNERTUBE_CLIENT_NAME")&&(b=!0,c=15E3);return new Promise(function(d,e){navigator.geolocation.getCurrentPosition(function(f){a.j=f;d(f)},function(f){e(f)},{enableHighAccuracy:b,
maximumAge:0,timeout:c})})};
l.createUnpluggedLocationInfo=function(a){var b={};a=a.coords;if(null==a?0:a.latitude)b.latitudeE7=Math.floor(1E7*a.latitude);if(null==a?0:a.longitude)b.longitudeE7=Math.floor(1E7*a.longitude);if(null==a?0:a.accuracy)b.locationRadiusMeters=Math.round(a.accuracy);return b};function Ls(a,b){var c,d=null==(c=ns(a,cj))?void 0:c.signal;if(d&&b.Pa&&(c=b.Pa[d]))return c();var e;if((c=null==(e=ns(a,aj))?void 0:e.request)&&b.Nc&&(e=b.Nc[c]))return e();for(var f in a)if(b.Ub[f]&&(a=b.Ub[f]))return a()}
;var Ms=Symbol("injectionDeps");function Ns(a){this.name=a}
Ns.prototype.toString=function(){return"InjectionToken("+this.name+")"};
function Os(){this.key=Ps}
function Qs(){this.providers=new Map;this.i=new Map}
Qs.prototype.resolve=function(a){return a instanceof Os?Rs(this,a.key,[],!0):Rs(this,a,[])};
function Rs(a,b,c,d){d=void 0===d?!1:d;if(-1<c.indexOf(b))throw Error("Deps cycle for: "+b);if(a.i.has(b))return a.i.get(b);if(!a.providers.has(b)){if(d)return;throw Error("No provider for: "+b);}d=a.providers.get(b);c.push(b);if(d.zc)var e=d.zc;else if(d.Cd)e=d[Ms]?Ss(a,d[Ms],c):[],e=d.Cd.apply(d,ia(e));else if(d.yc){e=d.yc;var f=e[Ms]?Ss(a,e[Ms],c):[];e=new (Function.prototype.bind.apply(e,[null].concat(ia(f))))}else throw Error("Could not resolve providers for: "+b);c.pop();d.Ar||a.i.set(b,e);
return e}
function Ss(a,b,c){return b?b.map(function(d){return d instanceof Os?Rs(a,d.key,c,!0):Rs(a,d,c)}):[]}
;var Ts;function Us(){Ts||(Ts=new Qs);return Ts}
;function Vs(a){return function(){return new a}}
;var Ws={},Xs=(Ws.WEB_UNPLUGGED="^unplugged/",Ws.WEB_UNPLUGGED_ONBOARDING="^unplugged/",Ws.WEB_UNPLUGGED_OPS="^unplugged/",Ws.WEB_UNPLUGGED_PUBLIC="^unplugged/",Ws.WEB_CREATOR="^creator/",Ws.WEB_KIDS="^kids/",Ws.WEB_EXPERIMENTS="^experiments/",Ws.WEB_MUSIC="^music/",Ws.WEB_REMIX="^music/",Ws.WEB_MUSIC_EMBEDDED_PLAYER="^music/",Ws.WEB_MUSIC_EMBEDDED_PLAYER="^main_app/|^sfv/",Ws);
function Ys(a){var b=void 0===b?"UNKNOWN_INTERFACE":b;if(1===a.length)return a[0];var c=Xs[b];if(c){var d=new RegExp(c),e=p(a);for(c=e.next();!c.done;c=e.next())if(c=c.value,d.exec(c))return c}var f=[];Object.entries(Xs).forEach(function(g){var h=p(g);g=h.next().value;h=h.next().value;b!==g&&f.push(h)});
d=new RegExp(f.join("|"));a.sort(function(g,h){return g.length-h.length});
e=p(a);for(c=e.next();!c.done;c=e.next())if(c=c.value,!d.exec(c))return c;return a[0]}
;function Zs(){}
Zs.prototype.o=function(a,b,c){b=void 0===b?{}:b;c=void 0===c?Cs:c;var d=a.clickTrackingParams,e=this.m,f=!1;f=void 0===f?!1:f;e=void 0===e?!1:e;var g=L("INNERTUBE_CONTEXT");if(g){g=wb(g);M("web_no_tracking_params_in_shell_killswitch")||delete g.clickTracking;g.client||(g.client={});var h=g.client;"MWEB"===h.clientName&&(h.clientFormFactor=L("IS_TABLET")?"LARGE_FORM_FACTOR":"SMALL_FORM_FACTOR");h.screenWidthPoints=window.innerWidth;h.screenHeightPoints=window.innerHeight;h.screenPixelDensity=Math.round(window.devicePixelRatio||
1);h.screenDensityFloat=window.devicePixelRatio||1;h.utcOffsetMinutes=-Math.floor((new Date).getTimezoneOffset());var k=void 0===k?!1:k;xl.getInstance();var m="USER_INTERFACE_THEME_LIGHT";Al(165)?m="USER_INTERFACE_THEME_DARK":Al(174)?m="USER_INTERFACE_THEME_LIGHT":!M("kevlar_legacy_browsers")&&window.matchMedia&&window.matchMedia("(prefers-color-scheme)").matches&&window.matchMedia("(prefers-color-scheme: dark)").matches&&(m="USER_INTERFACE_THEME_DARK");k=k?m:Es()||m;h.userInterfaceTheme=k;if(!f){if(k=
Hl())h.connectionType=k;M("web_log_effective_connection_type")&&(k=Il())&&(g.client.effectiveConnectionType=k)}var q;if(M("web_log_memory_total_kbytes")&&(null==(q=z.navigator)?0:q.deviceMemory)){var r;q=null==(r=z.navigator)?void 0:r.deviceMemory;g.client.memoryTotalKbytes=""+1E6*q}r=Wk(z.location.href);!M("web_populate_internal_geo_killswitch")&&r.internalcountrycode&&(h.internalGeo=r.internalcountrycode);"MWEB"===h.clientName||"WEB"===h.clientName?(h.mainAppWebInfo={graftUrl:z.location.href},M("kevlar_woffle")&&
rl.i&&(r=rl.i,h.mainAppWebInfo.pwaInstallabilityStatus=!r.i&&r.j?"PWA_INSTALLABILITY_STATUS_CAN_BE_INSTALLED":"PWA_INSTALLABILITY_STATUS_UNKNOWN"),h.mainAppWebInfo.webDisplayMode=sl(),h.mainAppWebInfo.isWebNativeShareAvailable=navigator&&void 0!==navigator.share):"TVHTML5"===h.clientName&&(!M("web_lr_app_quality_killswitch")&&(r=L("LIVING_ROOM_APP_QUALITY"))&&(h.tvAppInfo=Object.assign(h.tvAppInfo||{},{appQuality:r})),r=L("LIVING_ROOM_CERTIFICATION_SCOPE"))&&(h.tvAppInfo=Object.assign(h.tvAppInfo||
{},{certificationScope:r}));if(!M("web_populate_time_zone_itc_killswitch")){b:{if("undefined"!==typeof Intl)try{var w=(new Intl.DateTimeFormat).resolvedOptions().timeZone;break b}catch(lb){}w=void 0}w&&(h.timeZone=w)}(w=Fk())?h.experimentsToken=w:delete h.experimentsToken;w=Gk();Fs.i||(Fs.i=new Fs);h=Fs.i.i;r=[];q=0;for(var t in h)r[q++]=h[t];g.request=Object.assign({},g.request,{internalExperimentFlags:w,consistencyTokenJars:r});!M("web_prequest_context_killswitch")&&(t=L("INNERTUBE_CONTEXT_PREQUEST_CONTEXT"))&&
(g.request.externalPrequestContext=t);w=xl.getInstance();t=Al(58);w=w.get("gsml","");g.user=Object.assign({},g.user);t&&(g.user.enableSafetyMode=t);w&&(g.user.lockedSafetyMode=!0);M("warm_op_csn_cleanup")?e&&(f=$r())&&(g.clientScreenNonce=f):!f&&(f=$r())&&(g.clientScreenNonce=f);d&&(g.clickTracking={clickTrackingParams:d});if(d=B("yt.mdx.remote.remoteClient_"))g.remoteClient=d;Is.getInstance().setLocationOnInnerTubeContext(g);try{var y=Zk(),E=y.bid;delete y.bid;g.adSignalsInfo={params:[],bid:E};var F=
p(Object.entries(y));for(var O=F.next();!O.done;O=F.next()){var N=p(O.value),Q=N.next().value,ca=N.next().value;y=Q;E=ca;d=void 0;null==(d=g.adSignalsInfo.params)||d.push({key:y,value:""+E})}}catch(lb){Hr(lb)}F=g}else Hr(Error("Error: No InnerTubeContext shell provided in ytconfig.")),F={};F={context:F};if(O=this.i(a)){this.j(F,O,b);var U;b="/youtubei/v1/"+Ys(this.l());(O=null==(U=ns(a.commandMetadata,bj))?void 0:U.apiUrl)&&(b=O);U=b;(b=L("INNERTUBE_HOST_OVERRIDE"))&&(U=String(b)+String(pc(U)));b=
{};b.key=L("INNERTUBE_API_KEY");M("json_condensed_response")&&(b.prettyPrint="false");U=Xk(U,b||{},!1);a=Object.assign({},{command:a},void 0);a={input:U,za:os(U),ia:F,config:a};a.config.Za?a.config.Za.identity=c:a.config.Za={identity:c};return a}Hr(new P("Error: Failed to create Request from Command.",a))};
ea.Object.defineProperties(Zs.prototype,{m:{configurable:!0,enumerable:!0,get:function(){return!1}}});function $s(){}
u($s,Zs);$s.prototype.o=function(){return{input:"/getDatasyncIdsEndpoint",za:os("/getDatasyncIdsEndpoint","GET"),ia:{}}};
$s.prototype.l=function(){return[]};
$s.prototype.i=function(){};
$s.prototype.j=function(){};var at={},bt=(at.GET_DATASYNC_IDS=Vs($s),at);function ct(a){var b=Ja.apply(1,arguments);if(!dt(a)||b.some(function(d){return!dt(d)}))throw Error("Only objects may be merged.");
b=p(b);for(var c=b.next();!c.done;c=b.next())et(a,c.value);return a}
function et(a,b){for(var c in b)if(dt(b[c])){if(c in a&&!dt(a[c]))throw Error("Cannot merge an object into a non-object.");c in a||(a[c]={});et(a[c],b[c])}else if(ft(b[c])){if(c in a&&!ft(a[c]))throw Error("Cannot merge an array into a non-array.");c in a||(a[c]=[]);gt(a[c],b[c])}else a[c]=b[c];return a}
function gt(a,b){b=p(b);for(var c=b.next();!c.done;c=b.next())c=c.value,dt(c)?a.push(et({},c)):ft(c)?a.push(gt([],c)):a.push(c);return a}
function dt(a){return"object"===typeof a&&!Array.isArray(a)}
function ft(a){return"object"===typeof a&&Array.isArray(a)}
;function ht(a,b){co.call(this,1,arguments);this.timer=b}
u(ht,co);var jt=new eo("aft-recorded",ht);var kt=window;function lt(){this.timing={};this.clearResourceTimings=function(){};
this.webkitClearResourceTimings=function(){};
this.mozClearResourceTimings=function(){};
this.msClearResourceTimings=function(){};
this.oClearResourceTimings=function(){}}
var S=kt.performance||kt.mozPerformance||kt.msPerformance||kt.webkitPerformance||new lt;var mt=!1,nt={'script[name="scheduler/scheduler"]':"sj",'script[name="player/base"]':"pj",'link[rel="stylesheet"][name="www-player"]':"pc",'link[rel="stylesheet"][name="player/www-player"]':"pc",'script[name="desktop_polymer/desktop_polymer"]':"dpj",'link[rel="import"][name="desktop_polymer"]':"dph",'script[name="mobile-c3"]':"mcj",'link[rel="stylesheet"][name="mobile-c3"]':"mcc",'script[name="player-plasma-ias-phone/base"]':"mcppj",'script[name="player-plasma-ias-tablet/base"]':"mcptj",'link[rel="stylesheet"][name="mobile-polymer-player-ias"]':"mcpc",
'link[rel="stylesheet"][name="mobile-polymer-player-svg-ias"]':"mcpsc",'script[name="mobile_blazer_core_mod"]':"mbcj",'link[rel="stylesheet"][name="mobile_blazer_css"]':"mbc",'script[name="mobile_blazer_logged_in_users_mod"]':"mbliuj",'script[name="mobile_blazer_logged_out_users_mod"]':"mblouj",'script[name="mobile_blazer_noncore_mod"]':"mbnj","#player_css":"mbpc",'script[name="mobile_blazer_desktopplayer_mod"]':"mbpj",'link[rel="stylesheet"][name="mobile_blazer_tablet_css"]':"mbtc",'script[name="mobile_blazer_watch_mod"]':"mbwj"};
Wa(S.clearResourceTimings||S.webkitClearResourceTimings||S.mozClearResourceTimings||S.msClearResourceTimings||S.oClearResourceTimings||cb,S);function ot(a){var b=pt("aft",a);if(b)return b;b=L((a||"")+"TIMING_AFT_KEYS",["ol"]);for(var c=b.length,d=0;d<c;d++){var e=pt(b[d],a);if(e)return e}return NaN}
function qt(){var a;if(M("csi_use_performance_navigation_timing")||M("csi_use_performance_navigation_timing_tvhtml5")){var b,c,d,e=null==S?void 0:null==(a=S.getEntriesByType)?void 0:null==(b=a.call(S,"navigation"))?void 0:null==(c=b[0])?void 0:null==(d=c.toJSON)?void 0:d.call(c);e?(e.requestStart=rt(e.requestStart),e.responseEnd=rt(e.responseEnd),e.redirectStart=rt(e.redirectStart),e.redirectEnd=rt(e.redirectEnd),e.domainLookupEnd=rt(e.domainLookupEnd),e.connectStart=rt(e.connectStart),e.connectEnd=
rt(e.connectEnd),e.responseStart=rt(e.responseStart),e.secureConnectionStart=rt(e.secureConnectionStart),e.domainLookupStart=rt(e.domainLookupStart),e.isPerformanceNavigationTiming=!0,a=e):a=S.timing}else a=S.timing;return a}
function st(){return(M("csi_use_time_origin")||M("csi_use_time_origin_tvhtml5"))&&S.timeOrigin?Math.floor(S.timeOrigin):S.timing.navigationStart}
function rt(a){return Math.round(st()+a)}
function tt(a){var b;(b=B("ytcsi."+(a||"")+"data_"))||(b={tick:{},info:{}},A("ytcsi."+(a||"")+"data_",b));return b}
function ut(a){a=tt(a);a.info||(a.info={});return a.info}
function vt(a){a=tt(a);a.metadata||(a.metadata={});return a.metadata}
function wt(a){a=tt(a);a.tick||(a.tick={});return a.tick}
function pt(a,b){if(a=wt(b)[a])return"number"===typeof a?a:a[a.length-1]}
function xt(a){a=tt(a);if(a.gel){var b=a.gel;b.gelInfos||(b.gelInfos={});b.gelTicks||(b.gelTicks={})}else a.gel={gelTicks:{},gelInfos:{}};return a.gel}
function zt(a){a=xt(a);a.gelInfos||(a.gelInfos={});return a.gelInfos}
function At(a){var b=tt(a).nonce;b||(b=Pr(),tt(a).nonce=b);return b}
function Bt(a){var b=pt("_start",a),c=ot(a);b&&c&&!mt&&(jo(jt,new ht(Math.round(c-b),a)),mt=!0)}
function Ct(a,b){for(var c=p(Object.keys(b)),d=c.next();!d.done;d=c.next())if(d=d.value,!Object.keys(a).includes(d)||"object"===typeof b[d]&&!Ct(a[d],b[d]))return!1;return!0}
;function Dt(){if(S.getEntriesByType){var a=S.getEntriesByType("paint");if(a=kb(a,function(b){return"first-paint"===b.name}))return rt(a.startTime)}a=S.timing;
return a.bd?Math.max(0,a.bd):0}
;function Et(){var a=B("ytcsi.debug");a||(a=[],A("ytcsi.debug",a),A("ytcsi.reference",{}));return a}
function Ft(a){a=a||"";var b=B("ytcsi.reference");b||(Et(),b=B("ytcsi.reference"));if(b[a])return b[a];var c=Et(),d={timerName:a,info:{},tick:{},span:{},jspbInfo:[]};c.push(d);return b[a]=d}
;var T={},Gt=(T.auto_search="LATENCY_ACTION_AUTO_SEARCH",T.ad_to_ad="LATENCY_ACTION_AD_TO_AD",T.ad_to_video="LATENCY_ACTION_AD_TO_VIDEO",T["analytics.explore"]="LATENCY_ACTION_CREATOR_ANALYTICS_EXPLORE",T.app_startup="LATENCY_ACTION_APP_STARTUP",T["artist.analytics"]="LATENCY_ACTION_CREATOR_ARTIST_ANALYTICS",T["artist.events"]="LATENCY_ACTION_CREATOR_ARTIST_CONCERTS",T["artist.presskit"]="LATENCY_ACTION_CREATOR_ARTIST_PROFILE",T["song.analytics"]="LATENCY_ACTION_CREATOR_SONG_ANALYTICS",T.browse="LATENCY_ACTION_BROWSE",
T.cast_splash="LATENCY_ACTION_CAST_SPLASH",T.channels="LATENCY_ACTION_CHANNELS",T.creator_channel_dashboard="LATENCY_ACTION_CREATOR_CHANNEL_DASHBOARD",T["channel.analytics"]="LATENCY_ACTION_CREATOR_CHANNEL_ANALYTICS",T["channel.comments"]="LATENCY_ACTION_CREATOR_CHANNEL_COMMENTS",T["channel.content"]="LATENCY_ACTION_CREATOR_POST_LIST",T["channel.content.promotions"]="LATENCY_ACTION_CREATOR_PROMOTION_LIST",T["channel.copyright"]="LATENCY_ACTION_CREATOR_CHANNEL_COPYRIGHT",T["channel.editing"]="LATENCY_ACTION_CREATOR_CHANNEL_EDITING",
T["channel.monetization"]="LATENCY_ACTION_CREATOR_CHANNEL_MONETIZATION",T["channel.music"]="LATENCY_ACTION_CREATOR_CHANNEL_MUSIC",T["channel.music_storefront"]="LATENCY_ACTION_CREATOR_CHANNEL_MUSIC_STOREFRONT",T["channel.playlists"]="LATENCY_ACTION_CREATOR_CHANNEL_PLAYLISTS",T["channel.translations"]="LATENCY_ACTION_CREATOR_CHANNEL_TRANSLATIONS",T["channel.videos"]="LATENCY_ACTION_CREATOR_CHANNEL_VIDEOS",T["channel.live_streaming"]="LATENCY_ACTION_CREATOR_LIVE_STREAMING",T.chips="LATENCY_ACTION_CHIPS",
T["dialog.copyright_strikes"]="LATENCY_ACTION_CREATOR_DIALOG_COPYRIGHT_STRIKES",T["dialog.video_copyright"]="LATENCY_ACTION_CREATOR_DIALOG_VIDEO_COPYRIGHT",T["dialog.uploads"]="LATENCY_ACTION_CREATOR_DIALOG_UPLOADS",T.direct_playback="LATENCY_ACTION_DIRECT_PLAYBACK",T.embed="LATENCY_ACTION_EMBED",T.entity_key_serialization_perf="LATENCY_ACTION_ENTITY_KEY_SERIALIZATION_PERF",T.entity_key_deserialization_perf="LATENCY_ACTION_ENTITY_KEY_DESERIALIZATION_PERF",T.explore="LATENCY_ACTION_EXPLORE",T.home=
"LATENCY_ACTION_HOME",T.library="LATENCY_ACTION_LIBRARY",T.live="LATENCY_ACTION_LIVE",T.live_pagination="LATENCY_ACTION_LIVE_PAGINATION",T.onboarding="LATENCY_ACTION_ONBOARDING",T.parent_profile_settings="LATENCY_ACTION_KIDS_PARENT_PROFILE_SETTINGS",T.parent_tools_collection="LATENCY_ACTION_PARENT_TOOLS_COLLECTION",T.parent_tools_dashboard="LATENCY_ACTION_PARENT_TOOLS_DASHBOARD",T.player_att="LATENCY_ACTION_PLAYER_ATTESTATION",T["post.comments"]="LATENCY_ACTION_CREATOR_POST_COMMENTS",T["post.edit"]=
"LATENCY_ACTION_CREATOR_POST_EDIT",T.prebuffer="LATENCY_ACTION_PREBUFFER",T.prefetch="LATENCY_ACTION_PREFETCH",T.profile_settings="LATENCY_ACTION_KIDS_PROFILE_SETTINGS",T.profile_switcher="LATENCY_ACTION_LOGIN",T.reel_watch="LATENCY_ACTION_REEL_WATCH",T.results="LATENCY_ACTION_RESULTS",T["promotion.edit"]="LATENCY_ACTION_CREATOR_PROMOTION_EDIT",T.search_ui="LATENCY_ACTION_SEARCH_UI",T.search_suggest="LATENCY_ACTION_SUGGEST",T.search_zero_state="LATENCY_ACTION_SEARCH_ZERO_STATE",T.secret_code="LATENCY_ACTION_KIDS_SECRET_CODE",
T.seek="LATENCY_ACTION_PLAYER_SEEK",T.settings="LATENCY_ACTION_SETTINGS",T.store="LATENCY_ACTION_STORE",T.tenx="LATENCY_ACTION_TENX",T.video_to_ad="LATENCY_ACTION_VIDEO_TO_AD",T.watch="LATENCY_ACTION_WATCH",T.watch_it_again="LATENCY_ACTION_KIDS_WATCH_IT_AGAIN",T["watch,watch7"]="LATENCY_ACTION_WATCH",T["watch,watch7_html5"]="LATENCY_ACTION_WATCH",T["watch,watch7ad"]="LATENCY_ACTION_WATCH",T["watch,watch7ad_html5"]="LATENCY_ACTION_WATCH",T.wn_comments="LATENCY_ACTION_LOAD_COMMENTS",T.ww_rqs="LATENCY_ACTION_WHO_IS_WATCHING",
T["video.analytics"]="LATENCY_ACTION_CREATOR_VIDEO_ANALYTICS",T["video.comments"]="LATENCY_ACTION_CREATOR_VIDEO_COMMENTS",T["video.edit"]="LATENCY_ACTION_CREATOR_VIDEO_EDIT",T["video.editor"]="LATENCY_ACTION_CREATOR_VIDEO_VIDEO_EDITOR",T["video.editor_async"]="LATENCY_ACTION_CREATOR_VIDEO_VIDEO_EDITOR_ASYNC",T["video.live_settings"]="LATENCY_ACTION_CREATOR_VIDEO_LIVE_SETTINGS",T["video.live_streaming"]="LATENCY_ACTION_CREATOR_VIDEO_LIVE_STREAMING",T["video.monetization"]="LATENCY_ACTION_CREATOR_VIDEO_MONETIZATION",
T["video.translations"]="LATENCY_ACTION_CREATOR_VIDEO_TRANSLATIONS",T.voice_assistant="LATENCY_ACTION_VOICE_ASSISTANT",T.cast_load_by_entity_to_watch="LATENCY_ACTION_CAST_LOAD_BY_ENTITY_TO_WATCH",T.networkless_performance="LATENCY_ACTION_NETWORKLESS_PERFORMANCE",T),V={},Ht=(V.ad_allowed="adTypesAllowed",V.yt_abt="adBreakType",V.ad_cpn="adClientPlaybackNonce",V.ad_docid="adVideoId",V.yt_ad_an="adNetworks",V.ad_at="adType",V.aida="appInstallDataAgeMs",V.browse_id="browseId",V.p="httpProtocol",V.t="transportProtocol",
V.cs="commandSource",V.cpn="clientPlaybackNonce",V.ccs="creatorInfo.creatorCanaryState",V.ctop="creatorInfo.topEntityType",V.csn="clientScreenNonce",V.docid="videoId",V.GetHome_rid="requestIds",V.GetSearch_rid="requestIds",V.GetPlayer_rid="requestIds",V.GetWatchNext_rid="requestIds",V.GetBrowse_rid="requestIds",V.GetLibrary_rid="requestIds",V.is_continuation="isContinuation",V.is_nav="isNavigation",V.b_p="kabukiInfo.browseParams",V.is_prefetch="kabukiInfo.isPrefetch",V.is_secondary_nav="kabukiInfo.isSecondaryNav",
V.nav_type="kabukiInfo.navigationType",V.prev_browse_id="kabukiInfo.prevBrowseId",V.query_source="kabukiInfo.querySource",V.voz_type="kabukiInfo.vozType",V.yt_lt="loadType",V.mver="creatorInfo.measurementVersion",V.yt_ad="isMonetized",V.nr="webInfo.navigationReason",V.nrsu="navigationRequestedSameUrl",V.pnt="performanceNavigationTiming",V.prt="playbackRequiresTap",V.plt="playerInfo.playbackType",V.pis="playerInfo.playerInitializedState",V.paused="playerInfo.isPausedOnLoad",V.yt_pt="playerType",V.fmt=
"playerInfo.itag",V.yt_pl="watchInfo.isPlaylist",V.yt_pre="playerInfo.preloadType",V.yt_ad_pr="prerollAllowed",V.pa="previousAction",V.yt_red="isRedSubscriber",V.rce="mwebInfo.responseContentEncoding",V.rc="resourceInfo.resourceCache",V.scrh="screenHeight",V.scrw="screenWidth",V.st="serverTimeMs",V.ssdm="shellStartupDurationMs",V.br_trs="tvInfo.bedrockTriggerState",V.kebqat="kabukiInfo.earlyBrowseRequestInfo.abandonmentType",V.kebqa="kabukiInfo.earlyBrowseRequestInfo.adopted",V.label="tvInfo.label",
V.is_mdx="tvInfo.isMdx",V.preloaded="tvInfo.isPreloaded",V.aac_type="tvInfo.authAccessCredentialType",V.upg_player_vis="playerInfo.visibilityState",V.query="unpluggedInfo.query",V.upg_chip_ids_string="unpluggedInfo.upgChipIdsString",V.yt_vst="videoStreamType",V.vph="viewportHeight",V.vpw="viewportWidth",V.yt_vis="isVisible",V.rcl="mwebInfo.responseContentLength",V.GetSettings_rid="requestIds",V.GetTrending_rid="requestIds",V.GetMusicSearchSuggestions_rid="requestIds",V.REQUEST_ID="requestIds",V),
It="isContinuation isNavigation kabukiInfo.earlyBrowseRequestInfo.adopted kabukiInfo.isPrefetch kabukiInfo.isSecondaryNav isMonetized navigationRequestedSameUrl performanceNavigationTiming playerInfo.isPausedOnLoad prerollAllowed isRedSubscriber tvInfo.isMdx tvInfo.isPreloaded isVisible watchInfo.isPlaylist playbackRequiresTap".split(" "),Jt={},Kt=(Jt.ccs="CANARY_STATE_",Jt.mver="MEASUREMENT_VERSION_",Jt.pis="PLAYER_INITIALIZED_STATE_",Jt.yt_pt="LATENCY_PLAYER_",Jt.pa="LATENCY_ACTION_",Jt.ctop="TOP_ENTITY_TYPE_",
Jt.yt_vst="VIDEO_STREAM_TYPE_",Jt),Lt="all_vc ap aq c cbr cbrand cbrver cmodel cos cosver cplatform ctheme cver ei l_an l_mm plid srt yt_fss yt_li vpst vpni2 vpil2 icrc icrt pa GetAccountOverview_rid GetHistory_rid cmt d_vpct d_vpnfi d_vpni nsru pc pfa pfeh pftr pnc prerender psc rc start tcrt tcrc ssr vpr vps yt_abt yt_fn yt_fs yt_pft yt_pre yt_pt yt_pvis ytu_pvis yt_ref yt_sts tds".split(" ");function Mt(a){return Gt[a]||"LATENCY_ACTION_UNKNOWN"}
function Nt(a,b,c){c=xt(c);if(c.gelInfos)c.gelInfos[a]=!0;else{var d={};c.gelInfos=(d[a]=!0,d)}if(a.match("_rid")){var e=a.split("_rid")[0];a="REQUEST_ID"}if(a in Ht){c=Ht[a];0<=eb(It,c)&&(b=!!b);a in Kt&&"string"===typeof b&&(b=Kt[a]+b.toUpperCase());a=b;b=c.split(".");for(var f=d={},g=0;g<b.length-1;g++){var h=b[g];f[h]={};f=f[h]}f[b[b.length-1]]="requestIds"===c?[{id:a,endpoint:e}]:a;return ct({},d)}0<=eb(Lt,a)||Ir(new P("Unknown label logged with GEL CSI",a))}
;var W={LATENCY_ACTION_SHORTS_VIDEO_INGESTION_TRANSCODING:179,LATENCY_ACTION_KIDS_PROFILE_SWITCHER:90,LATENCY_ACTION_OFFLINE_THUMBNAIL_TRANSFER:100,LATENCY_ACTION_CREATOR_VIDEO_VIDEO_EDITOR_ASYNC:46,LATENCY_ACTION_CREATOR_VIDEO_VIDEO_EDITOR:37,LATENCY_ACTION_SPINNER_DISPLAYED:14,LATENCY_ACTION_PLAYABILITY_CHECK:10,LATENCY_ACTION_PROCESS:9,LATENCY_ACTION_APP_STARTUP:5,LATENCY_ACTION_COMMERCE_TRANSACTION:184,LATENCY_ACTION_LOG_PAYMENT_SERVER_ANALYTICS_RPC:173,LATENCY_ACTION_GET_PAYMENT_INSTRUMENTS_PARAMS_RPC:172,
LATENCY_ACTION_GET_FIX_INSTRUMENT_PARAMS_RPC:171,LATENCY_ACTION_RESUME_SUBSCRIPTION_RPC:170,LATENCY_ACTION_PAUSE_SUBSCRIPTION_RPC:169,LATENCY_ACTION_GET_OFFLINE_UPSELL_RPC:168,LATENCY_ACTION_GET_OFFERS_RPC:167,LATENCY_ACTION_GET_CANCELLATION_YT_FLOW_RPC:166,LATENCY_ACTION_GET_CANCELLATION_FLOW_RPC:165,LATENCY_ACTION_UPDATE_CROSS_DEVICE_OFFLINE_STATE_RPC:164,LATENCY_ACTION_GET_OFFER_DETAILS_RPC:163,LATENCY_ACTION_CANCEL_RECURRENCE_TRANSACTION_RPC:162,LATENCY_ACTION_GET_TIP_MODULE_RPC:161,LATENCY_ACTION_HANDLE_TRANSACTION_RPC:160,
LATENCY_ACTION_COMPLETE_TRANSACTION_RPC:159,LATENCY_ACTION_GET_CART_RPC:158,LATENCY_ACTION_THUMBNAIL_FETCH:156,LATENCY_ACTION_ABANDONED_DIRECT_PLAYBACK:154,LATENCY_ACTION_SHARE_VIDEO:153,LATENCY_ACTION_AD_TO_VIDEO_INT:152,LATENCY_ACTION_ABANDONED_BROWSE:151,LATENCY_ACTION_PLAYER_ROTATION:150,LATENCY_ACTION_GENERIC_WEB_VIEW:183,LATENCY_ACTION_SHOPPING_IN_APP:124,LATENCY_ACTION_PLAYER_ATTESTATION:121,LATENCY_ACTION_PLAYER_SEEK:119,LATENCY_ACTION_SUPER_STICKER_BUY_FLOW:114,LATENCY_ACTION_DOWNLOADS_DATA_ACCESS:180,
LATENCY_ACTION_BLOCKS_PERFORMANCE:148,LATENCY_ACTION_ASSISTANT_QUERY:138,LATENCY_ACTION_ASSISTANT_SETTINGS:137,LATENCY_ACTION_ENTITY_KEY_DESERIALIZATION_PERF:129,LATENCY_ACTION_ENTITY_KEY_SERIALIZATION_PERF:128,LATENCY_ACTION_PROOF_OF_ORIGIN_TOKEN_CREATE:127,LATENCY_ACTION_EMBEDS_SDK_INITIALIZATION:123,LATENCY_ACTION_NETWORKLESS_PERFORMANCE:122,LATENCY_ACTION_DOWNLOADS_EXPANSION:133,LATENCY_ACTION_ENTITY_TRANSFORM:131,LATENCY_ACTION_DOWNLOADS_COMPATIBILITY_LAYER:96,LATENCY_ACTION_EMBEDS_SET_VIDEO:95,
LATENCY_ACTION_SETTINGS:93,LATENCY_ACTION_ABANDONED_STARTUP:81,LATENCY_ACTION_MEDIA_BROWSER_ALARM_PLAY:80,LATENCY_ACTION_MEDIA_BROWSER_SEARCH:79,LATENCY_ACTION_MEDIA_BROWSER_LOAD_TREE:78,LATENCY_ACTION_WHO_IS_WATCHING:77,LATENCY_ACTION_CAST_LOAD_BY_ENTITY_TO_WATCH:76,LATENCY_ACTION_LITE_SWITCH_ACCOUNT:73,LATENCY_ACTION_ELEMENTS_PERFORMANCE:70,LATENCY_ACTION_LOCATION_SIGNAL_COLLECTION:69,LATENCY_ACTION_MODIFY_CHANNEL_NOTIFICATION:65,LATENCY_ACTION_OFFLINE_STORE_START:61,LATENCY_ACTION_REEL_EDITOR:58,
LATENCY_ACTION_CHANNEL_SUBSCRIBE:56,LATENCY_ACTION_CHANNEL_PREVIEW:55,LATENCY_ACTION_PREFETCH:52,LATENCY_ACTION_ABANDONED_WATCH:45,LATENCY_ACTION_LOAD_COMMENT_REPLIES:26,LATENCY_ACTION_LOAD_COMMENTS:25,LATENCY_ACTION_EDIT_COMMENT:24,LATENCY_ACTION_NEW_COMMENT:23,LATENCY_ACTION_OFFLINE_SHARING_RECEIVER_PAIRING:19,LATENCY_ACTION_EMBED:18,LATENCY_ACTION_MDX_LAUNCH:15,LATENCY_ACTION_RESOLVE_URL:13,LATENCY_ACTION_CAST_SPLASH:149,LATENCY_ACTION_MDX_CONNECT_TO_SESSION:190,LATENCY_ACTION_MDX_STREAM_TRANSFER:178,
LATENCY_ACTION_MDX_CAST:120,LATENCY_ACTION_MDX_COMMAND:12,LATENCY_ACTION_REEL_SELECT_SEGMENT:136,LATENCY_ACTION_ACCELERATED_EFFECTS:145,LATENCY_ACTION_EDIT_AUDIO_GEN:182,LATENCY_ACTION_UPLOAD_AUDIO_MIXER:147,LATENCY_ACTION_SHORTS_CLIENT_SIDE_RENDERING:157,LATENCY_ACTION_SHORTS_SEG_IMP_TRANSCODING:146,LATENCY_ACTION_SHORTS_AUDIO_PICKER_PLAYBACK:130,LATENCY_ACTION_SHORTS_WAVEFORM_DOWNLOAD:125,LATENCY_ACTION_SHORTS_VIDEO_INGESTION:155,LATENCY_ACTION_SHORTS_GALLERY:107,LATENCY_ACTION_SHORTS_TRIM:105,
LATENCY_ACTION_SHORTS_EDIT:104,LATENCY_ACTION_SHORTS_CAMERA:103,LATENCY_ACTION_PARENT_TOOLS_DASHBOARD:102,LATENCY_ACTION_PARENT_TOOLS_COLLECTION:101,LATENCY_ACTION_MUSIC_LOAD_RECOMMENDED_MEDIA_ITEMS:116,LATENCY_ACTION_MUSIC_LOAD_MEDIA_ITEMS:115,LATENCY_ACTION_MUSIC_ALBUM_DETAIL:72,LATENCY_ACTION_MUSIC_PLAYLIST_DETAIL:71,LATENCY_ACTION_STORE:175,LATENCY_ACTION_CHIPS:68,LATENCY_ACTION_SEARCH_ZERO_STATE:67,LATENCY_ACTION_LIVE_PAGINATION:117,LATENCY_ACTION_LIVE:20,LATENCY_ACTION_PREBUFFER:40,LATENCY_ACTION_TENX:39,
LATENCY_ACTION_KIDS_PROFILE_SETTINGS:94,LATENCY_ACTION_KIDS_WATCH_IT_AGAIN:92,LATENCY_ACTION_KIDS_SECRET_CODE:91,LATENCY_ACTION_KIDS_PARENT_PROFILE_SETTINGS:89,LATENCY_ACTION_KIDS_ONBOARDING:88,LATENCY_ACTION_KIDS_VOICE_SEARCH:82,LATENCY_ACTION_KIDS_CURATED_COLLECTION:62,LATENCY_ACTION_KIDS_LIBRARY:53,LATENCY_ACTION_CREATOR_PROMOTION_LIST:186,LATENCY_ACTION_CREATOR_PROMOTION_EDIT:185,LATENCY_ACTION_CREATOR_VIDEO_TRANSLATIONS:38,LATENCY_ACTION_CREATOR_VIDEO_MONETIZATION:74,LATENCY_ACTION_CREATOR_VIDEO_LIVE_STREAMING:141,
LATENCY_ACTION_CREATOR_VIDEO_LIVE_SETTINGS:142,LATENCY_ACTION_CREATOR_VIDEO_EDITOR_ASYNC:51,LATENCY_ACTION_CREATOR_VIDEO_EDITOR:50,LATENCY_ACTION_CREATOR_VIDEO_EDIT:36,LATENCY_ACTION_CREATOR_VIDEO_COMMENTS:34,LATENCY_ACTION_CREATOR_VIDEO_ANALYTICS:33,LATENCY_ACTION_CREATOR_SONG_ANALYTICS:176,LATENCY_ACTION_CREATOR_POST_LIST:112,LATENCY_ACTION_CREATOR_POST_EDIT:110,LATENCY_ACTION_CREATOR_POST_COMMENTS:111,LATENCY_ACTION_CREATOR_LIVE_STREAMING:108,LATENCY_ACTION_CREATOR_DIALOG_VIDEO_COPYRIGHT:174,LATENCY_ACTION_CREATOR_DIALOG_UPLOADS:86,
LATENCY_ACTION_CREATOR_DIALOG_COPYRIGHT_STRIKES:87,LATENCY_ACTION_CREATOR_CHANNEL_VIDEOS:32,LATENCY_ACTION_CREATOR_CHANNEL_TRANSLATIONS:48,LATENCY_ACTION_CREATOR_CHANNEL_PLAYLISTS:139,LATENCY_ACTION_CREATOR_CHANNEL_MUSIC_STOREFRONT:177,LATENCY_ACTION_CREATOR_CHANNEL_MUSIC:99,LATENCY_ACTION_CREATOR_CHANNEL_MONETIZATION:43,LATENCY_ACTION_CREATOR_CHANNEL_EDITING:113,LATENCY_ACTION_CREATOR_CHANNEL_DASHBOARD:49,LATENCY_ACTION_CREATOR_CHANNEL_COPYRIGHT:44,LATENCY_ACTION_CREATOR_CMS_ISSUES:191,LATENCY_ACTION_CREATOR_CHANNEL_COMMENTS:66,
LATENCY_ACTION_CREATOR_CHANNEL_ANALYTICS:31,LATENCY_ACTION_CREATOR_ARTIST_PROFILE:85,LATENCY_ACTION_CREATOR_ARTIST_CONCERTS:84,LATENCY_ACTION_CREATOR_ARTIST_ANALYTICS:83,LATENCY_ACTION_CREATOR_ANALYTICS_EXPLORE:140,LATENCY_ACTION_EXPERIMENTAL_WATCH_UI:181,LATENCY_ACTION_STORYBOARD_THUMBNAILS:118,LATENCY_ACTION_SEARCH_THUMBNAILS:59,LATENCY_ACTION_ON_DEVICE_MODEL_DOWNLOAD:54,LATENCY_ACTION_VOICE_ASSISTANT:47,LATENCY_ACTION_SEARCH_UI:35,LATENCY_ACTION_SUGGEST:30,LATENCY_ACTION_AUTO_SEARCH:126,LATENCY_ACTION_DOWNLOADS:98,
LATENCY_ACTION_EXPLORE:75,LATENCY_ACTION_VIDEO_LIST:63,LATENCY_ACTION_HOME_RESUME:60,LATENCY_ACTION_SUBSCRIPTIONS_LIST:57,LATENCY_ACTION_THUMBNAIL_LOAD:42,LATENCY_ACTION_FIRST_THUMBNAIL_LOAD:29,LATENCY_ACTION_SUBSCRIPTIONS_FEED:109,LATENCY_ACTION_SUBSCRIPTIONS:28,LATENCY_ACTION_TRENDING:27,LATENCY_ACTION_LIBRARY:21,LATENCY_ACTION_VIDEO_THUMBNAIL:8,LATENCY_ACTION_SHOW_MORE:7,LATENCY_ACTION_VIDEO_PREVIEW:6,LATENCY_ACTION_AD_TO_AD:22,LATENCY_ACTION_VIDEO_TO_AD:17,LATENCY_ACTION_AD_TO_VIDEO:16,LATENCY_ACTION_DIRECT_PLAYBACK:132,
LATENCY_ACTION_PREBUFFER_VIDEO:144,LATENCY_ACTION_PREFETCH_VIDEO:143,LATENCY_ACTION_STARTUP:106,LATENCY_ACTION_ONBOARDING:135,LATENCY_ACTION_LOGIN:97,LATENCY_ACTION_REEL_WATCH:41,LATENCY_ACTION_WATCH:3,LATENCY_ACTION_RESULTS:2,LATENCY_ACTION_CHANNELS:4,LATENCY_ACTION_HOME:1,LATENCY_ACTION_BROWSE:11,LATENCY_ACTION_USER_ACTION:189,LATENCY_ACTION_INFRASTRUCTURE:188,LATENCY_ACTION_PAGE_NAVIGATION:187,LATENCY_ACTION_UNKNOWN:0};W[W.LATENCY_ACTION_SHORTS_VIDEO_INGESTION_TRANSCODING]="LATENCY_ACTION_SHORTS_VIDEO_INGESTION_TRANSCODING";
W[W.LATENCY_ACTION_KIDS_PROFILE_SWITCHER]="LATENCY_ACTION_KIDS_PROFILE_SWITCHER";W[W.LATENCY_ACTION_OFFLINE_THUMBNAIL_TRANSFER]="LATENCY_ACTION_OFFLINE_THUMBNAIL_TRANSFER";W[W.LATENCY_ACTION_CREATOR_VIDEO_VIDEO_EDITOR_ASYNC]="LATENCY_ACTION_CREATOR_VIDEO_VIDEO_EDITOR_ASYNC";W[W.LATENCY_ACTION_CREATOR_VIDEO_VIDEO_EDITOR]="LATENCY_ACTION_CREATOR_VIDEO_VIDEO_EDITOR";W[W.LATENCY_ACTION_SPINNER_DISPLAYED]="LATENCY_ACTION_SPINNER_DISPLAYED";W[W.LATENCY_ACTION_PLAYABILITY_CHECK]="LATENCY_ACTION_PLAYABILITY_CHECK";
W[W.LATENCY_ACTION_PROCESS]="LATENCY_ACTION_PROCESS";W[W.LATENCY_ACTION_APP_STARTUP]="LATENCY_ACTION_APP_STARTUP";W[W.LATENCY_ACTION_COMMERCE_TRANSACTION]="LATENCY_ACTION_COMMERCE_TRANSACTION";W[W.LATENCY_ACTION_LOG_PAYMENT_SERVER_ANALYTICS_RPC]="LATENCY_ACTION_LOG_PAYMENT_SERVER_ANALYTICS_RPC";W[W.LATENCY_ACTION_GET_PAYMENT_INSTRUMENTS_PARAMS_RPC]="LATENCY_ACTION_GET_PAYMENT_INSTRUMENTS_PARAMS_RPC";W[W.LATENCY_ACTION_GET_FIX_INSTRUMENT_PARAMS_RPC]="LATENCY_ACTION_GET_FIX_INSTRUMENT_PARAMS_RPC";
W[W.LATENCY_ACTION_RESUME_SUBSCRIPTION_RPC]="LATENCY_ACTION_RESUME_SUBSCRIPTION_RPC";W[W.LATENCY_ACTION_PAUSE_SUBSCRIPTION_RPC]="LATENCY_ACTION_PAUSE_SUBSCRIPTION_RPC";W[W.LATENCY_ACTION_GET_OFFLINE_UPSELL_RPC]="LATENCY_ACTION_GET_OFFLINE_UPSELL_RPC";W[W.LATENCY_ACTION_GET_OFFERS_RPC]="LATENCY_ACTION_GET_OFFERS_RPC";W[W.LATENCY_ACTION_GET_CANCELLATION_YT_FLOW_RPC]="LATENCY_ACTION_GET_CANCELLATION_YT_FLOW_RPC";W[W.LATENCY_ACTION_GET_CANCELLATION_FLOW_RPC]="LATENCY_ACTION_GET_CANCELLATION_FLOW_RPC";
W[W.LATENCY_ACTION_UPDATE_CROSS_DEVICE_OFFLINE_STATE_RPC]="LATENCY_ACTION_UPDATE_CROSS_DEVICE_OFFLINE_STATE_RPC";W[W.LATENCY_ACTION_GET_OFFER_DETAILS_RPC]="LATENCY_ACTION_GET_OFFER_DETAILS_RPC";W[W.LATENCY_ACTION_CANCEL_RECURRENCE_TRANSACTION_RPC]="LATENCY_ACTION_CANCEL_RECURRENCE_TRANSACTION_RPC";W[W.LATENCY_ACTION_GET_TIP_MODULE_RPC]="LATENCY_ACTION_GET_TIP_MODULE_RPC";W[W.LATENCY_ACTION_HANDLE_TRANSACTION_RPC]="LATENCY_ACTION_HANDLE_TRANSACTION_RPC";
W[W.LATENCY_ACTION_COMPLETE_TRANSACTION_RPC]="LATENCY_ACTION_COMPLETE_TRANSACTION_RPC";W[W.LATENCY_ACTION_GET_CART_RPC]="LATENCY_ACTION_GET_CART_RPC";W[W.LATENCY_ACTION_THUMBNAIL_FETCH]="LATENCY_ACTION_THUMBNAIL_FETCH";W[W.LATENCY_ACTION_ABANDONED_DIRECT_PLAYBACK]="LATENCY_ACTION_ABANDONED_DIRECT_PLAYBACK";W[W.LATENCY_ACTION_SHARE_VIDEO]="LATENCY_ACTION_SHARE_VIDEO";W[W.LATENCY_ACTION_AD_TO_VIDEO_INT]="LATENCY_ACTION_AD_TO_VIDEO_INT";W[W.LATENCY_ACTION_ABANDONED_BROWSE]="LATENCY_ACTION_ABANDONED_BROWSE";
W[W.LATENCY_ACTION_PLAYER_ROTATION]="LATENCY_ACTION_PLAYER_ROTATION";W[W.LATENCY_ACTION_GENERIC_WEB_VIEW]="LATENCY_ACTION_GENERIC_WEB_VIEW";W[W.LATENCY_ACTION_SHOPPING_IN_APP]="LATENCY_ACTION_SHOPPING_IN_APP";W[W.LATENCY_ACTION_PLAYER_ATTESTATION]="LATENCY_ACTION_PLAYER_ATTESTATION";W[W.LATENCY_ACTION_PLAYER_SEEK]="LATENCY_ACTION_PLAYER_SEEK";W[W.LATENCY_ACTION_SUPER_STICKER_BUY_FLOW]="LATENCY_ACTION_SUPER_STICKER_BUY_FLOW";W[W.LATENCY_ACTION_DOWNLOADS_DATA_ACCESS]="LATENCY_ACTION_DOWNLOADS_DATA_ACCESS";
W[W.LATENCY_ACTION_BLOCKS_PERFORMANCE]="LATENCY_ACTION_BLOCKS_PERFORMANCE";W[W.LATENCY_ACTION_ASSISTANT_QUERY]="LATENCY_ACTION_ASSISTANT_QUERY";W[W.LATENCY_ACTION_ASSISTANT_SETTINGS]="LATENCY_ACTION_ASSISTANT_SETTINGS";W[W.LATENCY_ACTION_ENTITY_KEY_DESERIALIZATION_PERF]="LATENCY_ACTION_ENTITY_KEY_DESERIALIZATION_PERF";W[W.LATENCY_ACTION_ENTITY_KEY_SERIALIZATION_PERF]="LATENCY_ACTION_ENTITY_KEY_SERIALIZATION_PERF";W[W.LATENCY_ACTION_PROOF_OF_ORIGIN_TOKEN_CREATE]="LATENCY_ACTION_PROOF_OF_ORIGIN_TOKEN_CREATE";
W[W.LATENCY_ACTION_EMBEDS_SDK_INITIALIZATION]="LATENCY_ACTION_EMBEDS_SDK_INITIALIZATION";W[W.LATENCY_ACTION_NETWORKLESS_PERFORMANCE]="LATENCY_ACTION_NETWORKLESS_PERFORMANCE";W[W.LATENCY_ACTION_DOWNLOADS_EXPANSION]="LATENCY_ACTION_DOWNLOADS_EXPANSION";W[W.LATENCY_ACTION_ENTITY_TRANSFORM]="LATENCY_ACTION_ENTITY_TRANSFORM";W[W.LATENCY_ACTION_DOWNLOADS_COMPATIBILITY_LAYER]="LATENCY_ACTION_DOWNLOADS_COMPATIBILITY_LAYER";W[W.LATENCY_ACTION_EMBEDS_SET_VIDEO]="LATENCY_ACTION_EMBEDS_SET_VIDEO";
W[W.LATENCY_ACTION_SETTINGS]="LATENCY_ACTION_SETTINGS";W[W.LATENCY_ACTION_ABANDONED_STARTUP]="LATENCY_ACTION_ABANDONED_STARTUP";W[W.LATENCY_ACTION_MEDIA_BROWSER_ALARM_PLAY]="LATENCY_ACTION_MEDIA_BROWSER_ALARM_PLAY";W[W.LATENCY_ACTION_MEDIA_BROWSER_SEARCH]="LATENCY_ACTION_MEDIA_BROWSER_SEARCH";W[W.LATENCY_ACTION_MEDIA_BROWSER_LOAD_TREE]="LATENCY_ACTION_MEDIA_BROWSER_LOAD_TREE";W[W.LATENCY_ACTION_WHO_IS_WATCHING]="LATENCY_ACTION_WHO_IS_WATCHING";W[W.LATENCY_ACTION_CAST_LOAD_BY_ENTITY_TO_WATCH]="LATENCY_ACTION_CAST_LOAD_BY_ENTITY_TO_WATCH";
W[W.LATENCY_ACTION_LITE_SWITCH_ACCOUNT]="LATENCY_ACTION_LITE_SWITCH_ACCOUNT";W[W.LATENCY_ACTION_ELEMENTS_PERFORMANCE]="LATENCY_ACTION_ELEMENTS_PERFORMANCE";W[W.LATENCY_ACTION_LOCATION_SIGNAL_COLLECTION]="LATENCY_ACTION_LOCATION_SIGNAL_COLLECTION";W[W.LATENCY_ACTION_MODIFY_CHANNEL_NOTIFICATION]="LATENCY_ACTION_MODIFY_CHANNEL_NOTIFICATION";W[W.LATENCY_ACTION_OFFLINE_STORE_START]="LATENCY_ACTION_OFFLINE_STORE_START";W[W.LATENCY_ACTION_REEL_EDITOR]="LATENCY_ACTION_REEL_EDITOR";
W[W.LATENCY_ACTION_CHANNEL_SUBSCRIBE]="LATENCY_ACTION_CHANNEL_SUBSCRIBE";W[W.LATENCY_ACTION_CHANNEL_PREVIEW]="LATENCY_ACTION_CHANNEL_PREVIEW";W[W.LATENCY_ACTION_PREFETCH]="LATENCY_ACTION_PREFETCH";W[W.LATENCY_ACTION_ABANDONED_WATCH]="LATENCY_ACTION_ABANDONED_WATCH";W[W.LATENCY_ACTION_LOAD_COMMENT_REPLIES]="LATENCY_ACTION_LOAD_COMMENT_REPLIES";W[W.LATENCY_ACTION_LOAD_COMMENTS]="LATENCY_ACTION_LOAD_COMMENTS";W[W.LATENCY_ACTION_EDIT_COMMENT]="LATENCY_ACTION_EDIT_COMMENT";
W[W.LATENCY_ACTION_NEW_COMMENT]="LATENCY_ACTION_NEW_COMMENT";W[W.LATENCY_ACTION_OFFLINE_SHARING_RECEIVER_PAIRING]="LATENCY_ACTION_OFFLINE_SHARING_RECEIVER_PAIRING";W[W.LATENCY_ACTION_EMBED]="LATENCY_ACTION_EMBED";W[W.LATENCY_ACTION_MDX_LAUNCH]="LATENCY_ACTION_MDX_LAUNCH";W[W.LATENCY_ACTION_RESOLVE_URL]="LATENCY_ACTION_RESOLVE_URL";W[W.LATENCY_ACTION_CAST_SPLASH]="LATENCY_ACTION_CAST_SPLASH";W[W.LATENCY_ACTION_MDX_CONNECT_TO_SESSION]="LATENCY_ACTION_MDX_CONNECT_TO_SESSION";
W[W.LATENCY_ACTION_MDX_STREAM_TRANSFER]="LATENCY_ACTION_MDX_STREAM_TRANSFER";W[W.LATENCY_ACTION_MDX_CAST]="LATENCY_ACTION_MDX_CAST";W[W.LATENCY_ACTION_MDX_COMMAND]="LATENCY_ACTION_MDX_COMMAND";W[W.LATENCY_ACTION_REEL_SELECT_SEGMENT]="LATENCY_ACTION_REEL_SELECT_SEGMENT";W[W.LATENCY_ACTION_ACCELERATED_EFFECTS]="LATENCY_ACTION_ACCELERATED_EFFECTS";W[W.LATENCY_ACTION_EDIT_AUDIO_GEN]="LATENCY_ACTION_EDIT_AUDIO_GEN";W[W.LATENCY_ACTION_UPLOAD_AUDIO_MIXER]="LATENCY_ACTION_UPLOAD_AUDIO_MIXER";
W[W.LATENCY_ACTION_SHORTS_CLIENT_SIDE_RENDERING]="LATENCY_ACTION_SHORTS_CLIENT_SIDE_RENDERING";W[W.LATENCY_ACTION_SHORTS_SEG_IMP_TRANSCODING]="LATENCY_ACTION_SHORTS_SEG_IMP_TRANSCODING";W[W.LATENCY_ACTION_SHORTS_AUDIO_PICKER_PLAYBACK]="LATENCY_ACTION_SHORTS_AUDIO_PICKER_PLAYBACK";W[W.LATENCY_ACTION_SHORTS_WAVEFORM_DOWNLOAD]="LATENCY_ACTION_SHORTS_WAVEFORM_DOWNLOAD";W[W.LATENCY_ACTION_SHORTS_VIDEO_INGESTION]="LATENCY_ACTION_SHORTS_VIDEO_INGESTION";W[W.LATENCY_ACTION_SHORTS_GALLERY]="LATENCY_ACTION_SHORTS_GALLERY";
W[W.LATENCY_ACTION_SHORTS_TRIM]="LATENCY_ACTION_SHORTS_TRIM";W[W.LATENCY_ACTION_SHORTS_EDIT]="LATENCY_ACTION_SHORTS_EDIT";W[W.LATENCY_ACTION_SHORTS_CAMERA]="LATENCY_ACTION_SHORTS_CAMERA";W[W.LATENCY_ACTION_PARENT_TOOLS_DASHBOARD]="LATENCY_ACTION_PARENT_TOOLS_DASHBOARD";W[W.LATENCY_ACTION_PARENT_TOOLS_COLLECTION]="LATENCY_ACTION_PARENT_TOOLS_COLLECTION";W[W.LATENCY_ACTION_MUSIC_LOAD_RECOMMENDED_MEDIA_ITEMS]="LATENCY_ACTION_MUSIC_LOAD_RECOMMENDED_MEDIA_ITEMS";
W[W.LATENCY_ACTION_MUSIC_LOAD_MEDIA_ITEMS]="LATENCY_ACTION_MUSIC_LOAD_MEDIA_ITEMS";W[W.LATENCY_ACTION_MUSIC_ALBUM_DETAIL]="LATENCY_ACTION_MUSIC_ALBUM_DETAIL";W[W.LATENCY_ACTION_MUSIC_PLAYLIST_DETAIL]="LATENCY_ACTION_MUSIC_PLAYLIST_DETAIL";W[W.LATENCY_ACTION_STORE]="LATENCY_ACTION_STORE";W[W.LATENCY_ACTION_CHIPS]="LATENCY_ACTION_CHIPS";W[W.LATENCY_ACTION_SEARCH_ZERO_STATE]="LATENCY_ACTION_SEARCH_ZERO_STATE";W[W.LATENCY_ACTION_LIVE_PAGINATION]="LATENCY_ACTION_LIVE_PAGINATION";
W[W.LATENCY_ACTION_LIVE]="LATENCY_ACTION_LIVE";W[W.LATENCY_ACTION_PREBUFFER]="LATENCY_ACTION_PREBUFFER";W[W.LATENCY_ACTION_TENX]="LATENCY_ACTION_TENX";W[W.LATENCY_ACTION_KIDS_PROFILE_SETTINGS]="LATENCY_ACTION_KIDS_PROFILE_SETTINGS";W[W.LATENCY_ACTION_KIDS_WATCH_IT_AGAIN]="LATENCY_ACTION_KIDS_WATCH_IT_AGAIN";W[W.LATENCY_ACTION_KIDS_SECRET_CODE]="LATENCY_ACTION_KIDS_SECRET_CODE";W[W.LATENCY_ACTION_KIDS_PARENT_PROFILE_SETTINGS]="LATENCY_ACTION_KIDS_PARENT_PROFILE_SETTINGS";
W[W.LATENCY_ACTION_KIDS_ONBOARDING]="LATENCY_ACTION_KIDS_ONBOARDING";W[W.LATENCY_ACTION_KIDS_VOICE_SEARCH]="LATENCY_ACTION_KIDS_VOICE_SEARCH";W[W.LATENCY_ACTION_KIDS_CURATED_COLLECTION]="LATENCY_ACTION_KIDS_CURATED_COLLECTION";W[W.LATENCY_ACTION_KIDS_LIBRARY]="LATENCY_ACTION_KIDS_LIBRARY";W[W.LATENCY_ACTION_CREATOR_PROMOTION_LIST]="LATENCY_ACTION_CREATOR_PROMOTION_LIST";W[W.LATENCY_ACTION_CREATOR_PROMOTION_EDIT]="LATENCY_ACTION_CREATOR_PROMOTION_EDIT";
W[W.LATENCY_ACTION_CREATOR_VIDEO_TRANSLATIONS]="LATENCY_ACTION_CREATOR_VIDEO_TRANSLATIONS";W[W.LATENCY_ACTION_CREATOR_VIDEO_MONETIZATION]="LATENCY_ACTION_CREATOR_VIDEO_MONETIZATION";W[W.LATENCY_ACTION_CREATOR_VIDEO_LIVE_STREAMING]="LATENCY_ACTION_CREATOR_VIDEO_LIVE_STREAMING";W[W.LATENCY_ACTION_CREATOR_VIDEO_LIVE_SETTINGS]="LATENCY_ACTION_CREATOR_VIDEO_LIVE_SETTINGS";W[W.LATENCY_ACTION_CREATOR_VIDEO_EDITOR_ASYNC]="LATENCY_ACTION_CREATOR_VIDEO_EDITOR_ASYNC";
W[W.LATENCY_ACTION_CREATOR_VIDEO_EDITOR]="LATENCY_ACTION_CREATOR_VIDEO_EDITOR";W[W.LATENCY_ACTION_CREATOR_VIDEO_EDIT]="LATENCY_ACTION_CREATOR_VIDEO_EDIT";W[W.LATENCY_ACTION_CREATOR_VIDEO_COMMENTS]="LATENCY_ACTION_CREATOR_VIDEO_COMMENTS";W[W.LATENCY_ACTION_CREATOR_VIDEO_ANALYTICS]="LATENCY_ACTION_CREATOR_VIDEO_ANALYTICS";W[W.LATENCY_ACTION_CREATOR_SONG_ANALYTICS]="LATENCY_ACTION_CREATOR_SONG_ANALYTICS";W[W.LATENCY_ACTION_CREATOR_POST_LIST]="LATENCY_ACTION_CREATOR_POST_LIST";
W[W.LATENCY_ACTION_CREATOR_POST_EDIT]="LATENCY_ACTION_CREATOR_POST_EDIT";W[W.LATENCY_ACTION_CREATOR_POST_COMMENTS]="LATENCY_ACTION_CREATOR_POST_COMMENTS";W[W.LATENCY_ACTION_CREATOR_LIVE_STREAMING]="LATENCY_ACTION_CREATOR_LIVE_STREAMING";W[W.LATENCY_ACTION_CREATOR_DIALOG_VIDEO_COPYRIGHT]="LATENCY_ACTION_CREATOR_DIALOG_VIDEO_COPYRIGHT";W[W.LATENCY_ACTION_CREATOR_DIALOG_UPLOADS]="LATENCY_ACTION_CREATOR_DIALOG_UPLOADS";W[W.LATENCY_ACTION_CREATOR_DIALOG_COPYRIGHT_STRIKES]="LATENCY_ACTION_CREATOR_DIALOG_COPYRIGHT_STRIKES";
W[W.LATENCY_ACTION_CREATOR_CHANNEL_VIDEOS]="LATENCY_ACTION_CREATOR_CHANNEL_VIDEOS";W[W.LATENCY_ACTION_CREATOR_CHANNEL_TRANSLATIONS]="LATENCY_ACTION_CREATOR_CHANNEL_TRANSLATIONS";W[W.LATENCY_ACTION_CREATOR_CHANNEL_PLAYLISTS]="LATENCY_ACTION_CREATOR_CHANNEL_PLAYLISTS";W[W.LATENCY_ACTION_CREATOR_CHANNEL_MUSIC_STOREFRONT]="LATENCY_ACTION_CREATOR_CHANNEL_MUSIC_STOREFRONT";W[W.LATENCY_ACTION_CREATOR_CHANNEL_MUSIC]="LATENCY_ACTION_CREATOR_CHANNEL_MUSIC";W[W.LATENCY_ACTION_CREATOR_CHANNEL_MONETIZATION]="LATENCY_ACTION_CREATOR_CHANNEL_MONETIZATION";
W[W.LATENCY_ACTION_CREATOR_CHANNEL_EDITING]="LATENCY_ACTION_CREATOR_CHANNEL_EDITING";W[W.LATENCY_ACTION_CREATOR_CHANNEL_DASHBOARD]="LATENCY_ACTION_CREATOR_CHANNEL_DASHBOARD";W[W.LATENCY_ACTION_CREATOR_CHANNEL_COPYRIGHT]="LATENCY_ACTION_CREATOR_CHANNEL_COPYRIGHT";W[W.LATENCY_ACTION_CREATOR_CMS_ISSUES]="LATENCY_ACTION_CREATOR_CMS_ISSUES";W[W.LATENCY_ACTION_CREATOR_CHANNEL_COMMENTS]="LATENCY_ACTION_CREATOR_CHANNEL_COMMENTS";W[W.LATENCY_ACTION_CREATOR_CHANNEL_ANALYTICS]="LATENCY_ACTION_CREATOR_CHANNEL_ANALYTICS";
W[W.LATENCY_ACTION_CREATOR_ARTIST_PROFILE]="LATENCY_ACTION_CREATOR_ARTIST_PROFILE";W[W.LATENCY_ACTION_CREATOR_ARTIST_CONCERTS]="LATENCY_ACTION_CREATOR_ARTIST_CONCERTS";W[W.LATENCY_ACTION_CREATOR_ARTIST_ANALYTICS]="LATENCY_ACTION_CREATOR_ARTIST_ANALYTICS";W[W.LATENCY_ACTION_CREATOR_ANALYTICS_EXPLORE]="LATENCY_ACTION_CREATOR_ANALYTICS_EXPLORE";W[W.LATENCY_ACTION_EXPERIMENTAL_WATCH_UI]="LATENCY_ACTION_EXPERIMENTAL_WATCH_UI";W[W.LATENCY_ACTION_STORYBOARD_THUMBNAILS]="LATENCY_ACTION_STORYBOARD_THUMBNAILS";
W[W.LATENCY_ACTION_SEARCH_THUMBNAILS]="LATENCY_ACTION_SEARCH_THUMBNAILS";W[W.LATENCY_ACTION_ON_DEVICE_MODEL_DOWNLOAD]="LATENCY_ACTION_ON_DEVICE_MODEL_DOWNLOAD";W[W.LATENCY_ACTION_VOICE_ASSISTANT]="LATENCY_ACTION_VOICE_ASSISTANT";W[W.LATENCY_ACTION_SEARCH_UI]="LATENCY_ACTION_SEARCH_UI";W[W.LATENCY_ACTION_SUGGEST]="LATENCY_ACTION_SUGGEST";W[W.LATENCY_ACTION_AUTO_SEARCH]="LATENCY_ACTION_AUTO_SEARCH";W[W.LATENCY_ACTION_DOWNLOADS]="LATENCY_ACTION_DOWNLOADS";W[W.LATENCY_ACTION_EXPLORE]="LATENCY_ACTION_EXPLORE";
W[W.LATENCY_ACTION_VIDEO_LIST]="LATENCY_ACTION_VIDEO_LIST";W[W.LATENCY_ACTION_HOME_RESUME]="LATENCY_ACTION_HOME_RESUME";W[W.LATENCY_ACTION_SUBSCRIPTIONS_LIST]="LATENCY_ACTION_SUBSCRIPTIONS_LIST";W[W.LATENCY_ACTION_THUMBNAIL_LOAD]="LATENCY_ACTION_THUMBNAIL_LOAD";W[W.LATENCY_ACTION_FIRST_THUMBNAIL_LOAD]="LATENCY_ACTION_FIRST_THUMBNAIL_LOAD";W[W.LATENCY_ACTION_SUBSCRIPTIONS_FEED]="LATENCY_ACTION_SUBSCRIPTIONS_FEED";W[W.LATENCY_ACTION_SUBSCRIPTIONS]="LATENCY_ACTION_SUBSCRIPTIONS";
W[W.LATENCY_ACTION_TRENDING]="LATENCY_ACTION_TRENDING";W[W.LATENCY_ACTION_LIBRARY]="LATENCY_ACTION_LIBRARY";W[W.LATENCY_ACTION_VIDEO_THUMBNAIL]="LATENCY_ACTION_VIDEO_THUMBNAIL";W[W.LATENCY_ACTION_SHOW_MORE]="LATENCY_ACTION_SHOW_MORE";W[W.LATENCY_ACTION_VIDEO_PREVIEW]="LATENCY_ACTION_VIDEO_PREVIEW";W[W.LATENCY_ACTION_AD_TO_AD]="LATENCY_ACTION_AD_TO_AD";W[W.LATENCY_ACTION_VIDEO_TO_AD]="LATENCY_ACTION_VIDEO_TO_AD";W[W.LATENCY_ACTION_AD_TO_VIDEO]="LATENCY_ACTION_AD_TO_VIDEO";
W[W.LATENCY_ACTION_DIRECT_PLAYBACK]="LATENCY_ACTION_DIRECT_PLAYBACK";W[W.LATENCY_ACTION_PREBUFFER_VIDEO]="LATENCY_ACTION_PREBUFFER_VIDEO";W[W.LATENCY_ACTION_PREFETCH_VIDEO]="LATENCY_ACTION_PREFETCH_VIDEO";W[W.LATENCY_ACTION_STARTUP]="LATENCY_ACTION_STARTUP";W[W.LATENCY_ACTION_ONBOARDING]="LATENCY_ACTION_ONBOARDING";W[W.LATENCY_ACTION_LOGIN]="LATENCY_ACTION_LOGIN";W[W.LATENCY_ACTION_REEL_WATCH]="LATENCY_ACTION_REEL_WATCH";W[W.LATENCY_ACTION_WATCH]="LATENCY_ACTION_WATCH";
W[W.LATENCY_ACTION_RESULTS]="LATENCY_ACTION_RESULTS";W[W.LATENCY_ACTION_CHANNELS]="LATENCY_ACTION_CHANNELS";W[W.LATENCY_ACTION_HOME]="LATENCY_ACTION_HOME";W[W.LATENCY_ACTION_BROWSE]="LATENCY_ACTION_BROWSE";W[W.LATENCY_ACTION_USER_ACTION]="LATENCY_ACTION_USER_ACTION";W[W.LATENCY_ACTION_INFRASTRUCTURE]="LATENCY_ACTION_INFRASTRUCTURE";W[W.LATENCY_ACTION_PAGE_NAVIGATION]="LATENCY_ACTION_PAGE_NAVIGATION";W[W.LATENCY_ACTION_UNKNOWN]="LATENCY_ACTION_UNKNOWN";
var Ot={LATENCY_NETWORK_MOBILE:2,LATENCY_NETWORK_WIFI:1,LATENCY_NETWORK_UNKNOWN:0};Ot[Ot.LATENCY_NETWORK_MOBILE]="LATENCY_NETWORK_MOBILE";Ot[Ot.LATENCY_NETWORK_WIFI]="LATENCY_NETWORK_WIFI";Ot[Ot.LATENCY_NETWORK_UNKNOWN]="LATENCY_NETWORK_UNKNOWN";var X={CONN_INVALID:31,CONN_CELLULAR_5G_NSA:12,CONN_CELLULAR_5G_SA:11,CONN_WIFI_METERED:10,CONN_CELLULAR_5G:9,CONN_DISCO:8,CONN_CELLULAR_UNKNOWN:7,CONN_CELLULAR_4G:6,CONN_CELLULAR_3G:5,CONN_CELLULAR_2G:4,CONN_WIFI:3,CONN_NONE:2,CONN_UNKNOWN:1,CONN_DEFAULT:0};
X[X.CONN_INVALID]="CONN_INVALID";X[X.CONN_CELLULAR_5G_NSA]="CONN_CELLULAR_5G_NSA";X[X.CONN_CELLULAR_5G_SA]="CONN_CELLULAR_5G_SA";X[X.CONN_WIFI_METERED]="CONN_WIFI_METERED";X[X.CONN_CELLULAR_5G]="CONN_CELLULAR_5G";X[X.CONN_DISCO]="CONN_DISCO";X[X.CONN_CELLULAR_UNKNOWN]="CONN_CELLULAR_UNKNOWN";X[X.CONN_CELLULAR_4G]="CONN_CELLULAR_4G";X[X.CONN_CELLULAR_3G]="CONN_CELLULAR_3G";X[X.CONN_CELLULAR_2G]="CONN_CELLULAR_2G";X[X.CONN_WIFI]="CONN_WIFI";X[X.CONN_NONE]="CONN_NONE";X[X.CONN_UNKNOWN]="CONN_UNKNOWN";
X[X.CONN_DEFAULT]="CONN_DEFAULT";
var Y={DETAILED_NETWORK_TYPE_NR_NSA:126,DETAILED_NETWORK_TYPE_NR_SA:125,DETAILED_NETWORK_TYPE_INTERNAL_WIFI_IMPAIRED:124,DETAILED_NETWORK_TYPE_APP_WIFI_HOTSPOT:123,DETAILED_NETWORK_TYPE_DISCONNECTED:122,DETAILED_NETWORK_TYPE_NON_MOBILE_UNKNOWN:121,DETAILED_NETWORK_TYPE_MOBILE_UNKNOWN:120,DETAILED_NETWORK_TYPE_WIMAX:119,DETAILED_NETWORK_TYPE_ETHERNET:118,DETAILED_NETWORK_TYPE_BLUETOOTH:117,DETAILED_NETWORK_TYPE_WIFI:116,DETAILED_NETWORK_TYPE_LTE:115,DETAILED_NETWORK_TYPE_HSPAP:114,DETAILED_NETWORK_TYPE_EHRPD:113,
DETAILED_NETWORK_TYPE_EVDO_B:112,DETAILED_NETWORK_TYPE_UMTS:111,DETAILED_NETWORK_TYPE_IDEN:110,DETAILED_NETWORK_TYPE_HSUPA:109,DETAILED_NETWORK_TYPE_HSPA:108,DETAILED_NETWORK_TYPE_HSDPA:107,DETAILED_NETWORK_TYPE_EVDO_A:106,DETAILED_NETWORK_TYPE_EVDO_0:105,DETAILED_NETWORK_TYPE_CDMA:104,DETAILED_NETWORK_TYPE_1_X_RTT:103,DETAILED_NETWORK_TYPE_GPRS:102,DETAILED_NETWORK_TYPE_EDGE:101,DETAILED_NETWORK_TYPE_UNKNOWN:0};Y[Y.DETAILED_NETWORK_TYPE_NR_NSA]="DETAILED_NETWORK_TYPE_NR_NSA";
Y[Y.DETAILED_NETWORK_TYPE_NR_SA]="DETAILED_NETWORK_TYPE_NR_SA";Y[Y.DETAILED_NETWORK_TYPE_INTERNAL_WIFI_IMPAIRED]="DETAILED_NETWORK_TYPE_INTERNAL_WIFI_IMPAIRED";Y[Y.DETAILED_NETWORK_TYPE_APP_WIFI_HOTSPOT]="DETAILED_NETWORK_TYPE_APP_WIFI_HOTSPOT";Y[Y.DETAILED_NETWORK_TYPE_DISCONNECTED]="DETAILED_NETWORK_TYPE_DISCONNECTED";Y[Y.DETAILED_NETWORK_TYPE_NON_MOBILE_UNKNOWN]="DETAILED_NETWORK_TYPE_NON_MOBILE_UNKNOWN";Y[Y.DETAILED_NETWORK_TYPE_MOBILE_UNKNOWN]="DETAILED_NETWORK_TYPE_MOBILE_UNKNOWN";
Y[Y.DETAILED_NETWORK_TYPE_WIMAX]="DETAILED_NETWORK_TYPE_WIMAX";Y[Y.DETAILED_NETWORK_TYPE_ETHERNET]="DETAILED_NETWORK_TYPE_ETHERNET";Y[Y.DETAILED_NETWORK_TYPE_BLUETOOTH]="DETAILED_NETWORK_TYPE_BLUETOOTH";Y[Y.DETAILED_NETWORK_TYPE_WIFI]="DETAILED_NETWORK_TYPE_WIFI";Y[Y.DETAILED_NETWORK_TYPE_LTE]="DETAILED_NETWORK_TYPE_LTE";Y[Y.DETAILED_NETWORK_TYPE_HSPAP]="DETAILED_NETWORK_TYPE_HSPAP";Y[Y.DETAILED_NETWORK_TYPE_EHRPD]="DETAILED_NETWORK_TYPE_EHRPD";Y[Y.DETAILED_NETWORK_TYPE_EVDO_B]="DETAILED_NETWORK_TYPE_EVDO_B";
Y[Y.DETAILED_NETWORK_TYPE_UMTS]="DETAILED_NETWORK_TYPE_UMTS";Y[Y.DETAILED_NETWORK_TYPE_IDEN]="DETAILED_NETWORK_TYPE_IDEN";Y[Y.DETAILED_NETWORK_TYPE_HSUPA]="DETAILED_NETWORK_TYPE_HSUPA";Y[Y.DETAILED_NETWORK_TYPE_HSPA]="DETAILED_NETWORK_TYPE_HSPA";Y[Y.DETAILED_NETWORK_TYPE_HSDPA]="DETAILED_NETWORK_TYPE_HSDPA";Y[Y.DETAILED_NETWORK_TYPE_EVDO_A]="DETAILED_NETWORK_TYPE_EVDO_A";Y[Y.DETAILED_NETWORK_TYPE_EVDO_0]="DETAILED_NETWORK_TYPE_EVDO_0";Y[Y.DETAILED_NETWORK_TYPE_CDMA]="DETAILED_NETWORK_TYPE_CDMA";
Y[Y.DETAILED_NETWORK_TYPE_1_X_RTT]="DETAILED_NETWORK_TYPE_1_X_RTT";Y[Y.DETAILED_NETWORK_TYPE_GPRS]="DETAILED_NETWORK_TYPE_GPRS";Y[Y.DETAILED_NETWORK_TYPE_EDGE]="DETAILED_NETWORK_TYPE_EDGE";Y[Y.DETAILED_NETWORK_TYPE_UNKNOWN]="DETAILED_NETWORK_TYPE_UNKNOWN";var Pt={LATENCY_PLAYER_RTSP:7,LATENCY_PLAYER_HTML5_INLINE:6,LATENCY_PLAYER_HTML5_FULLSCREEN:5,LATENCY_PLAYER_HTML5:4,LATENCY_PLAYER_FRAMEWORK:3,LATENCY_PLAYER_FLASH:2,LATENCY_PLAYER_EXO:1,LATENCY_PLAYER_UNKNOWN:0};Pt[Pt.LATENCY_PLAYER_RTSP]="LATENCY_PLAYER_RTSP";
Pt[Pt.LATENCY_PLAYER_HTML5_INLINE]="LATENCY_PLAYER_HTML5_INLINE";Pt[Pt.LATENCY_PLAYER_HTML5_FULLSCREEN]="LATENCY_PLAYER_HTML5_FULLSCREEN";Pt[Pt.LATENCY_PLAYER_HTML5]="LATENCY_PLAYER_HTML5";Pt[Pt.LATENCY_PLAYER_FRAMEWORK]="LATENCY_PLAYER_FRAMEWORK";Pt[Pt.LATENCY_PLAYER_FLASH]="LATENCY_PLAYER_FLASH";Pt[Pt.LATENCY_PLAYER_EXO]="LATENCY_PLAYER_EXO";Pt[Pt.LATENCY_PLAYER_UNKNOWN]="LATENCY_PLAYER_UNKNOWN";
var Qt={LATENCY_AD_BREAK_TYPE_POSTROLL:3,LATENCY_AD_BREAK_TYPE_MIDROLL:2,LATENCY_AD_BREAK_TYPE_PREROLL:1,LATENCY_AD_BREAK_TYPE_UNKNOWN:0};Qt[Qt.LATENCY_AD_BREAK_TYPE_POSTROLL]="LATENCY_AD_BREAK_TYPE_POSTROLL";Qt[Qt.LATENCY_AD_BREAK_TYPE_MIDROLL]="LATENCY_AD_BREAK_TYPE_MIDROLL";Qt[Qt.LATENCY_AD_BREAK_TYPE_PREROLL]="LATENCY_AD_BREAK_TYPE_PREROLL";Qt[Qt.LATENCY_AD_BREAK_TYPE_UNKNOWN]="LATENCY_AD_BREAK_TYPE_UNKNOWN";var Rt={LATENCY_ACTION_ERROR_STARTUP_TIMEOUT:1,LATENCY_ACTION_ERROR_UNSPECIFIED:0};
Rt[Rt.LATENCY_ACTION_ERROR_STARTUP_TIMEOUT]="LATENCY_ACTION_ERROR_STARTUP_TIMEOUT";Rt[Rt.LATENCY_ACTION_ERROR_UNSPECIFIED]="LATENCY_ACTION_ERROR_UNSPECIFIED";var St={LIVE_STREAM_MODE_WINDOW:5,LIVE_STREAM_MODE_POST:4,LIVE_STREAM_MODE_LP:3,LIVE_STREAM_MODE_LIVE:2,LIVE_STREAM_MODE_DVR:1,LIVE_STREAM_MODE_UNKNOWN:0};St[St.LIVE_STREAM_MODE_WINDOW]="LIVE_STREAM_MODE_WINDOW";St[St.LIVE_STREAM_MODE_POST]="LIVE_STREAM_MODE_POST";St[St.LIVE_STREAM_MODE_LP]="LIVE_STREAM_MODE_LP";
St[St.LIVE_STREAM_MODE_LIVE]="LIVE_STREAM_MODE_LIVE";St[St.LIVE_STREAM_MODE_DVR]="LIVE_STREAM_MODE_DVR";St[St.LIVE_STREAM_MODE_UNKNOWN]="LIVE_STREAM_MODE_UNKNOWN";var Tt={VIDEO_STREAM_TYPE_VOD:3,VIDEO_STREAM_TYPE_DVR:2,VIDEO_STREAM_TYPE_LIVE:1,VIDEO_STREAM_TYPE_UNSPECIFIED:0};Tt[Tt.VIDEO_STREAM_TYPE_VOD]="VIDEO_STREAM_TYPE_VOD";Tt[Tt.VIDEO_STREAM_TYPE_DVR]="VIDEO_STREAM_TYPE_DVR";Tt[Tt.VIDEO_STREAM_TYPE_LIVE]="VIDEO_STREAM_TYPE_LIVE";Tt[Tt.VIDEO_STREAM_TYPE_UNSPECIFIED]="VIDEO_STREAM_TYPE_UNSPECIFIED";
var Ut={YT_IDB_TRANSACTION_TYPE_READ:2,YT_IDB_TRANSACTION_TYPE_WRITE:1,YT_IDB_TRANSACTION_TYPE_UNKNOWN:0};Ut[Ut.YT_IDB_TRANSACTION_TYPE_READ]="YT_IDB_TRANSACTION_TYPE_READ";Ut[Ut.YT_IDB_TRANSACTION_TYPE_WRITE]="YT_IDB_TRANSACTION_TYPE_WRITE";Ut[Ut.YT_IDB_TRANSACTION_TYPE_UNKNOWN]="YT_IDB_TRANSACTION_TYPE_UNKNOWN";var Vt={PLAYER_ROTATION_TYPE_PORTRAIT_TO_FULLSCREEN:2,PLAYER_ROTATION_TYPE_FULLSCREEN_TO_PORTRAIT:1,PLAYER_ROTATION_TYPE_UNKNOWN:0};Vt[Vt.PLAYER_ROTATION_TYPE_PORTRAIT_TO_FULLSCREEN]="PLAYER_ROTATION_TYPE_PORTRAIT_TO_FULLSCREEN";
Vt[Vt.PLAYER_ROTATION_TYPE_FULLSCREEN_TO_PORTRAIT]="PLAYER_ROTATION_TYPE_FULLSCREEN_TO_PORTRAIT";Vt[Vt.PLAYER_ROTATION_TYPE_UNKNOWN]="PLAYER_ROTATION_TYPE_UNKNOWN";var Wt="actionVisualElement spinnerInfo resourceInfo playerInfo commentInfo mdxInfo watchInfo thumbnailLoadInfo creatorInfo unpluggedInfo reelInfo subscriptionsFeedInfo requestIds mediaBrowserActionInfo musicLoadActionInfo shoppingInfo webViewInfo prefetchInfo accelerationSession commerceInfo webInfo tvInfo kabukiInfo mwebInfo musicInfo".split(" ");var Xt=z.ytLoggingLatencyUsageStats_||{};A("ytLoggingLatencyUsageStats_",Xt);function Yt(){this.i=0}
function Zt(){Yt.i||(Yt.i=new Yt);return Yt.i}
Yt.prototype.tick=function(a,b,c,d){$t(this,"tick_"+a+"_"+b)||(c={timestamp:c,cttAuthInfo:d},M("web_csi_via_jspb")?(d=new Mj,D(d,1,a),D(d,2,b),a=new Pj,be(a,Mj,5,kk,d),hr(a,c)):cm("latencyActionTicked",{tickName:a,clientActionNonce:b},c))};
Yt.prototype.info=function(a,b,c){var d=Object.keys(a).join("");$t(this,"info_"+d+"_"+b)||(a=Object.assign({},a),a.clientActionNonce=b,cm("latencyActionInfo",a,{cttAuthInfo:c}))};
Yt.prototype.jspbInfo=function(a,b,c){for(var d="",e=0;e<a.toJSON().length;e++)void 0!==a.toJSON()[e]&&(d=0===e?d.concat(""+e):d.concat("_"+e));$t(this,"info_"+d+"_"+b)||(D(a,2,b),b={cttAuthInfo:c},c=new Pj,be(c,Ij,7,kk,a),hr(c,b))};
Yt.prototype.span=function(a,b,c){var d=Object.keys(a).join("");$t(this,"span_"+d+"_"+b)||(a.clientActionNonce=b,cm("latencyActionSpan",a,{cttAuthInfo:c}))};
function $t(a,b){Xt[b]=Xt[b]||{count:0};var c=Xt[b];c.count++;c.time=R();a.i||(a.i=Kl(function(){var d=R(),e;for(e in Xt)Xt[e]&&6E4<d-Xt[e].time&&delete Xt[e];a&&(a.i=0)},5E3));
return 5<c.count?(6===c.count&&1>1E5*Math.random()&&(c=new P("CSI data exceeded logging limit with key",b.split("_")),0<=b.indexOf("plev")||Ir(c)),!0):!1}
;function au(){var a=["ol"];Ft("").info.actionType="embed";a&&Bk("TIMING_AFT_KEYS",a);Bk("TIMING_ACTION","embed");if(M("web_csi_via_jspb")){a=L("TIMING_INFO",{});var b=new Ij;a=p(Object.entries(a));for(var c=a.next();!c.done;c=a.next()){var d=p(c.value);c=d.next().value;d=d.next().value;switch(c){case "GetBrowse_rid":var e=new Lj;D(e,1,c);D(e,2,String(d));Kj(b,e);break;case "GetGuide_rid":e=new Lj;D(e,1,c);D(e,2,String(d));Kj(b,e);break;case "GetHome_rid":e=new Lj;D(e,1,c);D(e,2,String(d));Kj(b,e);
break;case "GetPlayer_rid":e=new Lj;D(e,1,c);D(e,2,String(d));Kj(b,e);break;case "GetSearch_rid":e=new Lj;D(e,1,c);D(e,2,String(d));Kj(b,e);break;case "GetSettings_rid":e=new Lj;D(e,1,c);D(e,2,String(d));Kj(b,e);break;case "GetTrending_rid":e=new Lj;D(e,1,c);D(e,2,String(d));Kj(b,e);break;case "GetWatchNext_rid":e=new Lj;D(e,1,c);D(e,2,String(d));Kj(b,e);break;case "yt_red":D(b,14,!!d);break;case "yt_ad":D(b,9,!!d)}}bu(b);b=new Ij;b=D(b,25,!0);b=D(b,1,W[Mt(L("TIMING_ACTION"))]);(a=L("PREVIOUS_ACTION"))&&
D(b,13,W[Mt(a)]);(a=L("CLIENT_PROTOCOL"))&&D(b,33,a);(a=L("CLIENT_TRANSPORT"))&&D(b,34,a);(a=$r())&&"UNDEFINED_CSN"!==a&&D(b,4,a);a=cu();1!==a&&-1!==a||D(b,6,!0);a=ut();D(b,3,"cold");du(a);a=eu();if(0<a.length)for(a=p(a),c=a.next();!c.done;c=a.next())c=c.value,d=new Hj,D(d,1,c),de(b,83,Hj,d);bu(b)}else{a=L("TIMING_INFO",{});for(b in a)a.hasOwnProperty(b)&&fu(b,a[b]);b={isNavigation:!0,actionType:Mt(L("TIMING_ACTION"))};if(a=L("PREVIOUS_ACTION"))b.previousAction=Mt(a);if(a=L("CLIENT_PROTOCOL"))b.httpProtocol=
a;if(a=L("CLIENT_TRANSPORT"))b.transportProtocol=a;(a=$r())&&"UNDEFINED_CSN"!==a&&(b.clientScreenNonce=a);a=cu();if(1===a||-1===a)b.isVisible=!0;ut();b.loadType="cold";du(ut());a=eu();if(0<a.length)for(b.resourceInfo=[],a=p(a),c=a.next();!c.done;c=a.next())b.resourceInfo.push({resourceCache:c.value});gu(b)}b=ut();a=zt();if(!(M("skip_setting_info_in_csi_data_object")&&"cold"!==vt().loadType||"cold"!==b.yt_lt&&"cold"!==a.loadType)){c=wt();d=xt();d=d.gelTicks?d.gelTicks:d.gelTicks={};for(var f in c)if(!(f in
d))if("number"===typeof c[f])Z(f,pt(f));else if(M("log_repeated_ytcsi_ticks")){e=p(c[f]);for(var g=e.next();!g.done;g=e.next())Z(f.slice(1),g.value)}f={};c=!1;d=p(Object.keys(b));for(e=d.next();!e.done;e=d.next())e=e.value,(e=Nt(e,b[e]))&&!Ct(zt(),e)&&(ct(a,e),ct(f,e),c=!0);c&&gu(f)}A("ytglobal.timingready_",!0);f=L("TIMING_ACTION");B("ytglobal.timingready_")&&f&&"_start"in wt()&&ot()&&Bt()}
function fu(a,b,c,d){if(null!==b){var e=ut(c);M("skip_setting_info_in_csi_data_object")?"yt_lt"===a&&(e="string"===typeof b?b:""+b,vt(c).loadType=e):e[a]=b;(a=Nt(a,b,c))&&gu(a,c,d)}}
function gu(a,b,c){if(!M("web_csi_via_jspb")||(void 0===c?0:c))c=Ft(b||""),ct(c.info,a),M("skip_setting_info_in_csi_data_object")&&a.loadType&&(c=a.loadType,vt(b).loadType=c),ct(zt(b),a),c=At(b),b=tt(b).cttAuthInfo,Zt().info(a,c,b);else{c=new Ij;var d=Object.keys(a);a=Object.values(a);for(var e=0;e<d.length;e++){var f=d[e];try{switch(f){case "actionType":D(c,1,W[a[e]]);break;case "clientActionNonce":D(c,2,a[e]);break;case "clientScreenNonce":D(c,4,a[e]);break;case "loadType":D(c,3,a[e]);break;case "isPrewarmedLaunch":D(c,
92,a[e]);break;case "isFirstInstall":D(c,55,a[e]);break;case "networkType":D(c,5,Ot[a[e]]);break;case "connectionType":D(c,26,X[a[e]]);break;case "detailedConnectionType":D(c,27,Y[a[e]]);break;case "isVisible":D(c,6,a[e]);break;case "playerType":D(c,7,Pt[a[e]]);break;case "clientPlaybackNonce":D(c,8,a[e]);break;case "adClientPlaybackNonce":D(c,28,a[e]);break;case "previousCpn":D(c,77,a[e]);break;case "targetCpn":D(c,76,a[e]);break;case "isMonetized":D(c,9,a[e]);break;case "isPrerollAllowed":D(c,16,
a[e]);break;case "isPrerollShown":D(c,17,a[e]);break;case "adType":D(c,12,a[e]);break;case "adTypesAllowed":D(c,36,a[e]);break;case "adNetworks":D(c,37,a[e]);break;case "previousAction":D(c,13,W[a[e]]);break;case "isRedSubscriber":D(c,14,a[e]);break;case "serverTimeMs":D(c,15,a[e]);break;case "videoId":c.setVideoId(a[e]);break;case "adVideoId":D(c,20,a[e]);break;case "targetVideoId":D(c,78,a[e]);break;case "adBreakType":D(c,21,Qt[a[e]]);break;case "isNavigation":D(c,25,a[e]);break;case "viewportHeight":D(c,
29,a[e]);break;case "viewportWidth":D(c,30,a[e]);break;case "screenHeight":D(c,84,a[e]);break;case "screenWidth":D(c,85,a[e]);break;case "browseId":D(c,31,a[e]);break;case "isCacheHit":D(c,32,a[e]);break;case "httpProtocol":D(c,33,a[e]);break;case "transportProtocol":D(c,34,a[e]);break;case "searchQuery":D(c,41,a[e]);break;case "isContinuation":D(c,42,a[e]);break;case "availableProcessors":D(c,43,a[e]);break;case "sdk":D(c,44,a[e]);break;case "isLocalStream":D(c,45,a[e]);break;case "navigationRequestedSameUrl":D(c,
64,a[e]);break;case "shellStartupDurationMs":D(c,70,a[e]);break;case "appInstallDataAgeMs":D(c,73,a[e]);break;case "latencyActionError":D(c,71,Rt[a[e]]);break;case "actionStep":D(c,79,a[e]);break;case "jsHeapSizeLimit":D(c,80,a[e]);break;case "totalJsHeapSize":D(c,81,a[e]);break;case "usedJsHeapSize":D(c,82,a[e]);break;case "sourceVideoDurationMs":D(c,90,a[e]);break;case "videoOutputFrames":D(c,93,a[e]);break;case "isResume":D(c,104,a[e]);break;case "adPrebufferedTimeSecs":D(c,39,a[e]);break;case "isLivestream":D(c,
47,a[e]);break;case "liveStreamMode":D(c,91,St[a[e]]);break;case "adCpn2":D(c,48,a[e]);break;case "adDaiDriftMillis":D(c,49,a[e]);break;case "videoStreamType":D(c,53,Tt[a[e]]);break;case "playbackRequiresTap":D(c,56,a[e]);break;case "performanceNavigationTiming":D(c,67,a[e]);break;case "transactionType":D(c,74,Ut[a[e]]);break;case "playerRotationType":D(c,101,Vt[a[e]]);break;case "allowedPreroll":D(c,10,a[e]);break;case "shownPreroll":D(c,11,a[e]);break;case "getHomeRequestId":D(c,57,a[e]);break;
case "getSearchRequestId":D(c,60,a[e]);break;case "getPlayerRequestId":D(c,61,a[e]);break;case "getWatchNextRequestId":D(c,62,a[e]);break;case "getBrowseRequestId":D(c,63,a[e]);break;case "getLibraryRequestId":D(c,66,a[e]);break;default:Wt.includes(f)&&Kk(new P("Codegen laipb translator asked to translate message field",""+f))}}catch(g){Kk(Error("Codegen laipb translator failed to set "+f))}}bu(c,b)}}
function bu(a,b){if(M("skip_setting_info_in_csi_data_object")){var c=fe(Ud(a,3),"");c&&(vt(b).loadType=c)}else c=xt(b),c.jspbInfos||(c.jspbInfos=[]),c.jspbInfos.push(ie(a));Ft(b||"").jspbInfo.push(a);c=At(b);b=tt(b).cttAuthInfo;Zt().jspbInfo(a,c,b)}
function Z(a,b,c){if(!b&&"_"!==a[0]){var d=a;S.mark&&(0==d.lastIndexOf("mark_",0)||(d="mark_"+d),c&&(d+=" ("+c+")"),S.mark(d))}d=Ft(c||"");d.tick[a]=b||R();if(d.callback&&d.callback[a]){d=p(d.callback[a]);for(var e=d.next();!e.done;e=d.next())e=e.value,e()}d=xt(c);d.gelTicks&&(d.gelTicks[a]=!0);e=wt(c);d=b||R();M("log_repeated_ytcsi_ticks")?a in e||(e[a]=d):e[a]=d;e=At(c);var f=tt(c).cttAuthInfo;"_start"===a?(a=Zt(),$t(a,"baseline_"+e)||(b={timestamp:b,cttAuthInfo:f},M("web_csi_via_jspb")?(a=new Gj,
D(a,1,e),e=new Pj,be(e,Gj,6,kk,a),hr(e,b)):cm("latencyActionBaselined",{clientActionNonce:e},b))):Zt().tick(a,e,b,f);Bt(c);return d}
function hu(){var a=At();requestAnimationFrame(function(){setTimeout(function(){a===At()&&Z("ol",void 0,void 0)},0)})}
function cu(){var a=document;if("visibilityState"in a)a=a.visibilityState;else{var b=Op+"VisibilityState";a=b in a?a[b]:void 0}switch(a){case "hidden":return 0;case "visible":return 1;case "prerender":return 2;case "unloaded":return 3;default:return-1}}
function du(a){var b=qt(),c=st(),d=L("CSI_START_TIMESTAMP_MILLIS",0);0<d&&!M("embeds_web_enable_csi_start_override_killswitch")&&(c=d);c&&(Z("srt",b.responseStart),1!==a.prerender&&Z("_start",c,void 0));a=Dt();0<a&&Z("fpt",a);a=qt();a.isPerformanceNavigationTiming&&gu({performanceNavigationTiming:!0});Z("nreqs",a.requestStart,void 0);Z("nress",a.responseStart,void 0);Z("nrese",a.responseEnd,void 0);0<a.redirectEnd-a.redirectStart&&(Z("nrs",a.redirectStart,void 0),Z("nre",a.redirectEnd,void 0));0<
a.domainLookupEnd-a.domainLookupStart&&(Z("ndnss",a.domainLookupStart,void 0),Z("ndnse",a.domainLookupEnd,void 0));0<a.connectEnd-a.connectStart&&(Z("ntcps",a.connectStart,void 0),Z("ntcpe",a.connectEnd,void 0));a.secureConnectionStart>=st()&&0<a.connectEnd-a.secureConnectionStart&&(Z("nstcps",a.secureConnectionStart,void 0),Z("ntcpe",a.connectEnd,void 0));S&&"getEntriesByType"in S&&iu()}
function ju(a,b){a=document.querySelector(a);if(!a)return!1;var c="",d=a.nodeName;"SCRIPT"===d?(c=a.src,c||(c=a.getAttribute("data-timing-href"))&&(c=window.location.protocol+c)):"LINK"===d&&(c=a.href);ic()&&a.setAttribute("nonce",ic());return c?(a=S.getEntriesByName(c))&&a[0]&&(a=a[0],c=st(),Z("rsf_"+b,c+Math.round(a.fetchStart)),Z("rse_"+b,c+Math.round(a.responseEnd)),void 0!==a.transferSize&&0===a.transferSize)?!0:!1:!1}
function eu(){var a=[];if(document.querySelector&&S&&S.getEntriesByName)for(var b in nt)if(nt.hasOwnProperty(b)){var c=nt[b];ju(b,c)&&a.push(c)}return a}
function iu(){var a=window.location.protocol,b=S.getEntriesByType("resource");b=gb(b,function(c){return 0===c.name.indexOf(a+"//fonts.gstatic.com/s/")});
(b=ib(b,function(c,d){return d.duration>c.duration?d:c},{duration:0}))&&0<b.startTime&&0<b.responseEnd&&(Z("wffs",rt(b.startTime)),Z("wffe",rt(b.responseEnd)))}
var ku=window;ku.ytcsi&&(ku.ytcsi.info=fu,ku.ytcsi.tick=Z);var lu="tokens consistency mss client_location entities response_received_commands store PLAYER_PRELOAD".split(" "),mu=["type.googleapis.com/youtube.api.pfiinnertube.YoutubeApiInnertube.BrowseResponse"];function nu(a,b,c,d){this.o=a;this.M=b;this.m=c;this.l=d;this.j=void 0;this.i=new Map;a.Pa||(a.Pa={});a.Pa=Object.assign({},bt,a.Pa)}
function ou(a,b,c,d){if(void 0!==nu.i){if(d=nu.i,a=[a!==d.o,b!==d.M,c!==d.m,!1,!1,void 0!==d.j],a.some(function(e){return e}))throw new P("InnerTubeTransportService is already initialized",a);
}else nu.i=new nu(a,b,c,d)}
function pu(a){var b={signalServiceEndpoint:{signal:"GET_DATASYNC_IDS"}};var c=void 0===c?Cs:c;var d=Ls(b,a.o);if(!d)return Df(new P("Error: No request builder found for command.",b));var e=d.o(b,void 0,c);return e?new yf(function(f){var g,h,k;return x(function(m){if(1==m.i){h="cors"===(null==(g=e.za)?void 0:g.mode)?"cors":void 0;if(a.m.wd){var q=e.config,r;q=null==q?void 0:null==(r=q.Za)?void 0:r.sessionIndex;r=Bs({sessionIndex:q});k=Object.assign({},qu(h),r);return m.B(2)}return v(m,ru(e.config,
h),3)}2!=m.i&&(k=m.j);f(su(a,e,k));m.i=0})}):Df(new P("Error: Failed to build request for command.",b))}
function tu(a,b,c){var d;if(b&&!(null==b?0:null==(d=b.yr)?0:d.Br)&&a.l){d=p(lu);for(var e=d.next();!e.done;e=d.next())e=e.value,a.l[e]&&a.l[e].handleResponse(b,c)}}
function su(a,b,c){var d,e,f,g,h,k,m,q,r,w,t,y,E,F,O,N,Q,ca,U,lb,Xa,na,H,la,fa,we,xe,pd;return x(function(pa){switch(pa.i){case 1:pa.B(2);break;case 3:if((d=pa.j)&&!d.isExpired())return pa.return(Promise.resolve(d.i()));case 2:if(null==(e=b)?0:null==(f=e.ia)?0:f.context)for(g=p([]),h=g.next();!h.done;h=g.next())k=h.value,k.ur(b.ia.context);if(null==(m=a.j)||!m.zr(b.input,b.ia)){pa.B(4);break}return v(pa,a.j.qr(b.input,b.ia),5);case 5:return q=pa.j,M("kevlar_process_local_innertube_responses_killswitch")||
tu(a,q,b),pa.return(q);case 4:return(t=null==(w=b.config)?void 0:w.Fa)&&a.i.has(t)&&M("web_memoize_inflight_requests")?r=a.i.get(t):(y=JSON.stringify(b.ia),O=null!=(F=null==(E=b.za)?void 0:E.headers)?F:{},b.za=Object.assign({},b.za,{headers:Object.assign({},O,c)}),N=Object.assign({},b.za),"POST"===b.za.method&&(N=Object.assign({},N,{body:y})),(null==(Q=b.config)?0:Q.jd)&&Z(b.config.jd),ca=function(){return a.M.fetch(b.input,N,b.config)},r=ca(),t&&a.i.set(t,r)),v(pa,r,6);
case 6:U=pa.j;if(M("web_one_platform_error_handling")&&U&&"error"in U&&(null==(lb=U)?0:null==(Xa=lb.error)?0:Xa.details))for(na=U.error.details,H=p(na),la=H.next();!la.done;la=H.next())fa=la.value,(we=fa["@type"])&&-1<mu.indexOf(we)&&(delete fa["@type"],U=fa);t&&a.i.has(t)&&a.i.delete(t);(null==(xe=b.config)?0:xe.kd)&&Z(b.config.kd);if(U||null==(pd=a.j)||!pd.hr(b.input,b.ia)){pa.B(7);break}return v(pa,a.j.pr(b.input,b.ia),8);case 8:U=pa.j;case 7:return tu(a,U,b),pa.return(U||void 0)}})}
function ru(a,b){var c,d,e,f;return x(function(g){if(1==g.i){e=null==(c=a)?void 0:null==(d=c.Za)?void 0:d.sessionIndex;var h=Bs({sessionIndex:e});if(!(h instanceof yf)){var k=new yf(cb);zf(k,2,h);h=k}return v(g,h,2)}f=g.j;return g.return(Promise.resolve(Object.assign({},qu(b),f)))})}
function qu(a){var b={"Content-Type":"application/json"};L("EOM_VISITOR_DATA")?b["X-Goog-EOM-Visitor-Id"]=L("EOM_VISITOR_DATA"):L("VISITOR_DATA")&&(b["X-Goog-Visitor-Id"]=L("VISITOR_DATA"));M("track_webfe_innertube_auth_mismatch")&&(b["X-Youtube-Bootstrap-Logged-In"]=L("LOGGED_IN",!1));"cors"!==a&&((a=L("INNERTUBE_CONTEXT_CLIENT_NAME"))&&(b["X-Youtube-Client-Name"]=a),(a=L("INNERTUBE_CONTEXT_CLIENT_VERSION"))&&(b["X-Youtube-Client-Version"]=a),(a=L("CHROME_CONNECTED_HEADER"))&&(b["X-Youtube-Chrome-Connected"]=
a),(a=L("DOMAIN_ADMIN_STATE"))&&(b["X-Youtube-Domain-Admin-State"]=a));return b}
;var uu=new Ns("INNERTUBE_TRANSPORT_TOKEN");var vu=["share/get_web_player_share_panel"],wu=["feedback"],xu=["notification/modify_channel_preference"],yu=["browse/edit_playlist"],zu=["subscription/subscribe"],Au=["subscription/unsubscribe"];function Bu(){}
u(Bu,Zs);Bu.prototype.l=function(){return zu};
Bu.prototype.i=function(a){return ns(a,vk)||void 0};
Bu.prototype.j=function(a,b,c){c=void 0===c?{}:c;b.channelIds&&(a.channelIds=b.channelIds);b.siloName&&(a.siloName=b.siloName);b.params&&(a.params=b.params);c.botguardResponse&&(a.botguardResponse=c.botguardResponse);c.feature&&(a.clientFeature=c.feature)};
ea.Object.defineProperties(Bu.prototype,{m:{configurable:!0,enumerable:!0,get:function(){return!0}}});function Cu(){}
u(Cu,Zs);Cu.prototype.l=function(){return Au};
Cu.prototype.i=function(a){return ns(a,uk)||void 0};
Cu.prototype.j=function(a,b){b.channelIds&&(a.channelIds=b.channelIds);b.siloName&&(a.siloName=b.siloName);b.params&&(a.params=b.params)};
ea.Object.defineProperties(Cu.prototype,{m:{configurable:!0,enumerable:!0,get:function(){return!0}}});function Du(){}
u(Du,Zs);Du.prototype.l=function(){return wu};
Du.prototype.i=function(a){return ns(a,ej)||void 0};
Du.prototype.j=function(a,b,c){a.feedbackTokens=[];b.feedbackToken&&a.feedbackTokens.push(b.feedbackToken);if(b=b.cpn||c.cpn)a.feedbackContext={cpn:b};a.isFeedbackTokenUnencrypted=!!c.is_feedback_token_unencrypted;a.shouldMerge=!1;c.extra_feedback_tokens&&(a.shouldMerge=!0,a.feedbackTokens=a.feedbackTokens.concat(c.extra_feedback_tokens))};
ea.Object.defineProperties(Du.prototype,{m:{configurable:!0,enumerable:!0,get:function(){return!0}}});function Eu(){}
u(Eu,Zs);Eu.prototype.l=function(){return xu};
Eu.prototype.i=function(a){return ns(a,tk)||void 0};
Eu.prototype.j=function(a,b){b.params&&(a.params=b.params);b.secondaryParams&&(a.secondaryParams=b.secondaryParams)};function Fu(){}
u(Fu,Zs);Fu.prototype.l=function(){return yu};
Fu.prototype.i=function(a){return ns(a,sk)||void 0};
Fu.prototype.j=function(a,b){b.actions&&(a.actions=b.actions);b.params&&(a.params=b.params);b.playlistId&&(a.playlistId=b.playlistId)};function Gu(){}
u(Gu,Zs);Gu.prototype.l=function(){return vu};
Gu.prototype.i=function(a){return ns(a,rk)};
Gu.prototype.j=function(a,b,c){c=void 0===c?{}:c;b.serializedShareEntity&&(a.serializedSharedEntity=b.serializedShareEntity);c.includeListId&&(a.includeListId=!0)};var Ps=new Ns("NETWORK_SLI_TOKEN");function Hu(a){this.i=a}
Hu.prototype.fetch=function(a,b){var c=this,d,e;return x(function(f){c.i&&(d=mc(nc(5,Dc(a,"key")))||"/UNKNOWN_PATH",c.i.start(d));e=new window.Request(a,b);return M("web_fetch_promise_cleanup_killswitch")?f.return(Promise.resolve(fetch(e).then(function(g){return c.handleResponse(g)}).catch(function(g){Ir(g)}))):f.return(fetch(e).then(function(g){return c.handleResponse(g)}).catch(function(g){Ir(g)}))})};
Hu.prototype.handleResponse=function(a){var b=a.text().then(function(c){return JSON.parse(c.replace(")]}'",""))});
a.redirected||a.ok?this.i&&this.i.success():(this.i&&this.i.failure(),b=b.then(function(c){Ir(new P("Error: API fetch failed",a.status,a.url,c));return Object.assign({},c,{errorMetadata:{status:a.status}})}));
return b};
Hu[Ms]=[new Os];var Iu=new Ns("NETWORK_MANAGER_TOKEN");var Ju;function Ku(a){co.call(this,1,arguments);this.csn=a}
u(Ku,co);var mo=new eo("screen-created",Ku),Lu=[],Nu=Mu,Ou=0;function Pu(a,b,c,d,e,f,g){function h(){Ir(new P("newScreen() parent element does not have a VE - rootVe",b))}
var k=Nu(),m=new Tr({veType:b,youtubeData:f,jspbYoutubeData:void 0});f={ba:k};e&&(f.cttAuthInfo=e);M("il_via_jspb")?(e=new vj,e.j(k),wj(e,m.getAsJspb()),c&&c.visualElement?(m=new xj,c.clientScreenNonce&&D(m,2,c.clientScreenNonce),yj(m,c.visualElement.getAsJspb()),g&&D(m,4,lk[g]),G(e,xj,5,m)):c&&h(),d&&D(e,3,d),mr(e,f,a)):(e={csn:k,pageVe:m.getAsJson()},c&&c.visualElement?(e.implicitGesture={parentCsn:c.clientScreenNonce,gesturedVe:c.visualElement.getAsJson()},g&&(e.implicitGesture.gestureType=g)):
c&&h(),d&&(e.cloneCsn=d),a?br("screenCreated",e,a,f):cm("screenCreated",e,f));jo(mo,new Ku(k));return k}
function Qu(a,b,c,d){var e=d.filter(function(k){k.csn!==b?(k.csn=b,k=!0):k=!1;return k}),f={cttAuthInfo:bs(b)||void 0,
ba:b};d=p(d);for(var g=d.next();!g.done;g=d.next())g=g.value.getAsJson(),(rb(g)||!g.trackingParams&&!g.veType)&&Ir(Error("Child VE logged with no data"));if(M("il_via_jspb")){var h=new zj;h.j(b);Bj(h,c.getAsJspb());hb(e,function(k){k=k.getAsJspb();de(h,3,tj,k)});
"UNDEFINED_CSN"===b?Ru("visualElementAttached",f,void 0,h):nr(h,f,a)}else c={csn:b,parentVe:c.getAsJson(),childVes:hb(e,function(k){return k.getAsJson()})},"UNDEFINED_CSN"===b?Ru("visualElementAttached",f,c):a?br("visualElementAttached",c,a,f):cm("visualElementAttached",c,f)}
function Mu(){for(var a=Math.random()+"",b=[],c=0,d=0;d<a.length;d++){var e=a.charCodeAt(d);255<e&&(b[c++]=e&255,e>>=8);b[c++]=e}return ed(b,3)}
function Ru(a,b,c,d){Lu.push({payloadName:a,payload:c,oa:d,options:b});Ou||(Ou=no())}
function oo(a){if(Lu){for(var b=p(Lu),c=b.next();!c.done;c=b.next())if(c=c.value,M("il_via_jspb")&&c.oa)switch(c.oa.j(a.csn),c.payloadName){case "screenCreated":mr(c.oa,c.options);break;case "visualElementAttached":nr(c.oa,c.options);break;case "visualElementShown":ir(c.oa,c.options);break;case "visualElementHidden":jr(c.oa,c.options);break;case "visualElementGestured":kr(c.oa,c.options);break;case "visualElementStateChanged":lr(c.oa,c.options);break;default:Ir(new P("flushQueue unable to map payloadName to JSPB setter"))}else c.payload&&
(c.payload.csn=a.csn,br(c.payloadName,c.payload,null,c.options));Lu.length=0}Ou=0}
;function Su(){this.l=new Set;this.i=new Set;this.m=new Map;this.client=Mp;this.csn=null}
function Tu(){Su.i||(Su.i=new Su);return Su.i}
Su.prototype.j=function(a){this.client=a};
Su.prototype.clear=function(){this.l.clear();this.i.clear();this.m.clear();this.csn=null};function Uu(){this.l=new Set;this.i=new Set;this.m=new Map}
Uu.prototype.j=function(a){M("use_ts_visibilitylogger")&&Tu().j(a)};
Uu.prototype.clear=function(){M("use_ts_visibilitylogger")?Tu().clear():(this.l.clear(),this.i.clear(),this.m.clear())};
Na(Uu);function Vu(){this.s=[];this.N=[];this.i=[];this.o=[];this.C=[];this.l=new Set;this.u=new Map}
Vu.prototype.j=function(a){this.client=a};
function Wu(a,b,c){c=void 0===c?0:c;b.then(function(d){a.l.has(c)&&a.m&&a.m();var e=$r(c),f=Yr(c);if(e&&f){var g;(null==d?0:null==(g=d.response)?0:g.trackingParams)&&Qu(a.client,e,f,[Ur(d.response.trackingParams)]);var h;(null==d?0:null==(h=d.playerResponse)?0:h.trackingParams)&&Qu(a.client,e,f,[Ur(d.playerResponse.trackingParams)])}})}
function Xu(a,b,c,d){d=void 0===d?0:d;if(a.l.has(d))a.s.push([b,c]);else{var e=$r(d);c=c||Yr(d);e&&c&&Qu(a.client,e,c,[b])}}
Vu.prototype.clickCommand=function(a,b,c){var d=a.clickTrackingParams;c=void 0===c?0:c;if(d)if(c=$r(void 0===c?0:c)){a=this.client;var e=Ur(d);d={cttAuthInfo:bs(c)||void 0,ba:c};M("il_via_jspb")?(b=new Cj,b.j(c),e=e.getAsJspb(),G(b,tj,2,e),D(b,4,lk.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK),"UNDEFINED_CSN"===c?Ru("visualElementGestured",d,void 0,b):kr(b,d,a)):(e={csn:c,ve:e.getAsJson(),gestureType:"INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK"},b&&(e.clientData=b),"UNDEFINED_CSN"===c?Ru("visualElementGestured",
d,e):a?br("visualElementGestured",e,a,d):cm("visualElementGestured",e,d));b=!0}else b=!1;else b=!1;return b};
function Yu(a,b,c){c=void 0===c?{}:c;a.l.add(c.layer||0);a.m=function(){Zu(a,b,c);var f=Yr(c.layer);if(f){for(var g=p(a.s),h=g.next();!h.done;h=g.next())h=h.value,Xu(a,h[0],h[1]||f,c.layer);f=p(a.N);for(g=f.next();!g.done;g=f.next()){var k=g.value;g=void 0;g=void 0===g?0:g;h=$r(g);var m=k[0]||Yr(g);if(h&&m){g=a.client;var q=k[1];k={cttAuthInfo:bs(h)||void 0,ba:h};M("il_via_jspb")?(q=new Fj,q.j(h),m=m.getAsJspb(),G(q,tj,2,m),"UNDEFINED_CSN"===h?Ru("visualElementStateChanged",k,void 0,q):lr(q,k,g)):
(m={csn:h,ve:m.getAsJson(),clientData:q},"UNDEFINED_CSN"===h?Ru("visualElementStateChanged",k,m):g?br("visualElementStateChanged",m,g,k):cm("visualElementStateChanged",m,k))}}}};
$r(c.layer)||a.m();if(c.Xb)for(var d=p(c.Xb),e=d.next();!e.done;e=d.next())Wu(a,e.value,c.layer);else Hr(Error("Delayed screen needs a data promise."))}
function Zu(a,b,c){c=void 0===c?{}:c;c.layer||(c.layer=0);var d=void 0!==c.dd?c.dd:c.layer;var e=$r(d);d=Yr(d);var f;d&&(void 0!==c.parentCsn?f={clientScreenNonce:c.parentCsn,visualElement:d}:e&&"UNDEFINED_CSN"!==e&&(f={clientScreenNonce:e,visualElement:d}));var g,h=L("EVENT_ID");"UNDEFINED_CSN"===e&&h&&(g={servletData:{serializedServletEventId:h}});try{var k=Pu(a.client,b,f,c.Wb,c.cttAuthInfo,g,c.lr)}catch(m){Kr(m,{wr:b,rootVe:d,parentVisualElement:void 0,ir:e,tr:f,Wb:c.Wb});Hr(m);return}cs(k,b,
c.layer,c.cttAuthInfo);if(b=e&&"UNDEFINED_CSN"!==e&&d){a:{b=p(Object.values(Sr));for(f=b.next();!f.done;f=b.next())if($r(f.value)===e){b=!0;break a}b=!1}b=!b}b&&(b=a.client,g=!0,h=(g=void 0===g?!1:g)?16:8,f={cttAuthInfo:bs(e)||void 0,ba:e,Yb:g},M("il_via_jspb")?(h=new Dj,h.j(e),d=d.getAsJspb(),G(h,tj,2,d),D(h,4,g?16:8),"UNDEFINED_CSN"===e?Ru("visualElementHidden",f,void 0,h):jr(h,f,b)):(d={csn:e,ve:d.getAsJson(),eventType:h},"UNDEFINED_CSN"===e?Ru("visualElementHidden",f,d):b?br("visualElementHidden",
d,b,f):cm("visualElementHidden",d,f)));a.i[a.i.length-1]&&!a.i[a.i.length-1].csn&&(a.i[a.i.length-1].csn=k||"");gu({clientScreenNonce:k});d=Uu.getInstance();M("use_ts_visibilitylogger")?(d=Tu(),d.clear(),d.csn=$r()):d.clear();d=Yr(c.layer);e&&"UNDEFINED_CSN"!==e&&d&&(M("web_mark_root_visible")||M("music_web_mark_root_visible"))&&(e=k,k={cttAuthInfo:bs(e)||void 0,ba:e},M("il_via_jspb")?(b=new Ej,b.j(e),f=d.getAsJspb(),G(b,tj,2,f),D(b,4,1),"UNDEFINED_CSN"===e?Ru("visualElementShown",k,void 0,b):ir(b,
k)):(b={csn:e,ve:d.getAsJson(),eventType:1},"UNDEFINED_CSN"===e?Ru("visualElementShown",k,b):cm("visualElementShown",b,k)));a.l.delete(c.layer||0);a.m=void 0;e=p(a.u);for(k=e.next();!k.done;k=e.next())b=p(k.value),k=b.next().value,b=b.next().value,b.has(c.layer)&&d&&Xu(a,k,d,c.layer);for(c=0;c<a.o.length;c++){e=a.o[c];try{e()}catch(m){Hr(m)}}for(c=a.o.length=0;c<a.C.length;c++){e=a.C[c];try{e()}catch(m){Hr(m)}}}
;function $u(){var a,b,c;return x(function(d){if(1==d.i)return a=Us().resolve(uu),a?v(d,pu(a),2):(Ir(Error("InnertubeTransportService unavailable in fetchDatasyncIds")),d.return(void 0));if(b=d.j){if(b.errorMetadata)return Ir(Error("Datasync IDs fetch responded with "+b.errorMetadata.status+": "+b.error)),d.return(void 0);c=b.jr;return d.return(c)}Ir(Error("Network request to get Datasync IDs failed."));return d.return(void 0)})}
;var av=z.caches,bv;function cv(a){var b=a.indexOf(":");return-1===b?{lc:a}:{lc:a.substring(0,b),datasyncId:a.substring(b+1)}}
function dv(){return x(function(a){if(void 0!==bv)return a.return(bv);bv=new Promise(function(b){var c;return x(function(d){switch(d.i){case 1:return ya(d,2),v(d,av.open("test-only"),4);case 4:return v(d,av.delete("test-only"),5);case 5:za(d,3);break;case 2:if(c=Aa(d),c instanceof Error&&"SecurityError"===c.name)return b(!1),d.return();case 3:b("caches"in window),d.i=0}})});
return a.return(bv)})}
function ev(a){var b,c,d,e,f,g,h;x(function(k){if(1==k.i)return v(k,dv(),2);if(3!=k.i){if(!k.j)return k.return(!1);b=[];return v(k,av.keys(),3)}c=k.j;d=p(c);for(e=d.next();!e.done;e=d.next())f=e.value,g=cv(f),h=g.datasyncId,!h||a.includes(h)||b.push(av.delete(f));return k.return(Promise.all(b).then(function(m){return m.some(function(q){return q})}))})}
function fv(){var a,b,c,d,e,f,g;return x(function(h){if(1==h.i)return v(h,dv(),2);if(3!=h.i){if(!h.j)return h.return(!1);a=Rl("cache contains other");return v(h,av.keys(),3)}b=h.j;c=p(b);for(d=c.next();!d.done;d=c.next())if(e=d.value,f=cv(e),(g=f.datasyncId)&&g!==a)return h.return(!0);return h.return(!1)})}
;function gv(){try{return!!self.localStorage}catch(a){return!1}}
;function hv(a){a=a.match(/(.*)::.*::.*/);if(null!==a)return a[1]}
function iv(a){if(gv()){var b=Object.keys(window.localStorage);b=p(b);for(var c=b.next();!c.done;c=b.next()){c=c.value;var d=hv(c);void 0===d||a.includes(d)||self.localStorage.removeItem(c)}}}
function jv(){if(!gv())return!1;var a=Rl(),b=Object.keys(window.localStorage);b=p(b);for(var c=b.next();!c.done;c=b.next())if(c=hv(c.value),void 0!==c&&c!==a)return!0;return!1}
;function kv(){$u().then(function(a){a&&(pn(a),ev(a),iv(a))})}
function lv(){var a=new Qo;Xh.V(function(){var b,c,d,e;return x(function(f){switch(f.i){case 1:if(M("ytidb_clear_optimizations_killswitch")){f.B(2);break}b=Rl("clear");if(b.startsWith("V")){var g=[b];pn(g);ev(g);iv(g);return f.return()}c=jv();return v(f,fv(),3);case 3:return d=f.j,v(f,qn(),4);case 4:if(e=f.j,!c&&!d&&!e)return f.return();case 2:a.W()?kv():a.m.add("publicytnetworkstatus-online",kv,!0,void 0,void 0),f.i=0}})})}
;function mv(a){a&&(a.dataset?a.dataset[nv("loaded")]="true":a.setAttribute("data-loaded","true"))}
function ov(a,b){return a?a.dataset?a.dataset[nv(b)]:a.getAttribute("data-"+b):null}
var pv={};function nv(a){return pv[a]||(pv[a]=String(a).replace(/\-([a-z])/g,function(b,c){return c.toUpperCase()}))}
;var qv=/\.vflset|-vfl[a-zA-Z0-9_+=-]+/,rv=/-[a-zA-Z]{2,3}_[a-zA-Z]{2,3}(?=(\/|$))/;function sv(a,b,c){c=void 0===c?null:c;if(window.spf&&spf.script){c="";if(a){var d=a.indexOf("jsbin/"),e=a.lastIndexOf(".js"),f=d+6;-1<d&&-1<e&&e>f&&(c=a.substring(f,e),c=c.replace(qv,""),c=c.replace(rv,""),c=c.replace("debug-",""),c=c.replace("tracing-",""))}spf.script.load(a,c,b)}else tv(a,b,c)}
function tv(a,b,c){c=void 0===c?null:c;var d=uv(a),e=document.getElementById(d),f=e&&ov(e,"loaded"),g=e&&!f;f?b&&b():(b&&(f=hq(d,b),b=""+Ra(b),vv[b]=f),g||(e=wv(a,d,function(){ov(e,"loaded")||(mv(e),kq(d),dl(Ya(lq,d),0))},c)))}
function wv(a,b,c,d){d=void 0===d?null:d;var e=lf("SCRIPT");e.id=b;e.onload=function(){c&&setTimeout(c,0)};
e.onreadystatechange=function(){switch(e.readyState){case "loaded":case "complete":e.onload()}};
d&&e.setAttribute("nonce",d);Gh(e,Lb(a));a=document.getElementsByTagName("head")[0]||document.body;a.insertBefore(e,a.firstChild);return e}
function xv(a){a=uv(a);var b=document.getElementById(a);b&&(lq(a),b.parentNode.removeChild(b))}
function yv(a,b){a&&b&&(a=""+Ra(b),(a=vv[a])&&jq(a))}
function uv(a){var b=document.createElement("a");fc(b,a);a=b.href.replace(/^[a-zA-Z]+:\/\//,"//");return"js-"+kc(a)}
var vv={};var zv=[],Av=!1;function Bv(){if(!M("disable_biscotti_fetch_for_ad_blocker_detection")&&!M("disable_biscotti_fetch_entirely_for_all_web_clients")&&ps()){var a=L("PLAYER_VARS",{});if("1"!=tb(a)&&!qs(a)){var b=function(){Av=!0;"google_ad_status"in window?Bk("DCLKSTAT",1):Bk("DCLKSTAT",2)};
try{sv("//static.doubleclick.net/instream/ad_status.js",b)}catch(c){}zv.push(Xh.V(function(){if(!(Av||"google_ad_status"in window)){try{yv("//static.doubleclick.net/instream/ad_status.js",b)}catch(c){}Av=!0;Bk("DCLKSTAT",3)}},5E3))}}}
function Cv(){var a=Number(L("DCLKSTAT",0));return isNaN(a)?0:a}
;function Dv(){this.state=1;this.i=null}
l=Dv.prototype;
l.initialize=function(a,b,c){if(a.program){var d,e=null!=(d=a.interpreterScript)?d:null,f;d=null!=(f=a.interpreterUrl)?f:null;a.interpreterSafeScript&&(e=a.interpreterSafeScript,Db("From proto message. b/166824318"),e=e.privateDoNotAccessOrElseSafeScriptWrappedValue||"",e=(f=Ab())?f.createScript(e):e,e=(new Fb(e)).toString());a.interpreterSafeUrl&&(d=a.interpreterSafeUrl,Db("From proto message. b/166824318"),d=Lb(d.privateDoNotAccessOrElseTrustedResourceUrlWrappedValue||"").toString());Ev(this,e,
d,a.program,b,c)}else Ir(Error("Cannot initialize botguard without program"))};
function Ev(a,b,c,d,e,f){var g=void 0===g?"trayride":g;c?(a.state=2,sv(c,function(){window[g]?Fv(a,d,g,e):(a.state=3,xv(c),Ir(new P("Unable to load Botguard","from "+c)))},f)):b?(f=lf("SCRIPT"),f.textContent=b,f.nonce=ic(),document.head.appendChild(f),document.head.removeChild(f),window[g]?Fv(a,d,g,e):(a.state=4,Ir(new P("Unable to load Botguard from JS")))):Ir(new P("Unable to load VM; no url or JS provided"))}
l.isInitialized=function(){return this.Kb()};
function Fv(a,b,c,d){a.state=5;try{var e=new Ch({program:b,globalName:c,gd:M("att_web_record_metrics")});e.td.then(function(){a.state=6;d&&d(b)});
a.Ib(e)}catch(f){a.state=7,f instanceof Error&&Ir(f)}}
l.invoke=function(a){a=void 0===a?{}:a;return this.Kb()?this.Ac({Vb:a}):null};
l.dispose=function(){this.Mb()};
l.Mb=function(){this.Ib(null);this.state=8};
l.Kb=function(){return!!this.i};
l.Ac=function(a){return this.i.vc(a)};
l.Ib=function(a){qe(this.i);this.i=a};function Iv(){var a=B("yt.abuse.playerAttLoader");return a&&["bgvma","bgvmb","bgvmc"].every(function(b){return b in a})?a:null}
;function Jv(){Dv.apply(this,arguments)}
u(Jv,Dv);Jv.prototype.Mb=function(){this.state=8};
Jv.prototype.Ib=function(a){var b;null==(b=Iv())||b.bgvma();a?(b={bgvma:a.dispose.bind(a),bgvmb:a.snapshot.bind(a),bgvmc:a.vc.bind(a)},A("yt.abuse.playerAttLoader",b),A("yt.abuse.playerAttLoaderRun",function(c){return a.snapshot(c)})):(A("yt.abuse.playerAttLoader",null),A("yt.abuse.playerAttLoaderRun",null))};
Jv.prototype.Kb=function(){return!!Iv()};
Jv.prototype.Ac=function(a){return Iv().bgvmc(a)};var Kv=new Jv;var Lv=new Dv;function Mv(){return M("use_player_abuse_bg_library")?Kv.isInitialized():Lv.isInitialized()}
function Nv(a){a=void 0===a?{}:a;M("use_player_abuse_bg_library")?(a=void 0===a?{}:a,a=Kv.invoke(a)):a=Lv.invoke(a);return a}
;function Ov(a){var b=this;var c=void 0===c?0:c;var d=void 0===d?Pl():d;this.m=c;this.l=d;this.j=new Bh;this.i=a;a={};c=p(this.i.entries());for(d=c.next();!d.done;a={Ha:a.Ha,Ra:a.Ra},d=c.next()){var e=p(d.value);d=e.next().value;e=e.next().value;a.Ra=d;a.Ha=e;d=function(f){return function(){f.Ha.Ab();b.i[f.Ra].kb=!0;b.i.every(function(g){return!0===g.kb})&&b.j.resolve()}}(a);
e=Ll(d,Pv(this,a.Ha));this.i[a.Ra]=Object.assign({},a.Ha,{Ab:d,jobId:e})}}
function Qv(a){var b=Array.from(a.i.keys()).sort(function(d,e){return Pv(a,a.i[e])-Pv(a,a.i[d])});
b=p(b);for(var c=b.next();!c.done;c=b.next())c=a.i[c.value],void 0===c.jobId||c.kb||(a.l.ga(c.jobId),Ll(c.Ab,10))}
Ov.prototype.cancel=function(){for(var a=p(this.i),b=a.next();!b.done;b=a.next())b=b.value,void 0===b.jobId||b.kb||this.l.ga(b.jobId),b.kb=!0;this.j.resolve()};
function Pv(a,b){var c;return null!=(c=b.priority)?c:a.m}
;function Rv(a){this.state=a;this.plugins=[];this.s=void 0}
Rv.prototype.install=function(){this.plugins.push.apply(this.plugins,ia(Ja.apply(0,arguments)))};
Rv.prototype.uninstall=function(){var a=this;Ja.apply(0,arguments).forEach(function(b){b=a.plugins.indexOf(b);-1<b&&a.plugins.splice(b,1)})};
Rv.prototype.transition=function(a,b){var c=this,d=this.C.find(function(f){return Array.isArray(f.from)?f.from.find(function(g){return g===c.state&&f.F===a}):f.from===c.state&&f.F===a});
if(d){this.l&&(Qv(this.l),this.l=void 0);this.state=a;d=d.action.bind(this);var e=this.plugins.filter(function(f){return f[a]}).map(function(f){return f[a]});
d(Sv(this,e,this.s),b)}else throw Error("no transition specified from "+this.state+" to "+a);};
function Sv(a,b,c){return function(){var d=Ja.apply(0,arguments),e=b.filter(function(k){var m;return 10===(null!=(m=null!=c?c:k.priority)?m:0)}),f=b.filter(function(k){var m;
return 10!==(null!=(m=null!=c?c:k.priority)?m:0)});
Pl();var g={};e=p(e);for(var h=e.next();!h.done;g={Sa:g.Sa},h=e.next())g.Sa=h.value,Nl(function(k){return function(){k.Sa.callback.apply(k.Sa,ia(d))}}(g));
f=f.map(function(k){var m;return{Ab:function(){k.callback.apply(k,ia(d))},
priority:null!=(m=null!=c?c:k.priority)?m:0}});
f.length&&(a.l=new Ov(f))}}
ea.Object.defineProperties(Rv.prototype,{currentState:{configurable:!0,enumerable:!0,get:function(){return this.state}}});function Tv(a){Rv.call(this,void 0===a?"document_active":a);var b=this;this.s=10;this.i=new Map;this.C=[{from:"document_active",F:"document_disposed_preventable",action:this.N},{from:"document_active",F:"document_disposed",action:this.m},{from:"document_disposed_preventable",F:"document_disposed",action:this.m},{from:"document_disposed_preventable",F:"flush_logs",action:this.o},{from:"document_disposed_preventable",F:"document_active",action:this.j},{from:"document_disposed",F:"flush_logs",action:this.o},
{from:"document_disposed",F:"document_active",action:this.j},{from:"document_disposed",F:"document_disposed",action:function(){}},
{from:"flush_logs",F:"document_active",action:this.j}];window.addEventListener("pagehide",function(c){b.transition("document_disposed",{event:c})});
window.addEventListener("beforeunload",function(c){b.transition("document_disposed_preventable",{event:c})})}
u(Tv,Rv);Tv.prototype.N=function(a,b){if(!this.i.get("document_disposed_preventable")){a(null==b?void 0:b.event);var c,d;if((null==b?0:null==(c=b.event)?0:c.defaultPrevented)||(null==b?0:null==(d=b.event)?0:d.returnValue)){b.event.returnValue||(b.event.returnValue=!0);b.event.defaultPrevented||b.event.preventDefault();this.i=new Map;this.transition("document_active");return}}this.i.set("document_disposed_preventable",!0);this.i.get("document_disposed")?this.transition("flush_logs"):this.transition("document_disposed")};
Tv.prototype.m=function(a,b){this.i.get("document_disposed")?this.transition("document_active"):(a(null==b?void 0:b.event),this.i.set("document_disposed",!0),this.transition("flush_logs"))};
Tv.prototype.o=function(a,b){a(null==b?void 0:b.event);this.transition("document_active")};
Tv.prototype.j=function(){this.i=new Map};function Uv(a){Rv.call(this,void 0===a?"document_visibility_unknown":a);var b=this;this.C=[{from:"document_visibility_unknown",F:"document_visible",action:this.j},{from:"document_visibility_unknown",F:"document_hidden",action:this.i},{from:"document_visibility_unknown",F:"document_foregrounded",action:this.o},{from:"document_visibility_unknown",F:"document_backgrounded",action:this.m},{from:"document_visible",F:"document_hidden",action:this.i},{from:"document_visible",F:"document_foregrounded",action:this.o},
{from:"document_visible",F:"document_visible",action:this.j},{from:"document_foregrounded",F:"document_visible",action:this.j},{from:"document_foregrounded",F:"document_hidden",action:this.i},{from:"document_foregrounded",F:"document_foregrounded",action:this.o},{from:"document_hidden",F:"document_visible",action:this.j},{from:"document_hidden",F:"document_backgrounded",action:this.m},{from:"document_hidden",F:"document_hidden",action:this.i},{from:"document_backgrounded",F:"document_hidden",action:this.i},
{from:"document_backgrounded",F:"document_backgrounded",action:this.m},{from:"document_backgrounded",F:"document_visible",action:this.j}];document.addEventListener("visibilitychange",function(c){"visible"===document.visibilityState?b.transition("document_visible",{event:c}):b.transition("document_hidden",{event:c})});
M("visibility_lifecycles_dynamic_backgrounding")&&(window.addEventListener("blur",function(c){b.transition("document_backgrounded",{event:c})}),window.addEventListener("focus",function(c){b.transition("document_foregrounded",{event:c})}))}
u(Uv,Rv);Uv.prototype.j=function(a,b){a(null==b?void 0:b.event);M("visibility_lifecycles_dynamic_backgrounding")&&this.transition("document_foregrounded")};
Uv.prototype.i=function(a,b){a(null==b?void 0:b.event);M("visibility_lifecycles_dynamic_backgrounding")&&this.transition("document_backgrounded")};
Uv.prototype.m=function(a,b){a(null==b?void 0:b.event)};
Uv.prototype.o=function(a,b){a(null==b?void 0:b.event)};function Vv(){this.i=new Tv;this.j=new Uv}
Vv.prototype.install=function(){var a=Ja.apply(0,arguments);this.i.install.apply(this.i,ia(a));this.j.install.apply(this.j,ia(a))};function Wv(){Vv.call(this);var a={};this.install((a.document_disposed={callback:this.l},a));a={};this.install((a.flush_logs={callback:this.m},a))}
var Xv;u(Wv,Vv);Wv.prototype.m=function(){if(M("web_fp_via_jspb")){var a=new sj,b=$r();b&&D(a,1,b);b=new Pj;be(b,sj,380,kk,a);hr(b);M("web_fp_via_jspb_and_json")&&cm("finalPayload",{csn:$r()})}else cm("finalPayload",{csn:$r()})};
Wv.prototype.l=function(){Mr(Nr)};function Yv(){}
Yv.getInstance=function(){var a=B("ytglobal.storage_");a||(a=new Yv,A("ytglobal.storage_",a));return a};
Yv.prototype.estimate=function(){var a,b,c;return x(function(d){a=navigator;return(null==(b=a.storage)?0:b.estimate)?d.return(a.storage.estimate()):(null==(c=a.webkitTemporaryStorage)?0:c.queryUsageAndQuota)?d.return(Zv()):d.return()})};
function Zv(){var a=navigator;return new Promise(function(b,c){var d;null!=(d=a.webkitTemporaryStorage)&&d.queryUsageAndQuota?a.webkitTemporaryStorage.queryUsageAndQuota(function(e,f){b({usage:e,quota:f})},function(e){c(e)}):c(Error("webkitTemporaryStorage is not supported."))})}
A("ytglobal.storageClass_",Yv);function am(a,b){var c=this;this.handleError=a;this.i=b;this.j=!1;void 0===self.document||self.addEventListener("beforeunload",function(){c.j=!0});
this.l=Math.random()<=Ek("ytidb_transaction_ended_event_rate_limit_session",.2)}
am.prototype.logEvent=function(a,b){switch(a){case "IDB_DATA_CORRUPTED":M("idb_data_corrupted_killswitch")||this.i("idbDataCorrupted",b);break;case "IDB_UNEXPECTEDLY_CLOSED":this.i("idbUnexpectedlyClosed",b);break;case "IS_SUPPORTED_COMPLETED":M("idb_is_supported_completed_killswitch")||this.i("idbIsSupportedCompleted",b);break;case "QUOTA_EXCEEDED":$v(this,b);break;case "TRANSACTION_ENDED":this.l&&Math.random()<=Ek("ytidb_transaction_ended_event_rate_limit_transaction",.1)&&this.i("idbTransactionEnded",
b);break;case "TRANSACTION_UNEXPECTEDLY_ABORTED":a=Object.assign({},b,{hasWindowUnloaded:this.j}),this.i("idbTransactionAborted",a)}};
function $v(a,b){Yv.getInstance().estimate().then(function(c){c=Object.assign({},b,{isSw:void 0===self.document,isIframe:self!==self.top,deviceStorageUsageMbytes:aw(null==c?void 0:c.usage),deviceStorageQuotaMbytes:aw(null==c?void 0:c.quota)});a.i("idbQuotaExceeded",c)})}
function aw(a){return"undefined"===typeof a?"-1":String(Math.ceil(a/1048576))}
;function bw(a,b,c){J.call(this);var d=this;c=c||L("POST_MESSAGE_ORIGIN")||window.document.location.protocol+"//"+window.document.location.hostname;this.l=b||null;this.targetOrigin="*";this.m=c;this.sessionId=null;this.channel="widget";this.H=!!a;this.u=function(e){a:if(!("*"!=d.m&&e.origin!=d.m||d.l&&e.source!=d.l||"string"!==typeof e.data)){try{var f=JSON.parse(e.data)}catch(g){break a}if(!(null==f||d.H&&(d.sessionId&&d.sessionId!=f.id||d.channel&&d.channel!=f.channel))&&f)switch(f.event){case "listening":"null"!=
e.origin&&(d.m=d.targetOrigin=e.origin);d.l=e.source;d.sessionId=f.id;d.j&&(d.j(),d.j=null);break;case "command":d.o&&(!d.s||0<=eb(d.s,f.func))&&d.o(f.func,f.args,e.origin)}}};
this.s=this.j=this.o=null;window.addEventListener("message",this.u)}
u(bw,J);bw.prototype.sendMessage=function(a,b){if(b=b||this.l){this.sessionId&&(a.id=this.sessionId);this.channel&&(a.channel=this.channel);try{var c=JSON.stringify(a);b.postMessage(c,this.targetOrigin)}catch(d){Lk(d)}}};
bw.prototype.D=function(){window.removeEventListener("message",this.u);J.prototype.D.call(this)};function cw(){this.j=[];this.isReady=!1;this.l={};var a=this.i=new bw(!!L("WIDGET_ID_ENFORCE")),b=this.fd.bind(this);a.o=b;a.s=null;this.i.channel="widget";if(a=L("WIDGET_ID"))this.i.sessionId=a}
l=cw.prototype;l.fd=function(a,b,c){"addEventListener"===a&&b?(a=b[0],this.l[a]||"onReady"===a||(this.addEventListener(a,dw(this,a)),this.l[a]=!0)):this.Nb(a,b,c)};
l.Nb=function(){};
function dw(a,b){return function(c){return a.sendMessage(b,c)}}
l.addEventListener=function(){};
l.Sc=function(){this.isReady=!0;this.sendMessage("initialDelivery",this.wb());this.sendMessage("onReady");fb(this.j,this.tc,this);this.j=[]};
l.wb=function(){return null};
function ew(a,b){a.sendMessage("infoDelivery",b)}
l.tc=function(a){this.isReady?this.i.sendMessage(a):this.j.push(a)};
l.sendMessage=function(a,b){this.tc({event:a,info:void 0===b?null:b})};
l.dispose=function(){this.i=null};var fw={},gw=(fw["api.invalidparam"]=2,fw.auth=150,fw["drm.auth"]=150,fw["heartbeat.net"]=150,fw["heartbeat.servererror"]=150,fw["heartbeat.stop"]=150,fw["html5.unsupportedads"]=5,fw["fmt.noneavailable"]=5,fw["fmt.decode"]=5,fw["fmt.unplayable"]=5,fw["html5.missingapi"]=5,fw["html5.unsupportedlive"]=5,fw["drm.unavailable"]=5,fw["mrm.blocked"]=151,fw);var hw=new Set("endSeconds startSeconds mediaContentUrl suggestedQuality videoId rct rctn".split(" "));function iw(a){return(0===a.search("cue")||0===a.search("load"))&&"loadModule"!==a}
function jw(a,b,c){if("string"===typeof a)return{videoId:a,startSeconds:b,suggestedQuality:c};b={};c=p(hw);for(var d=c.next();!d.done;d=c.next())d=d.value,a[d]&&(b[d]=a[d]);return b}
function kw(a,b,c,d){if(Qa(a)&&!Array.isArray(a)){b="playlist list listType index startSeconds suggestedQuality".split(" ");c={};for(d=0;d<b.length;d++){var e=b[d];a[e]&&(c[e]=a[e])}return c}b={index:b,startSeconds:c,suggestedQuality:d};"string"===typeof a&&16===a.length?b.list="PL"+a:b.playlist=a;return b}
;function lw(a){cw.call(this);this.listeners=[];this.api=a;this.addEventListener("onReady",this.onReady.bind(this));this.addEventListener("onVideoProgress",this.qd.bind(this));this.addEventListener("onVolumeChange",this.rd.bind(this));this.addEventListener("onApiChange",this.ld.bind(this));this.addEventListener("onPlaybackQualityChange",this.nd.bind(this));this.addEventListener("onPlaybackRateChange",this.od.bind(this));this.addEventListener("onStateChange",this.pd.bind(this));this.addEventListener("onWebglSettingsChanged",
this.sd.bind(this))}
u(lw,cw);l=lw.prototype;
l.Nb=function(a,b,c){if(this.api.isExternalMethodAvailable(a,c)){b=b||[];if(0<b.length&&iw(a)){var d=b;if(Qa(d[0])&&!Array.isArray(d[0]))var e=d[0];else switch(e={},a){case "loadVideoById":case "cueVideoById":e=jw(d[0],void 0!==d[1]?Number(d[1]):void 0,d[2]);break;case "loadVideoByUrl":case "cueVideoByUrl":e=d[0];"string"===typeof e&&(e={mediaContentUrl:e,startSeconds:void 0!==d[1]?Number(d[1]):void 0,suggestedQuality:d[2]});b:{if((d=e.mediaContentUrl)&&(d=/\/([ve]|embed)\/([^#?]+)/.exec(d))&&d[2]){d=
d[2];break b}d=null}e.videoId=d;e=jw(e);break;case "loadPlaylist":case "cuePlaylist":e=kw(d[0],d[1],d[2],d[3])}b.length=1;b[0]=e}this.api.handleExternalCall(a,b,c);iw(a)&&ew(this,this.wb())}};
l.onReady=function(){var a=this.Sc.bind(this);this.i.j=a;a=this.api.getVideoData();if(!a.isPlayable){a=a.errorCode;var b=void 0===b?5:b;this.sendMessage("onError",(a?gw[a]||b:b).toString())}};
l.addEventListener=function(a,b){this.listeners.push({eventType:a,listener:b});this.api.addEventListener(a,b)};
l.wb=function(){if(!this.api)return null;var a=this.api.getApiInterface();mb(a,"getVideoData");for(var b={apiInterface:a},c=0,d=a.length;c<d;c++){var e=a[c];if(0===e.search("get")||0===e.search("is")){var f=0;0===e.search("get")?f=3:0===e.search("is")&&(f=2);f=e.charAt(f).toLowerCase()+e.substr(f+1);try{var g=this.api[e]();b[f]=g}catch(h){}}}b.videoData=this.api.getVideoData();b.currentTimeLastUpdated_=Date.now()/1E3;return b};
l.pd=function(a){a={playerState:a,currentTime:this.api.getCurrentTime(),duration:this.api.getDuration(),videoData:this.api.getVideoData(),videoStartBytes:0,videoBytesTotal:this.api.getVideoBytesTotal(),videoLoadedFraction:this.api.getVideoLoadedFraction(),playbackQuality:this.api.getPlaybackQuality(),availableQualityLevels:this.api.getAvailableQualityLevels(),currentTimeLastUpdated_:Date.now()/1E3,playbackRate:this.api.getPlaybackRate(),mediaReferenceTime:this.api.getMediaReferenceTime()};this.api.getVideoUrl&&
(a.videoUrl=this.api.getVideoUrl());this.api.getVideoContentRect&&(a.videoContentRect=this.api.getVideoContentRect());this.api.getProgressState&&(a.progressState=this.api.getProgressState());this.api.getPlaylist&&(a.playlist=this.api.getPlaylist());this.api.getPlaylistIndex&&(a.playlistIndex=this.api.getPlaylistIndex());this.api.getStoryboardFormat&&(a.storyboardFormat=this.api.getStoryboardFormat());ew(this,a)};
l.nd=function(a){ew(this,{playbackQuality:a})};
l.od=function(a){ew(this,{playbackRate:a})};
l.ld=function(){for(var a=this.api.getOptions(),b={namespaces:a},c=0,d=a.length;c<d;c++){var e=a[c],f=this.api.getOptions(e);b[e]={options:f};for(var g=0,h=f.length;g<h;g++){var k=f[g],m=this.api.getOption(e,k);b[e][k]=m}}this.sendMessage("apiInfoDelivery",b)};
l.rd=function(){ew(this,{muted:this.api.isMuted(),volume:this.api.getVolume()})};
l.qd=function(a){a={currentTime:a,videoBytesLoaded:this.api.getVideoBytesLoaded(),videoLoadedFraction:this.api.getVideoLoadedFraction(),currentTimeLastUpdated_:Date.now()/1E3,playbackRate:this.api.getPlaybackRate(),mediaReferenceTime:this.api.getMediaReferenceTime()};this.api.getProgressState&&(a.progressState=this.api.getProgressState());ew(this,a)};
l.sd=function(){var a={sphericalProperties:this.api.getSphericalProperties()};ew(this,a)};
l.dispose=function(){cw.prototype.dispose.call(this);for(var a=0;a<this.listeners.length;a++){var b=this.listeners[a];this.api.removeEventListener(b.eventType,b.listener)}this.listeners=[]};function mw(a){J.call(this);this.j={};this.started=!1;this.connection=a;this.connection.subscribe("command",this.nc,this)}
u(mw,J);l=mw.prototype;l.start=function(){this.started||this.i()||(this.started=!0,this.connection.Aa("RECEIVING"))};
l.Aa=function(a,b){this.started&&!this.i()&&this.connection.Aa(a,b)};
l.nc=function(a,b,c){if(this.started&&!this.i()){var d=b||{};switch(a){case "addEventListener":"string"===typeof d.event&&this.addListener(d.event);break;case "removeEventListener":"string"===typeof d.event&&this.removeListener(d.event);break;default:this.api.isReady()&&this.api.isExternalMethodAvailable(a,c||null)&&(b=nw(a,b||{}),c=this.api.handleExternalCall(a,b,c||null),(c=ow(a,c))&&this.Aa(a,c))}}};
l.addListener=function(a){if(!(a in this.j)){var b=this.md.bind(this,a);this.j[a]=b;this.addEventListener(a,b)}};
l.md=function(a,b){this.started&&!this.i()&&this.connection.Aa(a,this.vb(a,b))};
l.vb=function(a,b){if(null!=b)return{value:b}};
l.removeListener=function(a){a in this.j&&(this.removeEventListener(a,this.j[a]),delete this.j[a])};
l.D=function(){var a=this.connection;a.i()||ti(a.j,"command",this.nc,this);this.connection=null;for(var b in this.j)this.j.hasOwnProperty(b)&&this.removeListener(b);J.prototype.D.call(this)};function pw(a,b){mw.call(this,b);this.api=a;this.start()}
u(pw,mw);pw.prototype.addEventListener=function(a,b){this.api.addEventListener(a,b)};
pw.prototype.removeEventListener=function(a,b){this.api.removeEventListener(a,b)};
function nw(a,b){switch(a){case "loadVideoById":return a=jw(b),[a];case "cueVideoById":return a=jw(b),[a];case "loadVideoByPlayerVars":return[b];case "cueVideoByPlayerVars":return[b];case "loadPlaylist":return a=kw(b),[a];case "cuePlaylist":return a=kw(b),[a];case "seekTo":return[b.seconds,b.allowSeekAhead];case "playVideoAt":return[b.index];case "setVolume":return[b.volume];case "setPlaybackQuality":return[b.suggestedQuality];case "setPlaybackRate":return[b.suggestedRate];case "setLoop":return[b.loopPlaylists];
case "setShuffle":return[b.shufflePlaylist];case "getOptions":return[b.module];case "getOption":return[b.module,b.option];case "setOption":return[b.module,b.option,b.value];case "handleGlobalKeyDown":return[b.keyCode,b.shiftKey,b.ctrlKey,b.altKey,b.metaKey,b.key,b.code]}return[]}
function ow(a,b){switch(a){case "isMuted":return{muted:b};case "getVolume":return{volume:b};case "getPlaybackRate":return{playbackRate:b};case "getAvailablePlaybackRates":return{availablePlaybackRates:b};case "getVideoLoadedFraction":return{videoLoadedFraction:b};case "getPlayerState":return{playerState:b};case "getCurrentTime":return{currentTime:b};case "getPlaybackQuality":return{playbackQuality:b};case "getAvailableQualityLevels":return{availableQualityLevels:b};case "getDuration":return{duration:b};
case "getVideoUrl":return{videoUrl:b};case "getVideoEmbedCode":return{videoEmbedCode:b};case "getPlaylist":return{playlist:b};case "getPlaylistIndex":return{playlistIndex:b};case "getOptions":return{options:b};case "getOption":return{option:b}}}
pw.prototype.vb=function(a,b){switch(a){case "onReady":return;case "onStateChange":return{playerState:b};case "onPlaybackQualityChange":return{playbackQuality:b};case "onPlaybackRateChange":return{playbackRate:b};case "onError":return{errorCode:b}}return mw.prototype.vb.call(this,a,b)};
pw.prototype.D=function(){mw.prototype.D.call(this);delete this.api};function qw(a){a=void 0===a?!1:a;J.call(this);this.j=new K(a);se(this,this.j)}
Za(qw,J);qw.prototype.subscribe=function(a,b,c){return this.i()?0:this.j.subscribe(a,b,c)};
qw.prototype.m=function(a,b){this.i()||this.j.va.apply(this.j,arguments)};function rw(a,b,c){qw.call(this);this.l=a;this.destination=b;this.id=c}
u(rw,qw);rw.prototype.Aa=function(a,b){this.i()||this.l.Aa(this.destination,this.id,a,b)};
rw.prototype.D=function(){this.destination=this.l=null;qw.prototype.D.call(this)};function sw(a,b,c){J.call(this);this.destination=a;this.origin=c;this.j=Vp(window,"message",this.l.bind(this));this.connection=new rw(this,a,b);se(this,this.connection)}
u(sw,J);sw.prototype.Aa=function(a,b,c,d){this.i()||a!==this.destination||(a={id:b,command:c},d&&(a.data=d),this.destination.postMessage(JSON.stringify(a),this.origin))};
sw.prototype.l=function(a){if(!this.i()&&a.origin===this.origin){var b=a.data;if("string"===typeof b){try{b=JSON.parse(b)}catch(d){return}if(b.command){var c=this.connection;c.i()||c.m("command",b.command,b.data,a.origin)}}}};
sw.prototype.D=function(){Wp(this.j);this.destination=null;J.prototype.D.call(this)};function tw(a){a=a||{};var b={},c={};this.url=a.url||"";this.args=a.args||vb(b);this.assets=a.assets||{};this.attrs=a.attrs||vb(c);this.fallback=a.fallback||null;this.fallbackMessage=a.fallbackMessage||null;this.html5=!!a.html5;this.disable=a.disable||{};this.loaded=!!a.loaded;this.messages=a.messages||{}}
tw.prototype.clone=function(){var a=new tw,b;for(b in this)if(this.hasOwnProperty(b)){var c=this[b];"object"==Oa(c)?a[b]=vb(c):a[b]=c}return a};var uw=/cssbin\/(?:debug-)?([a-zA-Z0-9_-]+?)(?:-2x|-web|-rtl|-vfl|.css)/;function vw(a){a=a||"";if(window.spf){var b=a.match(uw);spf.style.load(a,b?b[1]:"",void 0)}else ww(a)}
function ww(a){var b=xw(a),c=document.getElementById(b),d=c&&ov(c,"loaded");d||c&&!d||(c=yw(a,b,function(){ov(c,"loaded")||(mv(c),kq(b),dl(Ya(lq,b),0))}))}
function yw(a,b,c){var d=document.createElement("link");d.id=b;d.onload=function(){c&&setTimeout(c,0)};
a=Lb(a);gc(d,a);(document.getElementsByTagName("head")[0]||document.body).appendChild(d);return d}
function xw(a){var b=lf("A");Db("This URL is never added to the DOM");fc(b,new Ob(a,Pb));a=b.href.replace(/^[a-zA-Z]+:\/\//,"//");return"css-"+kc(a)}
;function zw(){J.call(this);this.j=[]}
u(zw,J);zw.prototype.D=function(){for(;this.j.length;){var a=this.j.pop();a.target.removeEventListener(a.name,a.callback,void 0)}J.prototype.D.call(this)};function Aw(){zw.apply(this,arguments)}
u(Aw,zw);function Bw(a,b,c,d,e){J.call(this);var f=this;this.u=b;this.webPlayerContextConfig=d;this.Wa=e;this.ea=!1;this.api={};this.X=this.s=null;this.L=new K;this.j={};this.R=this.Y=this.elementId=this.wa=this.config=null;this.P=!1;this.m=this.H=null;this.la={};this.Xa=["onReady"];this.lastError=null;this.Ja=NaN;this.K={};this.Ya=new Aw(this);this.T=0;this.l=this.o=a;se(this,this.L);Cw(this);Dw(this);se(this,this.Ya);c?this.T=dl(function(){f.loadNewVideoConfig(c)},0):d&&(Ew(this),Fw(this))}
u(Bw,J);l=Bw.prototype;l.getId=function(){return this.u};
l.loadNewVideoConfig=function(a){if(!this.i()){this.T&&(window.clearTimeout(this.T),this.T=0);var b=a||{};b instanceof tw||(b=new tw(b));this.config=b;this.setConfig(a);Fw(this);this.isReady()&&Gw(this)}};
function Ew(a){var b;a.webPlayerContextConfig?b=a.webPlayerContextConfig.rootElementId:b=a.config.attrs.id;a.elementId=b||a.elementId;"video-player"===a.elementId&&(a.elementId=a.u,a.webPlayerContextConfig?a.webPlayerContextConfig.rootElementId=a.u:a.config.attrs.id=a.u);var c;(null==(c=a.l)?void 0:c.id)===a.elementId&&(a.elementId+="-player",a.webPlayerContextConfig?a.webPlayerContextConfig.rootElementId=a.elementId:a.config.attrs.id=a.elementId)}
l.setConfig=function(a){this.wa=a;this.config=Hw(a);Ew(this);if(!this.Y){var b;this.Y=Iw(this,(null==(b=this.config.args)?void 0:b.jsapicallback)||"onYouTubePlayerReady")}this.config.args?this.config.args.jsapicallback=null:this.config.args={jsapicallback:null};var c;if(null==(c=this.config)?0:c.attrs)a=this.config.attrs,(b=a.width)&&this.l&&(this.l.style.width=Qh(Number(b)||b)),(a=a.height)&&this.l&&(this.l.style.height=Qh(Number(a)||a))};
function Gw(a){if(a.config&&!0!==a.config.loaded)if(a.config.loaded=!0,!a.config.args||"0"!==a.config.args.autoplay&&0!==a.config.args.autoplay&&!1!==a.config.args.autoplay){var b;a.api.loadVideoByPlayerVars(null!=(b=a.config.args)?b:null)}else a.api.cueVideoByPlayerVars(a.config.args)}
function Jw(a){var b=!0,c=Kw(a);c&&a.config&&(a=Lw(a),b=ov(c,"version")===a);return b&&!!B("yt.player.Application.create")}
function Fw(a){if(!a.i()&&!a.P){var b=Jw(a);if(b&&"html5"===(Kw(a)?"html5":null))a.R="html5",a.isReady()||Mw(a);else if(Nw(a),a.R="html5",b&&a.m&&a.o)a.o.appendChild(a.m),Mw(a);else{a.config&&(a.config.loaded=!0);var c=!1;a.H=function(){c=!0;var d=Ow(a,"player_bootstrap_method")?B("yt.player.Application.createAlternate")||B("yt.player.Application.create"):B("yt.player.Application.create");var e=a.config?Hw(a.config):void 0;d&&d(a.o,e,a.webPlayerContextConfig,a.Wa);Mw(a)};
a.P=!0;b?a.H():(sv(Lw(a),a.H),(b=Pw(a))&&vw(b),Qw(a)&&!c&&A("yt.player.Application.create",null))}}}
function Kw(a){var b=kf(a.elementId);!b&&a.l&&a.l.querySelector&&(b=a.l.querySelector("#"+a.elementId));return b}
function Mw(a){if(!a.i()){var b=Kw(a),c=!1;b&&b.getApiInterface&&b.getApiInterface()&&(c=!0);if(c){a.P=!1;if(!Ow(a,"html5_remove_not_servable_check_killswitch")){var d;if((null==b?0:b.isNotServable)&&a.config&&(null==b?0:b.isNotServable(null==(d=a.config.args)?void 0:d.video_id)))return}Rw(a)}else a.Ja=dl(function(){Mw(a)},50)}}
function Rw(a){Cw(a);a.ea=!0;var b=Kw(a);if(b){a.s=Sw(a,b,"addEventListener");a.X=Sw(a,b,"removeEventListener");var c=b.getApiInterface();c=c.concat(b.getInternalApiInterface());for(var d=a.api,e=0;e<c.length;e++){var f=c[e];d[f]||(d[f]=Sw(a,b,f))}}for(var g in a.j)a.j.hasOwnProperty(g)&&a.s&&a.s(g,a.j[g]);Gw(a);a.Y&&a.Y(a.api);a.L.va("onReady",a.api)}
function Sw(a,b,c){var d=b[c];return function(){var e=Ja.apply(0,arguments);try{return a.lastError=null,d.apply(b,e)}catch(f){"sendAbandonmentPing"!==c&&(f.params=c,a.lastError=f,Ir(f))}}}
function Cw(a){a.ea=!1;if(a.X)for(var b in a.j)a.j.hasOwnProperty(b)&&a.X(b,a.j[b]);for(var c in a.K)a.K.hasOwnProperty(c)&&window.clearTimeout(Number(c));a.K={};a.s=null;a.X=null;b=a.api;for(var d in b)b.hasOwnProperty(d)&&(b[d]=null);b.addEventListener=function(e,f){a.addEventListener(e,f)};
b.removeEventListener=function(e,f){a.removeEventListener(e,f)};
b.destroy=function(){a.dispose()};
b.getLastError=function(){return a.getLastError()};
b.getPlayerType=function(){return a.getPlayerType()};
b.getCurrentVideoConfig=function(){return a.wa};
b.loadNewVideoConfig=function(e){a.loadNewVideoConfig(e)};
b.isReady=function(){return a.isReady()}}
l.isReady=function(){return this.ea};
function Dw(a){a.addEventListener("WATCH_LATER_VIDEO_ADDED",function(b){kq("WATCH_LATER_VIDEO_ADDED",b)});
a.addEventListener("WATCH_LATER_VIDEO_REMOVED",function(b){kq("WATCH_LATER_VIDEO_REMOVED",b)})}
l.addEventListener=function(a,b){var c=this,d=Iw(this,b);d&&(0<=eb(this.Xa,a)||this.j[a]||(b=Tw(this,a),this.s&&this.s(a,b)),this.L.subscribe(a,d),"onReady"===a&&this.isReady()&&dl(function(){d(c.api)},0))};
l.removeEventListener=function(a,b){this.i()||(b=Iw(this,b))&&ti(this.L,a,b)};
function Iw(a,b){var c=b;if("string"===typeof b){if(a.la[b])return a.la[b];c=function(){var d=Ja.apply(0,arguments),e=B(b);if(e)try{e.apply(z,d)}catch(f){Hr(f)}};
a.la[b]=c}return c?c:null}
function Tw(a,b){var c="ytPlayer"+b+a.u;a.j[b]=c;z[c]=function(d){var e=dl(function(){if(!a.i()){try{a.L.va(b,null!=d?d:void 0)}catch(h){Ir(new P("PlayerProxy error when creating global callback",{error:h,event:b,playerId:a.u,data:d}))}var f=a.K,g=String(e);g in f&&delete f[g]}},0);
sb(a.K,String(e))};
return c}
l.getPlayerType=function(){return this.R||(Kw(this)?"html5":null)};
l.getLastError=function(){return this.lastError};
function Nw(a){a.cancel();Cw(a);a.R=null;a.config&&(a.config.loaded=!1);var b=Kw(a);b&&(Jw(a)||!Qw(a)?a.m=b:(b&&b.destroy&&b.destroy(),a.m=null));if(a.o)for(a=a.o;b=a.firstChild;)a.removeChild(b)}
l.cancel=function(){this.H&&yv(Lw(this),this.H);window.clearTimeout(this.Ja);this.P=!1};
l.D=function(){Nw(this);if(this.m&&this.config&&this.m.destroy)try{this.m.destroy()}catch(b){Hr(b)}this.la=null;for(var a in this.j)this.j.hasOwnProperty(a)&&(z[this.j[a]]=null);this.wa=this.config=this.api=null;delete this.o;delete this.l;J.prototype.D.call(this)};
function Qw(a){var b,c;a=null==(b=a.config)?void 0:null==(c=b.args)?void 0:c.fflags;return!!a&&-1!==a.indexOf("player_destroy_old_version=true")}
function Lw(a){return a.webPlayerContextConfig?a.webPlayerContextConfig.jsUrl:(a=a.config.assets)?a.js:""}
function Pw(a){return a.webPlayerContextConfig?a.webPlayerContextConfig.cssUrl:(a=a.config.assets)?a.css:""}
function Ow(a,b){if(a.webPlayerContextConfig)var c=a.webPlayerContextConfig.serializedExperimentFlags;else{var d;if(null==(d=a.config)?0:d.args)c=a.config.args.fflags}return"true"===Rk(c||"","&")[b]}
function Hw(a){for(var b={},c=p(Object.keys(a)),d=c.next();!d.done;d=c.next()){d=d.value;var e=a[d];b[d]="object"===typeof e?vb(e):e}return b}
;var Uw={},Vw="player_uid_"+(1E9*Math.random()>>>0);function Ww(a,b){var c="player",d=!1;d=void 0===d?!0:d;c="string"===typeof c?kf(c):c;var e=Vw+"_"+Ra(c),f=Uw[e];if(f&&d)return Xw(a,b)?f.api.loadVideoByPlayerVars(a.args||null):f.loadNewVideoConfig(a),f.api;f=new Bw(c,e,a,b,void 0);Uw[e]=f;kq("player-added",f.api);te(f,function(){delete Uw[f.getId()]});
return f.api}
function Xw(a,b){return b&&b.serializedExperimentFlags?b.serializedExperimentFlags.includes("web_player_remove_playerproxy=true"):a&&a.args&&a.args.fflags?a.args.fflags.includes("web_player_remove_playerproxy=true"):!1}
;var Yw=null,Zw=null,$w=null;function ax(){bx()}
function cx(){bx()}
function bx(){var a=Yw.getVideoData(1);a=a.title?a.title+" - YouTube":"YouTube";document.title!==a&&(document.title=a)}
function dx(){Yw&&Yw.sendAbandonmentPing&&Yw.sendAbandonmentPing();L("PL_ATT")&&(M("use_player_abuse_bg_library")?Kv.dispose():Lv.dispose());for(var a=Xh,b=0,c=zv.length;b<c;b++)a.ga(zv[b]);zv.length=0;xv("//static.doubleclick.net/instream/ad_status.js");Av=!1;Bk("DCLKSTAT",0);re($w,Zw);Yw&&(Yw.removeEventListener("onVideoDataChange",ax),Yw.destroy())}
;function ex(a,b,c){a="ST-"+kc(a).toString(36);b=b?tc(b):"";c=c||5;ps()&&tl(a,b,c)}
;function fx(a,b,c){b=void 0===b?{}:b;c=void 0===c?!1:c;var d=L("EVENT_ID");d&&(b.ei||(b.ei=d));if(b){d=a;var e=void 0===e?!0:e;var f=L("VALID_SESSION_TEMPDATA_DOMAINS",[]),g=oc(window.location.href);g&&f.push(g);g=oc(d);if(0<=eb(f,g)||!g&&0==d.lastIndexOf("/",0))if(M("autoescape_tempdata_url")&&(f=document.createElement("a"),fc(f,d),d=f.href),d&&(d=pc(d),f=d.indexOf("#"),d=0>f?d:d.slice(0,f)))if(e&&!b.csn&&(b.itct||b.ved)&&(b=Object.assign({csn:$r()},b)),h){var h=parseInt(h,10);isFinite(h)&&0<h&&
ex(d,b,h)}else ex(d,b)}if(c)return!1;if((window.ytspf||{}).enabled)spf.navigate(a);else{var k=void 0===k?{}:k;var m=void 0===m?"":m;var q=void 0===q?window:q;c=q.location;a=vc(a,k)+m;var r=void 0===r?Ph:r;a:{r=void 0===r?Ph:r;for(k=0;k<r.length;++k)if(m=r[k],m instanceof Nh&&m.isValid(a)){r=new Ob(a,Pb);break a}r=void 0}r=r||Sb;if(r instanceof Ob)var w=Qb(r);else{b:if(Fh){try{w=new URL(r)}catch(t){w="https:";break b}w=w.protocol}else c:{w=document.createElement("a");try{w.href=r}catch(t){w=void 0;
break c}w=w.protocol;w=":"===w||""===w?"https:":w}w="javascript:"!==w?r:void 0}void 0!==w&&(c.href=w)}return!0}
;A("yt.setConfig",Bk);A("yt.config.set",Bk);A("yt.setMsg",es);A("yt.msgs.set",es);A("yt.logging.errors.log",Hr);
A("writeEmbed",function(){var a=L("PLAYER_CONFIG");if(!a){var b=L("PLAYER_VARS");b&&(a={args:b})}zs(!0);"gvn"===a.args.ps&&(document.body.style.backgroundColor="transparent");a.attrs||(a.attrs={width:"100%",height:"100%",id:"video-player"});var c=document.referrer;b=L("POST_MESSAGE_ORIGIN");window!==window.top&&c&&c!==document.URL&&(a.args.loaderUrl=c);au();c=L("WEB_PLAYER_CONTEXT_CONFIGS").WEB_PLAYER_CONTEXT_CONFIG_ID_EMBEDDED_PLAYER;if(!c.serializedForcedExperimentIds){var d=Wk(window.location.href);
d.forced_experiments&&(c.serializedForcedExperimentIds=d.forced_experiments)}Yw=Ww(a,c);Yw.addEventListener("onVideoDataChange",ax);Yw.addEventListener("onReady",cx);a=L("POST_MESSAGE_ID","player");L("ENABLE_JS_API")?$w=new lw(Yw):L("ENABLE_POST_API")&&"string"===typeof a&&"string"===typeof b&&(Zw=new sw(window.parent,a,b),$w=new pw(Yw,Zw.connection));Bv();M("ytidb_create_logger_embed_killswitch")||M("embeds_web_disable_nwl")||$l();a={};Xv||(Xv=new Wv);Xv.install((a.flush_logs={callback:function(){Lq()}},
a));
M("embeds_web_disable_nwl")||np();M("ytidb_clear_embedded_player")&&Xh.V(function(){var e;if(!Ju){var f=Us(),g={Fb:Iu,yc:Hu};f.providers.set(g.Fb,g);g={Ub:{feedbackEndpoint:Vs(Du),modifyChannelNotificationPreferenceEndpoint:Vs(Eu),playlistEditEndpoint:Vs(Fu),subscribeEndpoint:Vs(Bu),unsubscribeEndpoint:Vs(Cu),webPlayerShareEntityServiceEndpoint:Vs(Gu)}};var h=Is.getInstance(),k={};h&&(k.client_location=h);if(void 0===m){As.i||(As.i=new As);var m=As.i}void 0===e&&(e=f.resolve(Iu));ou(g,e,m,k);m={Fb:uu,
zc:nu.i};f.providers.set(m.Fb,m);Ju=f.resolve(uu)}lv()})});
var gx=Jk(function(){hu();var a=xl.getInstance(),b=Al(119),c=1<window.devicePixelRatio;if(document.body&&gi(document.body,"exp-invert-logo"))if(c&&!gi(document.body,"inverted-hdpi")){var d=document.body;if(d.classList)d.classList.add("inverted-hdpi");else if(!gi(d,"inverted-hdpi")){var e=ei(d);fi(d,e+(0<e.length?" inverted-hdpi":"inverted-hdpi"))}}else!c&&gi(document.body,"inverted-hdpi")&&hi();if(b!=c){b="f"+(Math.floor(119/31)+1);d=Bl(b)||0;d=c?d|67108864:d&-67108865;0==d?delete wl[b]:(c=d.toString(16),
wl[b]=c.toString());c=!0;M("web_secure_pref_cookie_killswitch")&&(c=!1);b=a.i;d=[];for(var f in wl)d.push(f+"="+encodeURIComponent(String(wl[f])));tl(b,d.join("&"),63072E3,a.j,c)}Vu.i||(Vu.i=new Vu);a=Vu.i;f=16623;var g=void 0===g?{}:g;Object.values(fs).includes(f)||(Ir(new P("createClientScreen() called with a non-page VE",f)),f=83769);g.isHistoryNavigation||a.i.push({rootVe:f,key:g.key||""});a.s=[];a.N=[];g.Xb?Yu(a,f,g):Zu(a,f,g)}),hx=Jk(function(a){M("embeds_web_enable_dispose_player_if_page_not_cached_killswitch")?
dx():a.persisted||(bd?setTimeout(function(){dx()},0):dx())}),ix=Jk(dx);
window.addEventListener?(window.addEventListener("load",gx),bd?window.addEventListener("beforeunload",hx):window.addEventListener("pagehide",hx)):window.attachEvent&&(window.attachEvent("onload",gx),window.attachEvent("onunload",ix));A("yt.abuse.player.botguardInitialized",B("yt.abuse.player.botguardInitialized")||Mv);A("yt.abuse.player.invokeBotguard",B("yt.abuse.player.invokeBotguard")||Nv);A("yt.abuse.dclkstatus.checkDclkStatus",B("yt.abuse.dclkstatus.checkDclkStatus")||Cv);
A("yt.player.exports.navigate",B("yt.player.exports.navigate")||fx);A("yt.util.activity.init",B("yt.util.activity.init")||$p);A("yt.util.activity.getTimeSinceActive",B("yt.util.activity.getTimeSinceActive")||cq);A("yt.util.activity.setTimestamp",B("yt.util.activity.setTimestamp")||aq);}).call(this);
