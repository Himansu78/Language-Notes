
import os
from django.http.response import HttpResponse


def index(request):
    return HttpResponse('''<h1>Himansu<h1/> <a href="https://twitter.com/DM_Bhadrak?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor">Corona Vaccination updates<a/> ''')

def about(request):
    return HttpResponse('About Harry Porter')
