from django.shortcuts import render
from django.http import HttpResponse
# Create your views here.

def index(request):
    return render(request, 'home.html', {'name':'home'})

def calc(request):

    val1 = int(request.POST['num1'])
    val2 = int(request.POST['num2'])
    
    res3 = val1 * val2
    return render(request, 'result.html', {'result':res3})

