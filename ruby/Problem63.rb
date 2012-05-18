class Problem63

	def power_n(n)
		i = 1
		count = 0
		while i <= 9
			if (i ** n).to_s.length == n
				count = count + 1
			end
			i = i + 1
		end
		count
	end
end

p = Problem63.new
count = 0
i = 1
while p.power_n(i) > 0
	count = count + p.power_n(i)
	i = i + 1
end
puts count